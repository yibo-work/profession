package com.dao;

import com.model.Clean;

import java.util.List;
import java.util.Map;


/**
 * 需求/服务DAO
 * @author Clrvn
 */
public interface CleanDao {

    /**
     * 通过id查询单个需求/服务
     */
    Clean findById(Integer id);

    /**
     * 通过map查询单个需求/服务
     */
    Clean findByMap(Map<String, Object> map);

    /**
     * 查询需求/服务列表
     */
    List<Clean> list(Map<String, Object> map);

    /**
     * 新增需求/服务
     */
    int save(Clean clean);

    /**
     * 修改需求/服务
     */
    int update(Clean clean);

    /**
     * 删除需求/服务
     */
    int deleteById(Integer id);

    /**
     * 添加点击量
     */
    void addClicked(Integer id);
}
