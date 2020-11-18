package com.ghac.myspilder.myspilder3.module.hsstock.xqdata.entity;

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
 * @date 2020-11-12 14:57:20
 */
@Data
@TableName("limit_list")
public class LimitListEntity implements Serializable {
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
	private Float pctChg;
	/**
	 * 
	 */
	private Float amp;
	/**
	 * 
	 */
	private Float fcRatio;
	/**
	 * 
	 */
	private Float flRatio;
	/**
	 * 
	 */
	private Float fdAmount;
	/**
	 * 
	 */
	private String firstTime;
	/**
	 * 
	 */
	private String lastTime;
	/**
	 * 
	 */
	private Integer openTimes;
	/**
	 * 
	 */
	private Float strth;
	/**
	 * 
	 */
	private String limit;

}
