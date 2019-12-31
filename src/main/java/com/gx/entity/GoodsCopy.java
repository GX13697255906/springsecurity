package com.gx.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xun.guo
 * @since 2019-12-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GoodsCopy对象", description="")
public class GoodsCopy implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    private String gname;

    @ApiModelProperty(value = "商品价格")
    private Float price;

    @ApiModelProperty(value = "商品类型")
    private String gtype;

    @ApiModelProperty(value = "寄送方式")
    private String sendtype;

    @ApiModelProperty(value = "发货方")
    private String gshipper;

    @ApiModelProperty(value = "销量")
    private Integer gsales;

    private String description;


}