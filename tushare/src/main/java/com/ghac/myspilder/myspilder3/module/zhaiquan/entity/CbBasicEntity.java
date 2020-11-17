package com.ghac.myspilder.myspilder3.module.zhaiquan.entity;

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
 * @date 2020-11-12 14:57:59
 */
@Data
@TableName("cb_basic")
public class CbBasicEntity implements Serializable {
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
	private String bondFullName;
	/**
	 * 
	 */
	private String bondShortName;
	/**
	 * 
	 */
	private String cbCode;
	/**
	 * 
	 */
	private String stkCode;
	/**
	 * 
	 */
	private String stkShortName;
	/**
	 * 
	 */
	private String maturity;
	/**
	 * 
	 */
	private Float par;
	/**
	 * 
	 */
	private Float issuePrice;
	/**
	 * 
	 */
	private Float issueSize;
	/**
	 * 
	 */
	private Float remainSize;
	/**
	 * 
	 */
	private String valueDate;
	/**
	 * 
	 */
	private String maturityDate;
	/**
	 * 
	 */
	private String rateType;
	/**
	 * 
	 */
	private Float couponRate;
	/**
	 * 
	 */
	private Float addRate;
	/**
	 * 
	 */
	private String payPerYear;
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
	private String exchange;
	/**
	 * 
	 */
	private String convStartDate;
	/**
	 * 
	 */
	private String convEndDate;
	/**
	 * 
	 */
	private Double firstConvPrice;
	/**
	 * 
	 */
	private Float convPrice;
	/**
	 * 
	 */
	private String rateClause;
	/**
	 * 
	 */
	private String putClause;
	/**
	 * 
	 */
	private String maturityPutPrice;
	/**
	 * 
	 */
	private String callClause;
	/**
	 * 
	 */
	private String resetClause;
	/**
	 * 
	 */
	private String convClause;
	/**
	 * 
	 */
	private String guarantor;
	/**
	 * 
	 */
	private String guaranteeType;
	/**
	 * 
	 */
	private String issueRating;
	/**
	 * 
	 */
	private String newestRating;
	/**
	 * 
	 */
	private String ratingComp;

}
