package com.jialong.core.controller;

import com.jialong.core.service.BaseService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by Tjl on 2019/4/2 11:09.
 */
@Controller
@RequestMapping("common")
public class CommonController {

    @Value("#{configProperties['filepath']}")
    private String filepath;

    @Autowired
    private BaseService baseService;

    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(@RequestParam("path")String path) throws IOException {
        return baseService.getResponseEntity(path);
    }
}
