package com.ghac.tusahre.module.hsstock.cankaodata.entity;

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
 * @date 2020-11-12 14:57:04
 */
@Data
@TableName("top_list")
public class TopListEntity implements Serializable {
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
	private String name;
	/**
	 * 
	 */
	private Float close;
	/**
	 * 
	 */
	private Float pctChange;
	/**
	 * 
	 */
	private Float turnoverRate;
	/**
	 * 
	 */
	private Float amount;
	/**
	 * 
	 */
	private Float lSell;
	/**
	 * 
	 */
	private Float lBuy;
	/**
	 * 
	 */
	private Float lAmount;
	/**
	 * 
	 */
	private Float netAmount;
	/**
	 * 
	 */
	private Float netRate;
	/**
	 * 
	 */
	private Float amountRate;
	/**
	 * 
	 */
	private Float floatValues;
	/**
	 * 
	 */
	private Float reason;

}
