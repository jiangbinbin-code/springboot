package io.renren.modules.sys.entity;

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
@TableName("fund_portfolio")
public class FundPortfolioEntity implements Serializable {
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
	private String endDate;
	/**
	 * 
	 */
	private String symbol;
	/**
	 * 
	 */
	private Float mkv;
	/**
	 * 
	 */
	private Float amount;
	/**
	 * 
	 */
	private Float stkMkvRatio;
	/**
	 * 
	 */
	private Float stkFloatRatio;

}
