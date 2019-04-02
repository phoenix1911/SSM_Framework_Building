package com.jialong.core.controller;

import com.jialong.core.bean.Student;
import com.jialong.core.service.StudentService;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Tjl on 2019/3/22 10:47.
 */
@Controller
@RequestMapping("/admin/student")
public class AdminManageStudentController {

    @Value("#{configProperties['filepath']}")
    private String filepath;

    @Autowired
    private StudentService studentService;

    /**
     * 显示所有学生
     */
    @RequestMapping("allStudent")
    public String list(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, Model model) {
        List<Student> students = studentService.selectAll();
        model.addAttribute("list", students);
        model.addAttribute("username", SecurityContextHolder.getContext().getAuthentication().getName());
        return "admin_v2";
    }

    /**
     * 跳转至更新页面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("toUpdate")
    public String toUpdate(Model model, int id) {
        model.addAttribute("student", studentService.queryById(id));
        return "admin_v2_update";
    }

    /**
     * 处理更新业务逻辑 返回到列表
     * @param model
     * @param student
     * @return
     */
    @RequestMapping("update")
    public String update(Model model, Student student) {
        studentService.update(student);
        student = studentService.queryById(student.getId());
        model.addAttribute("student", student);
        return "redirect:/admin/student/allStudent";
    }

    /**
     * 删除学生
     * @param id
     * @return
     */
    @RequestMapping("del")
    public String delete(@RequestParam("id") int id) {
        studentService.deleteById(id);
        return "redirect:/admin/student/allStudent";
    }

    @RequestMapping("addone")
    public String insertone(Model model,Student student) {
        studentService.insert(student);
        return "redirect:/admin/student/allStudent";
    }

    @RequestMapping("addmany")
    public String insertmany(@RequestParam("uploadfile") CommonsMultipartFile file, HttpServletRequest request) {
        // MultipartFile是对当前上传的文件的封装，当要同时上传多个文件时，可以给定多个MultipartFile参数(数组)
        if (!file.isEmpty()) {
            String type = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));// 取文件格式后缀名
            String filename = System.currentTimeMillis() + type;// 取当前时间戳作为文件名
            String path = filepath+"\\admin\\uploadStu\\" + filename;// 存放位置
            File destFile = new File(path);

            try {
                // FileUtils.copyInputStreamToFile()这个方法里对IO进行了自动操作，不需要额外的再去关闭IO流
                FileUtils.copyInputStreamToFile(file.getInputStream(), destFile);// 复制临时文件到指定目录下

                InputStream inputStream = file.getInputStream();
                XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
                XSSFSheet sheet = workbook.getSheetAt(0);
                //获取行数
                int rowNum=sheet.getLastRowNum();
                Student student = null;
                for (Row row:sheet) {
                    //不读取表头
                    if (("").equals(row.getCell(0).getStringCellValue())) {
                        break;
                    } else  {
                        if (row.getRowNum() == 0) {
                            continue;
                        }
                        row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
                        row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
                        row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
                        row.getCell(3).setCellType(Cell.CELL_TYPE_STRING);
                        row.getCell(4).setCellType(Cell.CELL_TYPE_STRING);
                        String id = row.getCell(0).getStringCellValue();
                        String name = row.getCell(1).getStringCellValue();
                        String phonenumber = row.getCell(2).getStringCellValue();
                        String email = row.getCell(3).getStringCellValue();
                        String sfz = row.getCell(4).getStringCellValue();

                        student = new Student(Integer.valueOf(id), name, Long.valueOf(phonenumber), email, 0, Long.valueOf(sfz));
                        studentService.insert(student);
                    }
                }
                inputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return "redirect:/admin/student/allStudent";
        } else {
            return "redirect:upload_error.jsp";
        }
    }


    /**
     * 下载学生信息模板
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("downloadStuTemplate")
    public ResponseEntity<byte[]> download(HttpServletRequest request) throws IOException {
        String realPath = request.getSession().getServletContext().getRealPath("/file");
        return studentService.getResponseEntity(realPath);
    }






}
