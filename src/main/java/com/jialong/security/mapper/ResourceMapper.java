package com.jialong.security.mapper;

import com.jialong.security.bean.Resource;
import com.jialong.security.bean.ResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceMapper {
    int countByExample(ResourceExample example);

    int deleteByExample(ResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Resource record);

    int insertSelective(Resource record);

    List<Resource> selectByExample(ResourceExample example);

    Resource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Resource record, @Param("example") ResourceExample example);

    int updateByExample(@Param("record") Resource record, @Param("example") ResourceExample example);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

    Resource selectByURL(String url);
    /**
     * 通过资源路径来获取什么角色有权限
     * @param res url路径
     * @return 返回角色列表
     */
    List<String> selectAuthByRes(String res);

    /**
     * 获取所有资源
     * @return
     */
    List<Resource> selectAll();
}