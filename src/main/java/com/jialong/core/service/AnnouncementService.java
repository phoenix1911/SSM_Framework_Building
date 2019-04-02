package com.jialong.core.service;

import com.jialong.core.bean.Announcement;
import com.jialong.core.bean.AnnouncementExample;
import com.jialong.core.mapper.AnnouncementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tjl on 2019/4/1 11:00.
 */
@Service
public class AnnouncementService {
    @Autowired
    private AnnouncementMapper announcementMapper;

    public List<Announcement> selectByUsertype(String usertype) {
        AnnouncementExample announcementExample = new AnnouncementExample();
        AnnouncementExample.Criteria criteria = announcementExample.createCriteria();
        criteria.andUsertypeEqualTo(usertype);
        announcementExample.setOrderByClause("systemtime");
        return announcementMapper.selectByExample(announcementExample);
    }

    public List<Announcement> selectByAnnouncementtype(String announcementtype) {
        AnnouncementExample announcementExample = new AnnouncementExample();
        AnnouncementExample.Criteria criteria = announcementExample.createCriteria();
        criteria.andAnnouncementtypeEqualTo(announcementtype);
        announcementExample.setOrderByClause("systemtime");
        return announcementMapper.selectByExample(announcementExample);
    }


    public int add(Announcement announcement) {
        return announcementMapper.insert(announcement);
    }


}
