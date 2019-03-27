package com.jialong.core.service;

import com.jialong.core.bean.Title;
import com.jialong.core.bean.TitleExample;
import com.jialong.core.bean.UserRoleExample;
import com.jialong.core.mapper.TitleMapper;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Tjl on 2019/3/26 14:17.
 */
@Service
public class TitleService {
    @Autowired
    private TitleMapper titleMapper;

    @Value("#{configProperties['filepath']}")
    private String filepath;


    /**
     * 获取所有论文题目
     * @return
     */
    public List<Title> selectAll() {
        return titleMapper.selectAll();
    }

    /**
     * 获取教师下所有论文题目
     * @param tid
     * @return
     */
    public List<Title> queryByTid(int tid) {
        TitleExample titleExample = new TitleExample();
        TitleExample.Criteria criteria = titleExample.createCriteria();
        criteria.andTidEqualTo(tid);
        return titleMapper.selectByExample(titleExample);
    }

    /**
     * 更新论文信息
     * update title set title = #{title,jdbcType=VARCHAR},
     *         isuploadrws = #{isuploadrws,jdbcType=INTEGER},
     *         rws = #{rws,jdbcType=VARCHAR},
     *         rwsState = #{rwsstate,jdbcType=VARCHAR}
     *     where id = #{id,jdbcType=INTEGER}
     * @param title
     * @return
     */
    public int update(Title title) {
        if (!("").equals(title.getRws())) {
            title.setIsuploadrws(1);
            title.setRwsstate("已上传");
        }
        return titleMapper.updateTitleAndRWSByPrimaryKey(title);
    }

    /**
     * 根据论文id查询
     * @param id
     * @return
     */
    public Title queryById(int id) {
        return titleMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除操作
     * @param id
     * @return
     */
    public int deleteById(int id) {
        String title1 = titleMapper.selectByPrimaryKey(id).getTitle();
//        File file = new File(filepath + "\\" + title1);

        delFolder(filepath + "\\title\\" + title1);

//        boolean delete = file.delete();
//        System.out.println(delete);
        return titleMapper.deleteByPrimaryKey(id);

    }
    private static void delFolder(String folderPath) {
        try {
            delAllFile(folderPath); //删除完里面所有内容
            String filePath = folderPath;
            filePath = filePath.toString();
            java.io.File myFilePath = new java.io.File(filePath);
            myFilePath.delete(); //删除空文件夹
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean delAllFile(String path) {
        boolean flag = false;
        File file = new File(path);
        if (!file.exists()) {
            return flag;
        }
        if (!file.isDirectory()) {
            return flag;
        }
        String[] tempList = file.list();
        File temp = null;
        for (int i = 0; i < tempList.length; i++) {
            if (path.endsWith(File.separator)) {
                temp = new File(path + tempList[i]);
            } else {
                temp = new File(path + File.separator + tempList[i]);
            }
            if (temp.isFile()) {
                temp.delete();
            }
            if (temp.isDirectory()) {
                delAllFile(path + "/" + tempList[i]);//先删除文件夹里面的文件
                delFolder(path + "/" + tempList[i]);//再删除空文件夹
                flag = true;
            }
        }
        return flag;
    }


    /**
     * 插入操作
     * @param title
     * @return
     */
    public int insert(Title title) {
        title.setSid(0);
        title.setKtbgstate("未上传");
        title.setIsuploadktbg(0);
        title.setZqbgstate("未上传");
        title.setIsuploadzqbg(0);
        title.setSmsstate("未上传");
        title.setIsuploadsms(0);
        if (title.getRws()== null) {
            title.setIsuploadrws(0);
            title.setRwsstate("未上传");
        }
        return titleMapper.insert(title);
    }

    public void uploadrws(CommonsMultipartFile file, Title title) {
        if (!file.isEmpty()) {
            String path = filepath + "\\title\\" + title.getTitle() + "\\" + file.getOriginalFilename();
            title.setRws("\\title\\" + title.getTitle() + "\\" + file.getOriginalFilename());
            title.setRwsstate("已上传");
            title.setIsuploadrws(1);
            File destFile = new File(path);

            try {
                FileUtils.copyInputStreamToFile(file.getInputStream(), destFile);// 复制临时文件到指定目录下
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
