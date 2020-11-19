package com.ghac.tusahre.module.qihuo.entity;

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
@TableName("fut_basic")
public class FutBasicEntity implements Serializable {
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
	private String exchange;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String futCode;
	/**
	 * 
	 */
	private Float multiplier;
	/**
	 * 
	 */
	private String tradeUnit;
	/**
	 * 
	 */
	private Float perUnit;
	/**
	 * 
	 */
	private String quoteUnit;
	/**
	 * 
	 */
	private String quoteUnitDesc;
	/**
	 * 
	 */
	private String dModeDesc;
	/**
	 * 
	 */
	private String listDate;
	/**
	 * 
	 */
	private String delistDate;
	/**
	 * 
	 */
	private String dMonth;
	/**
	 * 
	 */
	private String lastDdate;
	/**
	 * 
	 */
	private String tradeTimeDesc;

}
