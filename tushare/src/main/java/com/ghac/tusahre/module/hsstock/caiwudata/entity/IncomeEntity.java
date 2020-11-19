package com.ghac.tusahre.module.hsstock.caiwudata.entity;

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
 * @date 2020-11-12 14:57:32
 */
@Data
@TableName("income")
public class IncomeEntity implements Serializable {
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
	private String fAnnDate;
	/**
	 * 
	 */
	private String endDate;
	/**
	 * 
	 */
	private String reportType;
	/**
	 * 
	 */
	private Float compType;
	/**
	 * 
	 */
	private Float basicEps;
	/**
	 * 
	 */
	private Float dilutedEps;
	/**
	 * 
	 */
	private Float totalRevenue;
	/**
	 * 
	 */
	private Float revenue;
	/**
	 * 
	 */
	private Float intIncome;
	/**
	 * 
	 */
	private Float premEarned;
	/**
	 * 
	 */
	private Float commIncome;
	/**
	 * 
	 */
	private Float nCommisIncome;
	/**
	 * 
	 */
	private Float nOthIncome;
	/**
	 * 
	 */
	private Float nOthBIncome;
	/**
	 * 
	 */
	private Float premIncome;
	/**
	 * 
	 */
	private Float outPrem;
	/**
	 * 
	 */
	private Float unePremReser;
	/**
	 * 
	 */
	private Float reinsIncome;
	/**
	 * 
	 */
	private Float nSecTbIncome;
	/**
	 * 
	 */
	private Float nSecUwIncome;
	/**
	 * 
	 */
	private Float nAssetMgIncome;
	/**
	 * 
	 */
	private Float othBIncome;
	/**
	 * 
	 */
	private Float fvValueChgGain;
	/**
	 * 
	 */
	private Float investIncome;
	/**
	 * 
	 */
	private Float assInvestIncome;
	/**
	 * 
	 */
	private Float forexGain;
	/**
	 * 
	 */
	private Float totalCogs;
	/**
	 * 
	 */
	private Float operCost;
	/**
	 * 
	 */
	private Float intExp;
	/**
	 * 
	 */
	private Float commExp;
	/**
	 * 
	 */
	private Float bizTaxSurchg;
	/**
	 * 
	 */
	private Float sellExp;
	/**
	 * 
	 */
	private Float adminExp;
	/**
	 * 
	 */
	private Float finExp;
	/**
	 * 
	 */
	private Float assetsImpairLoss;
	/**
	 * 
	 */
	private Float premRefund;
	/**
	 * 
	 */
	private Float compensPayout;
	/**
	 * 
	 */
	private Float reserInsurLiab;
	/**
	 * 
	 */
	private Float divPayt;
	/**
	 * 
	 */
	private Float reinsExp;
	/**
	 * 
	 */
	private Float operExp;
	/**
	 * 
	 */
	private Float compensPayoutRefu;
	/**
	 * 
	 */
	private Float insurReserRefu;
	/**
	 * 
	 */
	private Float reinsCostRefund;
	/**
	 * 
	 */
	private Float otherBusCost;
	/**
	 * 
	 */
	private Float operateProfit;
	/**
	 * 
	 */
	private Float nonOperIncome;
	/**
	 * 
	 */
	private Float nonOperExp;
	/**
	 * 
	 */
	private Float ncaDisploss;
	/**
	 * 
	 */
	private Float totalProfit;
	/**
	 * 
	 */
	private Float incomeTax;
	/**
	 * 
	 */
	private Float nIncome;
	/**
	 * 
	 */
	private Float nIncomeAttrP;
	/**
	 * 
	 */
	private Float minorityGain;
	/**
	 * 
	 */
	private Float othComprIncome;
	/**
	 * 
	 */
	private Float tComprIncome;
	/**
	 * 
	 */
	private Float comprIncAttrP;
	/**
	 * 
	 */
	private Float comprIncAttrMS;
	/**
	 * 
	 */
	private Float ebit;
	/**
	 * 
	 */
	private Float ebitda;
	/**
	 * 
	 */
	private Float insuranceExp;
	/**
	 * 
	 */
	private Float undistProfit;
	/**
	 * 
	 */
	private Float distableProfit;
	/**
	 * 
	 */
	private String updateFlag;

}
