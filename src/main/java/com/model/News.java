package com.model;

import lombok.Data;
import java.util.Date;
import java.io.Serializable;

/**
 * 新闻信息
 * @author Clrvn
 */
@Data
public class News implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 新闻编号
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 描述
     */
    private String description;

    /**
     * 新闻类型
     */
    private Integer type;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;


}
