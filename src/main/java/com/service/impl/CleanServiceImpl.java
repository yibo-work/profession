package com.service.impl;

import com.dao.CleanDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Clean;
import com.service.CleanService;
import com.utils.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 需求/服务ServiceImpl
 * @author Clrvn
 */
@Service
public class CleanServiceImpl implements CleanService {

    @Autowired
    private CleanDao cleanDao;

    /**
     * 查询需求/服务页面
     * @return 分页需求/服务数据
     */
    @Override
    public PageInfo<Clean> page(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(cleanDao.list(requestParamsUtil.getParameters()));
    }

    /**
     * 查询需求/服务列表
     */
    @Override
    public List<Clean> list(Map<String, Object> map) {
        return cleanDao.list(map);
    }


    /**
     * 通过id查询单个需求/服务
     */
    @Override
    public Clean findById(Integer id) {
        return cleanDao.findById(id);
    }

    /**
     * 通过map查询单个需求/服务
     */
    @Override
    public Clean findByMap(Map<String, Object> map) {
        return cleanDao.findByMap(map);
    }

    /**
     * 新增需求/服务
     */
    @Override
    public int save(Clean clean) {
        return cleanDao.save(clean);
    }

    /**
     * 修改需求/服务
     */
    @Override
    public int update(Clean clean) {
        return cleanDao.update(clean);
    }

    /**
     * 删除需求/服务
     */
    @Override
    public int deleteById(Integer id) {
        return cleanDao.deleteById(id);
    }

    /**
     * 添加点击量
     *
     */
    @Override
    public void addClicked(Integer id) {
        cleanDao.addClicked(id);
    }

}
