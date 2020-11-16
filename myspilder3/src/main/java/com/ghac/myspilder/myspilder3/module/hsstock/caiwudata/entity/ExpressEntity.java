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
 * @date 2020-11-12 14:57:54
 */
@Data
@TableName("express")
public class ExpressEntity implements Serializable {
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
	private Float revenue;
	/**
	 * 
	 */
	private Float operateProfit;
	/**
	 * 
	 */
	private Float totalProfit;
	/**
	 * 
	 */
	private Float nIncome;
	/**
	 * 
	 */
	private Float totalAssets;
	/**
	 * 
	 */
	private Float totalHldrEqyExcMinInt;
	/**
	 * 
	 */
	private Float dilutedEps;
	/**
	 * 
	 */
	private Float dilutedRoe;
	/**
	 * 
	 */
	private Float yoyNetProfit;
	/**
	 * 
	 */
	private Float bps;
	/**
	 * 
	 */
	private Float yoySales;
	/**
	 * 
	 */
	private Float yoyOp;
	/**
	 * 
	 */
	private Float yoyTp;
	/**
	 * 
	 */
	private Float yoyDeduNp;
	/**
	 * 
	 */
	private Float yoyEps;
	/**
	 * 
	 */
	private Float yoyRoe;
	/**
	 * 
	 */
	private Float growthAssets;
	/**
	 * 
	 */
	private Float yoyEquity;
	/**
	 * 
	 */
	private Float growthBps;
	/**
	 * 
	 */
	private Float orLastYear;
	/**
	 * 
	 */
	private Float opLastYear;
	/**
	 * 
	 */
	private Float tpLastYear;
	/**
	 * 
	 */
	private Float npLastYear;
	/**
	 * 
	 */
	private Float epsLastYear;
	/**
	 * 
	 */
	private Float openNetAssets;
	/**
	 * 
	 */
	private Float openBps;
	/**
	 * 
	 */
	private String perfSummary;
	/**
	 * 
	 */
	private Integer isAudit;
	/**
	 * 
	 */
	private String remark;

}
