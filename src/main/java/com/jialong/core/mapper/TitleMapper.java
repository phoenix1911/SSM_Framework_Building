package com.jialong.core.mapper;

import com.jialong.core.bean.Title;
import com.jialong.core.bean.TitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TitleMapper {
    int countByExample(TitleExample example);

    int deleteByExample(TitleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Title record);

    int insertSelective(Title record);

    List<Title> selectByExample(TitleExample example);

    Title selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByExample(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByPrimaryKeySelective(Title record);

    int updateByPrimaryKey(Title record);

    /**
     * 查找所有
     * @return
     */
    List<Title> selectAll();

    /**
     * 更新标题 及任务书路径
     * update title
     *     set title = #{title,jdbcType=VARCHAR},
     *         isuploadrws = #{isuploadrws,jdbcType=INTEGER},
     *         rws = #{rws,jdbcType=VARCHAR},
     *         rwsState = #{rwsstate,jdbcType=VARCHAR}
     *     where id = #{id,jdbcType=INTEGER}
     * @param record
     * @return
     */
    int updateTitleAndRWSByPrimaryKey(Title record);

}