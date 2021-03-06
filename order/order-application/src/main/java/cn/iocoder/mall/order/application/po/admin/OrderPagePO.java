package cn.iocoder.mall.order.application.po.admin;

import cn.iocoder.mall.order.api.bo.OrderBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 订单分页 vo
 *
 * @author Sin
 * @time 2019-03-27 21:23
 */
@Data
@Accessors(chain = true)
@ApiModel("订单VO")
public class OrderPagePO implements Serializable {

    /**
     * 分页
     */
    @ApiModelProperty("分页下表当前")
    private Integer pageNo;
    /**
     * 总条数
     */
    @ApiModelProperty("总条数")
    private Integer total;
    /**
     * 订单 list
     */
    @ApiModelProperty("订单信息")
    private List<OrderBO> orders;
}
