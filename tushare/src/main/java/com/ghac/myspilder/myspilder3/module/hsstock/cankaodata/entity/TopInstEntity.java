package com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:05
 */
@Data
@TableName("top_inst")
public class TopInstEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String tradeDate;
	/**
	 * 
	 */
	private String tsCode;
	/**
	 * 
	 */
	private Float exalter;
	/**
	 * 
	 */
	private Float buy;
	/**
	 * 
	 */
	private Float buyRate;
	/**
	 * 
	 */
	private Float sell;
	/**
	 * 
	 */
	private Float sellRate;
	/**
	 * 
	 */
	private Float netBuy;

}
