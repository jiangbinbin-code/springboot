package com.ghac.tusahre.module.hsstock.xqdata.entity;

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
 * @date 2020-11-12 14:57:38
 */
@Data
@TableName("ggt_monthly")
public class GgtMonthlyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String month;
	/**
	 * 
	 */
	private Float dayBuyAmt;
	/**
	 * 
	 */
	private Float dayBuyVol;
	/**
	 * 
	 */
	private Float daySellAmt;
	/**
	 * 
	 */
	private Float daySellVol;
	/**
	 * 
	 */
	private Float totalBuyAmt;
	/**
	 * 
	 */
	private Float totalBuyVol;
	/**
	 * 
	 */
	private Float totalSellAmt;
	/**
	 * 
	 */
	private Float totalSellVol;

}
