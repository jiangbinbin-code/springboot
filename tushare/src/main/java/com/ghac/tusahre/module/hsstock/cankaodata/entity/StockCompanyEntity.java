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
 * @date 2020-11-12 14:57:10
 */
@Data
@TableName("stock_company")
public class StockCompanyEntity implements Serializable {
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
	private String chairman;
	/**
	 * 
	 */
	private String manager;
	/**
	 * 
	 */
	private String secretary;
	/**
	 * 
	 */
	private String regCapital;
	/**
	 * 
	 */
	private String setupDate;
	/**
	 * 
	 */
	private String province;

}
