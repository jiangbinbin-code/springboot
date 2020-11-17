package com.ghac.myspilder.myspilder3.module.hsstock.caiwudata.entity;

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
 * @date 2020-11-12 14:57:49
 */
@Data
@TableName("dividend")
public class DividendEntity implements Serializable {
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
	private String endDate;
	/**
	 * 
	 */
	private String annDate;
	/**
	 * 
	 */
	private String divProc;
	/**
	 * 
	 */
	private Float stkDiv;
	/**
	 * 
	 */
	private Float stkBoRate;
	/**
	 * 
	 */
	private Float stkCoRate;
	/**
	 * 
	 */
	private Float cashDiv;
	/**
	 * 
	 */
	private Float cashDivTax;
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
	private String divListdate;
	/**
	 * 
	 */
	private String impAnnDate;
	/**
	 * 
	 */
	private String baseDate;
	/**
	 * 
	 */
	private Float baseShare;

}
