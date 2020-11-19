package com.ghac.tusahre.module.gongmujijin.entity;

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
 * @date 2020-11-12 14:57:44
 */
@Data
@TableName("fund_div")
public class FundDivEntity implements Serializable {
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
	private String annDate;
	/**
	 * 
	 */
	private String impAnndate;
	/**
	 * 
	 */
	private String baseDate;
	/**
	 * 
	 */
	private String divProc;
	/**
	 * 
	 */
	private String recordDate;
	/**
	 * 
	 */
	private String exDate;
	/**
	 * 
	 */
	private String payDate;
	/**
	 * 
	 */
	private String earpayDate;
	/**
	 * 
	 */
	private String netExDate;
	/**
	 * 
	 */
	private Float divCash;
	/**
	 * 
	 */
	private Float baseUnit;
	/**
	 * 
	 */
	private Float earDistr;
	/**
	 * 
	 */
	private Float earAmount;
	/**
	 * 
	 */
	private String accountDate;
	/**
	 * 
	 */
	private String baseYear;

}
