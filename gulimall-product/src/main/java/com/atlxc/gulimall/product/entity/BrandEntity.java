package com.atlxc.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * 品牌
 * 
 * @author liuxinchang
 * @email a3171218907@qq.com
 * @date 2022-07-02 15:53:34
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "品牌名不能为空")
	private String name;
	/**
	 * 品牌logo地址
	 */
	@NotBlank
	@URL(message = "logo必须是一个合法URL")
	private String logo;
	/**
	 * 介绍
	 */
	@NotBlank
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@NotNull
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z]$",message = "检索首字母必须为单个字母")
	private String firstLetter;
	/**
	 * 排序
	 */
	@NotNull
	@Min(value = 0,message = "排序必须大于0")
	private Integer sort;

}
