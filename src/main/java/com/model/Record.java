package com.model;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 分值记录
 * @author Clrvn
 */
@Data
public class Record implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 记录编号
     */
    private Integer id;

    /**
     * 评分
     */
    private String score;

    /**
     * 家政编号
     */
    private Integer serviceId;

    /**
     * 家政名称
     */
    private String serviceName;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 追加时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;


}
