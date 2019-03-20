package com.jialong.security.mapper;

import com.jialong.security.bean.Resource;

import java.util.List;

public interface ResourceMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

    /**
     * 通过资源路径来获取什么角色有权限
     * @param res url路径
     * @return 返回角色列表
     */
    List<String> selectAuthByRes(String res);

    List<Resource> selectAll();
}
