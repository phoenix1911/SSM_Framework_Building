package com.jialong.core.controller;

import com.jialong.core.bean.Teacher;
import com.jialong.core.service.TeacherService;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
@RequestMapping("/admin/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("allTeacher")
    public String list(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, Model model) {


        List<Teacher> teachers = teacherService.selectAll();

        model.addAttribute("list", teachers);
        model.addAttribute("username", SecurityContextHolder.getContext().getAuthentication().getName());
        return "admin_v3";
    }

    /**
     * 跳转至更新页面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("toUpdate")
    public String toUpdate(Model model,@RequestParam(value = "tid") Integer tid) {
        model.addAttribute("teacher", teacherService.queryById(tid));
        return "admin_v3_update";
    }

    /**
     * 处理更新业务逻辑 返回到列表
     * @param model
     * @param teacher
     * @return
     */
    @RequestMapping("update")
    public String update(Model model, Teacher teacher) {
        teacherService.update(teacher);
        teacher = teacherService.queryById(teacher.getTid());
        model.addAttribute("teacher", teacher);
        return "redirect:/admin/teacher/allTeacher";
    }

    /**
     * 删除学生
     * @param id
     * @return
     */
    @RequestMapping("del")
    public String delete(@RequestParam("tid") int tid) {
        teacherService.deleteById(tid);
        return "redirect:/admin/teacher/allTeacher";
    }

    @RequestMapping("addone")
    public String insertone(Model model,Teacher teacher) {
        teacherService.insert(teacher);
        return "redirect:/admin/teacher/allTeacher";
    }

    @RequestMapping("addmany")
    public String insertmany(@RequestParam("uploadfile") CommonsMultipartFile file, HttpServletRequest request) {
        // MultipartFile是对当前上传的文件的封装，当要同时上传多个文件时，可以给定多个MultipartFile参数(数组)
        if (!file.isEmpty()) {
            String type = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));// 取文件格式后缀名
            String filename = System.currentTimeMillis() + type;// 取当前时间戳作为文件名
            String path = request.getSession().getServletContext().getRealPath("/file/admin/uploadTea/" + filename);// 存放位置
            File destFile = new File(path);

            try {
                // FileUtils.copyInputStreamToFile()这个方法里对IO进行了自动操作，不需要额外的再去关闭IO流
                FileUtils.copyInputStreamToFile(file.getInputStream(), destFile);// 复制临时文件到指定目录下

                InputStream inputStream = file.getInputStream();
                XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
                XSSFSheet sheet = workbook.getSheetAt(0);
                //获取行数
                int rowNum=sheet.getLastRowNum();
                Teacher teacher = null;
                for (Row row:sheet) {
                    //不读取表头
                    row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
                    row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
                    row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
                    row.getCell(3).setCellType(Cell.CELL_TYPE_STRING);
                    row.getCell(4).setCellType(Cell.CELL_TYPE_STRING);
                    if (("").equals(row.getCell(0).getStringCellValue())) {
                        break;
                    } else  {
                        if (row.getRowNum() == 0) {
                            continue;
                        }

                        String id = row.getCell(0).getStringCellValue();
                        String name = row.getCell(1).getStringCellValue();
                        String phonenumber = row.getCell(2).getStringCellValue();
                        String adress = row.getCell(3).getStringCellValue();
                        String sfz = row.getCell(4).getStringCellValue();

                        teacher = new Teacher(Integer.valueOf(id),name,Integer.valueOf(phonenumber),adress,Long.valueOf(sfz));
                        teacherService.insert(teacher);
                    }
                }
                inputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }



            return "redirect:/admin/teacher/allTeacher";
        } else {
            return "redirect:upload_error.jsp";
        }
    }

    /**
     * 下载教师信息模板
     * @param request
     * @param model
     * @return
     * @throws IOException
     */
    @RequestMapping("downloadTeaTemplate")
    public ResponseEntity<byte[]> download(HttpServletRequest request, Model model) throws IOException {

        String realPath = request.getSession().getServletContext().getRealPath("/file");
        System.err.println(realPath);
        File file = new File(realPath+"/template/TeacherTemplate.xlsx");//新建一个文件

        HttpHeaders headers = new HttpHeaders();//http头信息

        String downloadFileName = new String("教师信息模板.xlsx".getBytes("UTF-8"),"iso-8859-1");//设置编码

        headers.setContentDispositionFormData("attachment", downloadFileName);

        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        //MediaType:互联网媒介类型  contentType：具体请求中的媒体类型信息

        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);

    }




}
