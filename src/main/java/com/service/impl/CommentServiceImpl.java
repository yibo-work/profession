package com.service.impl;

import com.dao.CommentDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Comment;
import com.service.CommentService;
import com.utils.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 留言ServiceImpl
 * @author Clrvn
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    /**
     * 查询留言页面
     * @return 分页留言数据
     */
    @Override
    public PageInfo<Comment> page(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(commentDao.list(requestParamsUtil.getParameters()));
    }

    /**
     * 查询留言列表
     */
    @Override
    public List<Comment> list(Map<String, Object> map) {
        return commentDao.list(map);
    }


    /**
     * 通过id查询单个留言
     */
    @Override
    public Comment findById(Integer id) {
        return commentDao.findById(id);
    }

    /**
     * 通过map查询单个留言
     */
    @Override
    public Comment findByMap(Map<String, Object> map) {
        return commentDao.findByMap(map);
    }

    /**
     * 新增留言
     */
    @Override
    public int save(Comment comment) {
        return commentDao.save(comment);
    }

    /**
     * 修改留言
     */
    @Override
    public int update(Comment comment) {
        return commentDao.update(comment);
    }

    /**
     * 删除留言
     */
    @Override
    public int deleteById(Integer id) {
        return commentDao.deleteById(id);
    }

}
