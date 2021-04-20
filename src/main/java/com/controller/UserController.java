package com.controller;

import com.enums.ResultFailureEnum;
import com.github.pagehelper.PageInfo;
import com.model.User;
import com.service.UserService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户Controller
 * @author Clrvn
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ResultVO login(@RequestBody User loginUser, HttpSession session) {

        Map<String, Object> map = new HashMap<>();
        map.put("name", loginUser.getName());
        map.put("password", loginUser.getPassword());
        User user = userService.findByMap(map);
        if (user != null) {
            session.setAttribute("USER", user);
            return ResultVOUtil.success();
        } else {
            return ResultVOUtil.failure(ResultFailureEnum.LOGIN_ERROR);
        }

    }

    @RequestMapping("/loginOut")
    public void loginOut(HttpSession session) {
        session.removeAttribute("USER");
        session.invalidate();
    }

    @RequestMapping("/register")
    public ResultVO register(@RequestBody User user, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", user.getName());
        User findUser = userService.findByMap(map);
        if (findUser != null) {
            return ResultVOUtil.failure(ResultFailureEnum.REGISTER_ERROR);
        } else {
            userService.save(user);
            session.setAttribute("USER", user);
            return ResultVOUtil.success();
        }

    }

    /**
     * 查询用户页面
     * @return 分页用户数据
     */
    @GetMapping("/page")
    public PageInfo<User> page() {
        return userService.page(new RequestParamsUtil());
    }

    /**
     * 查询用户列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<User> userList = userService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(userList);
    }

    /**
     * 通过id查询单个用户
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        User user =userService.findById(id);
        return ResultVOUtil.success(user);
    }

    /**
     * 通过map查询单个用户
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        User user =userService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(user);
    }

    /**
     * 添加用户
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody User user) {
        userService.save(user);
        return ResultVOUtil.success();
    }

    /**
     * 修改用户
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody User user) {
        userService.update(user);
        return ResultVOUtil.success();
    }

    /**
     * 删除用户
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        userService.deleteById(id);
        return ResultVOUtil.success();

    }

}