package io.renren.modules.sys.entity;

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
 * @date 2020-11-12 14:56:59
 */
@Data
@TableName("us_daily")
public class UsDailyEntity implements Serializable {
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
	private Float change;
	/**
	 * 
	 */
	private Float pctChange;
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
	private Float vwap;
	/**
	 * 
	 */
	private Float turnoverRatio;
	/**
	 * 
	 */
	private Float totalMv;
	/**
	 * 
	 */
	private Float pe;
	/**
	 * 
	 */
	private Float pb;

}
