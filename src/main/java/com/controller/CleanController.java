package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.Clean;
import com.service.CleanService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 需求/服务Controller
 * @author Clrvn
 */
@RestController
@RequestMapping("/clean")
public class CleanController {

    @Autowired
    private CleanService cleanService;

    /**
     * 查询需求/服务页面
     * @return 分页需求/服务数据
     */
    @GetMapping("/page")
    public PageInfo<Clean> page() {
        return cleanService.page(new RequestParamsUtil());
    }

    /**
     * 查询需求/服务列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<Clean> cleanList = cleanService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(cleanList);
    }

    /**
     * 通过id查询单个需求/服务
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        Clean clean =cleanService.findById(id);
        return ResultVOUtil.success(clean);
    }

    /**
     * 通过map查询单个需求/服务
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        Clean clean =cleanService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(clean);
    }

    /**
     * 添加需求/服务
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody Clean clean) {
        cleanService.save(clean);
        return ResultVOUtil.success();
    }

    /**
     * 修改需求/服务
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody Clean clean) {
        cleanService.update(clean);
        return ResultVOUtil.success();
    }

    /**
     * 删除需求/服务
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        cleanService.deleteById(id);
        return ResultVOUtil.success();

    }

    /**
     * 添加点击量
     */
    @PostMapping("/addClicked")
    public ResultVO addClicked(@RequestParam(value = "id") Integer id) {
        cleanService.addClicked(id);
        return ResultVOUtil.success();

    }

}