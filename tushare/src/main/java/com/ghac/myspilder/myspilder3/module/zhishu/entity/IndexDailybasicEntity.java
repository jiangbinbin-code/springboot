package com.ghac.myspilder.myspilder3.module.zhishu.entity;

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
 * @date 2020-11-12 14:57:27
 */
@Data
@TableName("index_dailybasic")
public class IndexDailybasicEntity implements Serializable {
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
	private Float tradeDate;
	/**
	 * 
	 */
	private Float totalMv;
	/**
	 * 
	 */
	private Float floatMv;
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
	private Float turnoverRate;
	/**
	 * 
	 */
	private Float turnoverRateF;
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

}
