package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.Comment;
import com.service.CommentService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 留言Controller
 * @author Clrvn
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 查询留言页面
     * @return 分页留言数据
     */
    @GetMapping("/page")
    public PageInfo<Comment> page() {
        return commentService.page(new RequestParamsUtil());
    }

    /**
     * 查询留言列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<Comment> commentList = commentService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(commentList);
    }

    /**
     * 通过id查询单个留言
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        Comment comment =commentService.findById(id);
        return ResultVOUtil.success(comment);
    }

    /**
     * 通过map查询单个留言
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        Comment comment =commentService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(comment);
    }

    /**
     * 添加留言
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody Comment comment) {
        commentService.save(comment);
        return ResultVOUtil.success();
    }

    /**
     * 修改留言
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody Comment comment) {
        commentService.update(comment);
        return ResultVOUtil.success();
    }

    /**
     * 删除留言
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        commentService.deleteById(id);
        return ResultVOUtil.success();

    }

}