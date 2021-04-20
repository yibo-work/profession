package com.dao;

import com.model.Comment;

import java.util.List;
import java.util.Map;


/**
 * 留言DAO
 * @author Clrvn
 */
public interface CommentDao {

    /**
     * 通过id查询单个留言
     */
    Comment findById(Integer id);

    /**
     * 通过map查询单个留言
     */
    Comment findByMap(Map<String, Object> map);

    /**
     * 查询留言列表
     */
    List<Comment> list(Map<String, Object> map);

    /**
     * 新增留言
     */
    int save(Comment comment);

    /**
     * 修改留言
     */
    int update(Comment comment);

    /**
     * 删除留言
     */
    int deleteById(Integer id);

}
