package com.ghac.myspilder.myspilder3.module.gongmujijin.entity;

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
 * @date 2020-11-12 14:57:48
 */
@Data
@TableName("fund_basic")
public class FundBasicEntity implements Serializable {
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
	private String name;
	/**
	 * 
	 */
	private String management;
	/**
	 * 
	 */
	private String custodian;
	/**
	 * 
	 */
	private String fundType;
	/**
	 * 
	 */
	private String foundDate;
	/**
	 * 
	 */
	private String dueDate;
	/**
	 * 
	 */
	private String listDate;
	/**
	 * 
	 */
	private String issueDate;
	/**
	 * 
	 */
	private String delistDate;
	/**
	 * 
	 */
	private Float issueAmount;
	/**
	 * 
	 */
	private Float mFee;
	/**
	 * 
	 */
	private Float cFee;
	/**
	 * 
	 */
	private Float durationYear;
	/**
	 * 
	 */
	private String pValue;
	/**
	 * 
	 */
	private String minAmount;
	/**
	 * 
	 */
	private String expReturn;
	/**
	 * 
	 */
	private String benchmark;
	/**
	 * 
	 */
	private String status;
	/**
	 * 
	 */
	private String investType;
	/**
	 * 
	 */
	private String type;
	/**
	 * 
	 */
	private String trustee;
	/**
	 * 
	 */
	private String purcStartdate;
	/**
	 * 
	 */
	private String redmStartdate;
	/**
	 * 
	 */
	private String market;

}
