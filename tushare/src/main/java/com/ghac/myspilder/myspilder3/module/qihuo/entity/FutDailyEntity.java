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
 * @date 2020-11-12 14:57:39
 */
@Data
@TableName("fut_daily")
public class FutDailyEntity implements Serializable {
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
	private Float preClose;
	/**
	 * 
	 */
	private Float preSettle;
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
	private Float settle;
	/**
	 * 
	 */
	private Float change1;
	/**
	 * 
	 */
	private Float change2;
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
	private Float oi;
	/**
	 * 
	 */
	private Float oiChg;
	/**
	 * 
	 */
	private Float delvSettle;

}
