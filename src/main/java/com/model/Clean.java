package com.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 需求/服务
 *
 * @author Clrvn
 */
@Data
public class Clean implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务编号
     */
    private Integer id;

    /**
     * 服务/需求名称
     */
    private String cleanName;

    /**
     * 服务内容
     */
    private String content;

    /**
     * 服务描述
     */
    private String description;

    /**
     * 价格
     */
    private String price;

    /**
     * 发布人
     */
    private Integer userId;
    /**
     * 发布人
     */
    private String userName;

    /**
     * 服务分类编号
     */
    private Integer categoryId;
    /**
     * 服务分类编号
     */
    private String categoryName;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 点击量
     */
    private Integer clicked;

    /**
     * 发布时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;


}
