package com.iridescent.ms.order.service.domain;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Description:
 *
 * @author 陌北有棵树
 * @version 2019/3/13
 */


@DynamicUpdate
@Data
@Entity
public class OrderDetail {

    @Id
    private String detailId;

    /**
     * 订单Id
     */
    private String orderId;

    /**
     * 产品Id
     */
    private String productId;

    /**
     * 名字
     */
    private String productName;

    /**
     * 单价
     */
    private BigDecimal productPrice;

    /**
     * 购买数量
     */
    private Integer productQuantity;

    /**
     * 图片
     */
    private String productImage;

}
