package com.jialong.core.service;

import com.jialong.core.bean.Title;
import com.jialong.core.bean.TitleExample;
import com.jialong.core.bean.Weekly;
import com.jialong.core.bean.WeeklyExample;
import com.jialong.core.mapper.TitleMapper;
import com.jialong.core.mapper.WeeklyMapper;
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
public class WeeklyService {
    @Autowired
    private WeeklyMapper weeklyMapper;

    @Value("#{configProperties['filepath']}")
    private String filepath;

    public List<Weekly> selectWeeklyBySessionid(String sessionid) {
        return weeklyMapper.selectBySessionid(sessionid);

    }

}
