package com.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 留言
 *
 * @author Clrvn
 */
@Data
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 留言编号
     */
    private Integer id;

    /**
     * 留言内容
     */
    private String content;
    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 留言用户编号
     */
    private Integer commentUserId;
    /**
     * 留言用户名称
     */
    private String commentUserName;

    /**
     * 发布时间
     */
    private Date createTime;


}
