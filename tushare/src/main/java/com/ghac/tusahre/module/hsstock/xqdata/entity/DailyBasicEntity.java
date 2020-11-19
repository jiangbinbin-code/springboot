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
 * @date 2020-11-12 14:57:54
 */
@Data
@TableName("daily_basic")
public class DailyBasicEntity implements Serializable {
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
	private Float close;
	/**
	 * 
	 */
	private Float turnoverRate;
	/**
	 * 
	 */
	private Float turnoverRateF;
	/**
	 * 
	 */
	private Float volumeRatio;
	/**
	 * 
	 */
	private Float pe;
	/**
	 * 
	 */
	private Float peTtm;
	/**
	 * 
	 */
	private Float pb;
	/**
	 * 
	 */
	private Float ps;
	/**
	 * 
	 */
	private Float psTtm;
	/**
	 * 
	 */
	private Float dvRatio;
	/**
	 * 
	 */
	private Float dvTtm;
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
	private Float freeShare;
	/**
	 * 
	 */
	private Float totalMv;
	/**
	 * 
	 */
	private Float circMv;

}
