package com.service;

import com.github.pagehelper.PageInfo;
import com.model.Comment;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 留言Service
 * @author Clrvn
 */
public interface CommentService {

	/**
	 * 查询留言页面
	 * @return 分页留言数据
	 */
	PageInfo<Comment> page(RequestParamsUtil requestParamsUtil);

	/**
	 * 查询留言列表
	 */
	List<Comment> list(Map<String, Object> map);

	/**
	 * 通过id查询单个留言
	 */
    Comment findById(Integer id);

	/**
	 * 通过map查询单个留言
	 */
	Comment findByMap(Map<String, Object> map);

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
