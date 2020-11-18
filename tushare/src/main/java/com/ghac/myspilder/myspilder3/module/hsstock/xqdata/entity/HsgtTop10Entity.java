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
 * @date 2020-11-12 14:57:32
 */
@Data
@TableName("hsgt_top10")
public class HsgtTop10Entity implements Serializable {
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
	private Float change;
	/**
	 * 
	 */
	private Integer rank;
	/**
	 * 
	 */
	private String marketType;
	/**
	 * 
	 */
	private Float amount;
	/**
	 * 
	 */
	private Float netAmount;
	/**
	 * 
	 */
	private Float buy;
	/**
	 * 
	 */
	private Float sell;

}
