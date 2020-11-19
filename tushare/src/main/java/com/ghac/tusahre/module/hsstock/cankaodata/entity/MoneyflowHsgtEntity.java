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
 * @date 2020-11-12 14:57:20
 */
@Data
@TableName("moneyflow_hsgt")
public class MoneyflowHsgtEntity implements Serializable {
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
	private Float ggtSs;
	/**
	 * 
	 */
	private Float ggtSz;
	/**
	 * 
	 */
	private Float hgt;
	/**
	 * 
	 */
	private Float sgt;
	/**
	 * 
	 */
	private Float northMoney;
	/**
	 * 
	 */
	private Float southMoney;

}
