package com.jialong.core.service;

import com.jialong.core.bean.Title;
import com.jialong.core.bean.TitleExample;
import com.jialong.core.bean.UserRoleExample;
import com.jialong.core.mapper.TitleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tjl on 2019/3/26 14:17.
 */
@Service
public class TitleService {
    @Autowired
    private TitleMapper titleMapper;


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
            title.setRwsstate("待审批");
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
        return titleMapper.deleteByPrimaryKey(id);
    }

    /**
     * 插入操作
     * @param title
     * @return
     */
    public int insert(Title title) {

        return titleMapper.insert(title);
    }



}
