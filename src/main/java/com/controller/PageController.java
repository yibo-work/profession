package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Clrvn
 */
@Controller
public class PageController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("loginOut")
    public String loginOut(HttpSession session) {
        session.removeAttribute("USER");
        session.invalidate();
        session.getServletContext().removeAttribute(session.getId());
        return "login";
    }

    @GetMapping("/index")
    public String index(HttpSession session, Model model) {
        //默认，不用登录，测试用
        /*User user = new User();
        user.setId(1);
        user.setRoleId(1);
        user.setName("chen");
        user.setPassword("123qwe");
        session.setAttribute("USER", user);*/

        return "index";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    /**
     * 用户管理
     */
    @GetMapping("/userManage")
    public String userManage() {
        return "userManage";
    }

    @GetMapping("/homeUserManage")
    public String homeUserManage() {
        return "homeUserManage";
    }

    @GetMapping("/userAdd")
    public String userAdd() {
        return "userAdd";
    }

    @GetMapping("/userEdit")
    public String userEdit() {
        return "userEdit";
    }

    @GetMapping("/userView")
    public String userView() {
        return "userView";
    }

    /**
     * 家政服务管理
     */
    @GetMapping("/cleanManage")
    public String cleanManage() {
        return "cleanManage";
    }

    @GetMapping("/cleanAdd")
    public String cleanAdd() {
        return "cleanAdd";
    }

    @GetMapping("/cleanEdit")
    public String cleanEdit() {
        return "cleanEdit";
    }

    @GetMapping("/cleanView")
    public String cleanView() {
        return "cleanView";
    }


    /**
     * 分类
     */
    @GetMapping("/categoryManage")
    public String categoryManage() {
        return "categoryManage";
    }

    @GetMapping("/categoryAdd")
    public String categoryAdd() {
        return "categoryAdd";
    }

    @GetMapping("/categoryEdit")
    public String categoryEdit() {
        return "categoryEdit";
    }

    @GetMapping("/categoryView")
    public String categoryView() {
        return "categoryView";
    }

    /**
     * 留言管理
     */
    @GetMapping("/commentManage")
    public String commentManage() {
        return "commentManage";
    }

    @GetMapping("/commentAdd")
    public String commentAdd() {
        return "commentAdd";
    }

    @GetMapping("/commentEdit")
    public String commentEdit() {
        return "commentEdit";
    }

    @GetMapping("/commentView")
    public String commentView() {
        return "commentView";
    }

    @GetMapping("/myComment")
    public String myComment() {
        return "myComment";
    }

    @GetMapping("/toMeComment")
    public String toMeComment() {
        return "ToMeComment";
    }


    /**
     * 资讯管理
     */
    @GetMapping("/newsManage")
    public String newsManage() {
        return "newsManage";
    }

    @GetMapping("/newsAdd")
    public String newsAdd() {
        return "newsAdd";
    }

    @GetMapping("/newsEdit")
    public String newsEdit() {
        return "newsEdit";
    }

    @GetMapping("/newsView")
    public String newsView() {
        return "newsView";
    }

    /**
     * 预约订单管理
     */
    @GetMapping("/orderManage")
    public String orderManage() {
        return "orderManage";
    }

    @GetMapping("/orderAdd")
    public String orderAdd() {
        return "orderAdd";
    }

    @GetMapping("/orderEdit")
    public String orderEdit() {
        return "orderEdit";
    }

    @GetMapping("/orderView")
    public String orderView() {
        return "orderView";
    }

    @GetMapping("/myOrder")
    public String myOrder() {
        return "myOrder";
    }

    @GetMapping("/toMeOrder")
    public String toMeOrder() {
        return "toMeOrder";
    }

    /**
     * 分值记录
     */
    @GetMapping("/recordManage")
    public String recordManage() {
        return "recordManage";
    }

    @GetMapping("/recordAdd")
    public String recordAdd() {
        return "recordAdd";
    }

    @GetMapping("/recordEdit")
    public String recordEdit() {
        return "recordEdit";
    }

    @GetMapping("/recordView")
    public String recordView() {
        return "recordView";
    }

}
