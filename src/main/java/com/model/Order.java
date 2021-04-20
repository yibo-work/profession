package com.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 服务订单
 *
 * @author Clrvn
 */
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    private Integer id;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 服务/需求名称
     */
    private String cleanName;

    /**
     * 分类编号
     */
    private Integer categoryId;

    /**
     * 服务编号
     */
    private Integer cleanId;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 家政编号
     */
    private Integer serviceId;

    /**
     * 家政名称
     */
    private String serviceName;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 发起人
     */
    private Integer createUserId;
    /**
     * 接受人编号
     */
    private Integer toUserId;

    /**
     * 添加时间
     */
    private Date createTime;


}
