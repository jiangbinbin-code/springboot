package com.ghac.tusahre.module.hsstock.xqdata.entity;

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
 * @date 2020-11-12 14:58:05
 */
@Data
@TableName("bak_daily")
public class BakDailyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String tsCode;
	/**
	 * 
	 */
	private String tradeDate;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private Float pctChange;
	/**
	 * 
	 */
	private Float close;
	/**
	 * 
	 */
	private Float change;
	/**
	 * 
	 */
	private Float open;
	/**
	 * 
	 */
	private Float high;
	/**
	 * 
	 */
	private Float low;
	/**
	 * 
	 */
	private Float preClose;
	/**
	 * 
	 */
	private Float volRatio;
	/**
	 * 
	 */
	private Float turnOver;
	/**
	 * 
	 */
	private Float swing;
	/**
	 * 
	 */
	private Float vol;
	/**
	 * 
	 */
	private Float amount;
	/**
	 * 
	 */
	private Float selling;
	/**
	 * 
	 */
	private Float buying;
	/**
	 * 
	 */
	private Float totalShare;
	/**
	 * 
	 */
	private Float floatShare;
	/**
	 * 
	 */
	private Float pe;
	/**
	 * 
	 */
	private Float industry;
	/**
	 * 
	 */
	private Float area;
	/**
	 * 
	 */
	private Float floatMv;
	/**
	 * 
	 */
	private Float totalMv;
	/**
	 * 
	 */
	private Float avgPrice;
	/**
	 * 
	 */
	private Float strength;
	/**
	 * 
	 */
	private Float activity;
	/**
	 * 
	 */
	private Float avgTurnover;
	/**
	 * 
	 */
	private Float attack;
	/**
	 * 
	 */
	private Float interval3;
	/**
	 * 
	 */
	private Float interval6;

}
