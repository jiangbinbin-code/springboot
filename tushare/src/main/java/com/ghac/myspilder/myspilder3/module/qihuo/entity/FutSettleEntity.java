package com.ghac.myspilder.myspilder3.module.qihuo.entity;

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
 * @date 2020-11-12 14:57:43
 */
@Data
@TableName("fut_settle")
public class FutSettleEntity implements Serializable {
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
	private Float settle;
	/**
	 * 
	 */
	private Float tradingFeeRate;
	/**
	 * 
	 */
	private Float tradingFee;
	/**
	 * 
	 */
	private Float deliveryFee;
	/**
	 * 
	 */
	private Float bHedgingMarginRate;
	/**
	 * 
	 */
	private Float sHedgingMarginRate;
	/**
	 * 
	 */
	private Float longMarginRate;
	/**
	 * 
	 */
	private Float shortMarginRate;
	/**
	 * 
	 */
	private Float offsetTodayFee;
	/**
	 * 
	 */
	private String exchange;

}
