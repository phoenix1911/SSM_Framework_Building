package com.jialong.core.service;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

/**
 * Created by Tjl on 2019/3/27 9:44.
 */
@Service
public class BaseService {

    @Value("#{configProperties['filepath']}")
    private String filepath;

    public ResponseEntity<byte[]> getResponseEntity(String path) throws IOException {
        File file = new File(filepath+path);//新建一个文件

        HttpHeaders headers = new HttpHeaders();//http头信息

        String[] split = path.split("\\\\");

        String downloadFileName = new String(split[split.length-1].getBytes("UTF-8"),"iso-8859-1");//设置编码

        headers.setContentDispositionFormData("attachment", downloadFileName);

        //MediaType:互联网媒介类型  contentType：具体请求中的媒体类型信息
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
    }
}
