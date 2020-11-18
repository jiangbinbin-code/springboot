package com.ghac.myspilder.myspilder3.module.gongmujijin.entity;

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
 * @date 2020-11-12 14:57:44
 */
@Data
@TableName("fund_daily")
public class FundDailyEntity implements Serializable {
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
	private Float close;
	/**
	 * 
	 */
	private Float preClose;
	/**
	 * 
	 */
	private Float change;
	/**
	 * 
	 */
	private Float pctChg;
	/**
	 * 
	 */
	private Float vol;
	/**
	 * 
	 */
	private Float amount;

}
