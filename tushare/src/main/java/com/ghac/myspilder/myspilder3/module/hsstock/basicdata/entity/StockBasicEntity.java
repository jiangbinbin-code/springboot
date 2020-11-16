package com.ghac.myspilder.myspilder3.module.hsstock.basicdata;

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
 * @date 2020-11-12 14:57:05
 */
@Data
@TableName("stock_basic")
public class StockBasicEntity implements Serializable {
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
	private String symbol;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String area;
	/**
	 * 
	 */
	private String industry;
	/**
	 * 
	 */
	private String listDate;

}
