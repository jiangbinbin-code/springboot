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
 * @date 2020-11-12 14:57:48
 */
@Data
@TableName("fina_indicator")
public class FinaIndicatorEntity implements Serializable {
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
	private Float eps;
	/**
	 * 
	 */
	private Float dtEps;
	/**
	 * 
	 */
	private Float totalRevenuePs;
	/**
	 * 
	 */
	private Float revenuePs;
	/**
	 * 
	 */
	private Float capitalResePs;
	/**
	 * 
	 */
	private Float surplusResePs;
	/**
	 * 
	 */
	private Float undistProfitPs;
	/**
	 * 
	 */
	private Float extraItem;
	/**
	 * 
	 */
	private Float profitDedt;
	/**
	 * 
	 */
	private Float grossMargin;
	/**
	 * 
	 */
	private Float currentRatio;
	/**
	 * 
	 */
	private Float quickRatio;
	/**
	 * 
	 */
	private Float cashRatio;
	/**
	 * 
	 */
	private Float invturnDays;
	/**
	 * 
	 */
	private Float arturnDays;
	/**
	 * 
	 */
	private Float invTurn;
	/**
	 * 
	 */
	private Float arTurn;
	/**
	 * 
	 */
	private Float caTurn;
	/**
	 * 
	 */
	private Float faTurn;
	/**
	 * 
	 */
	private Float assetsTurn;
	/**
	 * 
	 */
	private Float opIncome;
	/**
	 * 
	 */
	private Float valuechangeIncome;
	/**
	 * 
	 */
	private Float interstIncome;
	/**
	 * 
	 */
	private Float daa;
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
	private Float fcff;
	/**
	 * 
	 */
	private Float fcfe;
	/**
	 * 
	 */
	private Float currentExint;
	/**
	 * 
	 */
	private Float noncurrentExint;
	/**
	 * 
	 */
	private Float interestdebt;
	/**
	 * 
	 */
	private Float netdebt;
	/**
	 * 
	 */
	private Float tangibleAsset;
	/**
	 * 
	 */
	private Float workingCapital;
	/**
	 * 
	 */
	private Float networkingCapital;
	/**
	 * 
	 */
	private Float investCapital;
	/**
	 * 
	 */
	private Float retainedEarnings;
	/**
	 * 
	 */
	private Float diluted2Eps;
	/**
	 * 
	 */
	private Float bps;
	/**
	 * 
	 */
	private Float ocfps;
	/**
	 * 
	 */
	private Float retainedps;
	/**
	 * 
	 */
	private Float cfps;
	/**
	 * 
	 */
	private Float ebitPs;
	/**
	 * 
	 */
	private Float fcffPs;
	/**
	 * 
	 */
	private Float fcfePs;
	/**
	 * 
	 */
	private Float netprofitMargin;
	/**
	 * 
	 */
	private Float grossprofitMargin;
	/**
	 * 
	 */
	private Float cogsOfSales;
	/**
	 * 
	 */
	private Float expenseOfSales;
	/**
	 * 
	 */
	private Float profitToGr;
	/**
	 * 
	 */
	private Float saleexpToGr;
	/**
	 * 
	 */
	private Float adminexpOfGr;
	/**
	 * 
	 */
	private Float finaexpOfGr;
	/**
	 * 
	 */
	private Float impaiTtm;
	/**
	 * 
	 */
	private Float gcOfGr;
	/**
	 * 
	 */
	private Float opOfGr;
	/**
	 * 
	 */
	private Float ebitOfGr;
	/**
	 * 
	 */
	private Float roe;
	/**
	 * 
	 */
	private Float roeWaa;
	/**
	 * 
	 */
	private Float roeDt;
	/**
	 * 
	 */
	private Float roa;
	/**
	 * 
	 */
	private Float npta;
	/**
	 * 
	 */
	private Float roic;
	/**
	 * 
	 */
	private Float roeYearly;
	/**
	 * 
	 */
	private Float roa2Yearly;
	/**
	 * 
	 */
	private Float roeAvg;
	/**
	 * 
	 */
	private Float opincomeOfEbt;
	/**
	 * 
	 */
	private Float investincomeOfEbt;
	/**
	 * 
	 */
	private Float nOpProfitOfEbt;
	/**
	 * 
	 */
	private Float taxToEbt;
	/**
	 * 
	 */
	private Float dtprofitToProfit;
	/**
	 * 
	 */
	private Float salescashToOr;
	/**
	 * 
	 */
	private Float ocfToOr;
	/**
	 * 
	 */
	private Float ocfToOpincome;
	/**
	 * 
	 */
	private Float capitalizedToDa;
	/**
	 * 
	 */
	private Float debtToAssets;
	/**
	 * 
	 */
	private Float assetsToEqt;
	/**
	 * 
	 */
	private Float dpAssetsToEqt;
	/**
	 * 
	 */
	private Float caToAssets;
	/**
	 * 
	 */
	private Float ncaToAssets;
	/**
	 * 
	 */
	private Float tbassetsToTotalassets;
	/**
	 * 
	 */
	private Float intToTalcap;
	/**
	 * 
	 */
	private Float eqtToTalcapital;
	/**
	 * 
	 */
	private Float currentdebtToDebt;
	/**
	 * 
	 */
	private Float longdebToDebt;
	/**
	 * 
	 */
	private Float ocfToShortdebt;
	/**
	 * 
	 */
	private Float debtToEqt;
	/**
	 * 
	 */
	private Float eqtToDebt;
	/**
	 * 
	 */
	private Float eqtToInterestdebt;
	/**
	 * 
	 */
	private Float tangibleassetToDebt;
	/**
	 * 
	 */
	private Float tangassetToIntdebt;
	/**
	 * 
	 */
	private Float tangibleassetToNetdebt;
	/**
	 * 
	 */
	private Float ocfToDebt;
	/**
	 * 
	 */
	private Float ocfToInterestdebt;
	/**
	 * 
	 */
	private Float ocfToNetdebt;
	/**
	 * 
	 */
	private Float ebitToInterest;
	/**
	 * 
	 */
	private Float longdebtToWorkingcapital;
	/**
	 * 
	 */
	private Float ebitdaToDebt;
	/**
	 * 
	 */
	private Float turnDays;
	/**
	 * 
	 */
	private Float roaYearly;
	/**
	 * 
	 */
	private Float roaDp;
	/**
	 * 
	 */
	private Float fixedAssets;
	/**
	 * 
	 */
	private Float profitPrefinExp;
	/**
	 * 
	 */
	private Float nonOpProfit;
	/**
	 * 
	 */
	private Float opToEbt;
	/**
	 * 
	 */
	private Float nopToEbt;
	/**
	 * 
	 */
	private Float ocfToProfit;
	/**
	 * 
	 */
	private Float cashToLiqdebt;
	/**
	 * 
	 */
	private Float cashToLiqdebtWithinterest;
	/**
	 * 
	 */
	private Float opToLiqdebt;
	/**
	 * 
	 */
	private Float opToDebt;
	/**
	 * 
	 */
	private Float roicYearly;
	/**
	 * 
	 */
	private Float totalFaTrun;
	/**
	 * 
	 */
	private Float profitToOp;
	/**
	 * 
	 */
	private Float qOpincome;
	/**
	 * 
	 */
	private Float qInvestincome;
	/**
	 * 
	 */
	private Float qDtprofit;
	/**
	 * 
	 */
	private Float qEps;
	/**
	 * 
	 */
	private Float qNetprofitMargin;
	/**
	 * 
	 */
	private Float qGsprofitMargin;
	/**
	 * 
	 */
	private Float qExpToSales;
	/**
	 * 
	 */
	private Float qProfitToGr;
	/**
	 * 
	 */
	private Float qSaleexpToGr;
	/**
	 * 
	 */
	private Float qAdminexpToGr;
	/**
	 * 
	 */
	private Float qFinaexpToGr;
	/**
	 * 
	 */
	private Float qImpairToGrTtm;
	/**
	 * 
	 */
	private Float qGcToGr;
	/**
	 * 
	 */
	private Float qOpToGr;
	/**
	 * 
	 */
	private Float qRoe;
	/**
	 * 
	 */
	private Float qDtRoe;
	/**
	 * 
	 */
	private Float qNpta;
	/**
	 * 
	 */
	private Float qOpincomeToEbt;
	/**
	 * 
	 */
	private Float qInvestincomeToEbt;
	/**
	 * 
	 */
	private Float qDtprofitToProfit;
	/**
	 * 
	 */
	private Float qSalescashToOr;
	/**
	 * 
	 */
	private Float qOcfToSales;
	/**
	 * 
	 */
	private Float qOcfToOr;
	/**
	 * 
	 */
	private Float basicEpsYoy;
	/**
	 * 
	 */
	private Float dtEpsYoy;
	/**
	 * 
	 */
	private Float cfpsYoy;
	/**
	 * 
	 */
	private Float opYoy;
	/**
	 * 
	 */
	private Float ebtYoy;
	/**
	 * 
	 */
	private Float netprofitYoy;
	/**
	 * 
	 */
	private Float dtNetprofitYoy;
	/**
	 * 
	 */
	private Float ocfYoy;
	/**
	 * 
	 */
	private Float roeYoy;
	/**
	 * 
	 */
	private Float bpsYoy;
	/**
	 * 
	 */
	private Float assetsYoy;
	/**
	 * 
	 */
	private Float eqtYoy;
	/**
	 * 
	 */
	private Float trYoy;
	/**
	 * 
	 */
	private Float orYoy;
	/**
	 * 
	 */
	private Float qGrYoy;
	/**
	 * 
	 */
	private Float qGrQoq;
	/**
	 * 
	 */
	private Float qSalesYoy;
	/**
	 * 
	 */
	private Float qSalesQoq;
	/**
	 * 
	 */
	private Float qOpYoy;
	/**
	 * 
	 */
	private Float qOpQoq;
	/**
	 * 
	 */
	private Float qProfitYoy;
	/**
	 * 
	 */
	private Float qProfitQoq;
	/**
	 * 
	 */
	private Float qNetprofitYoy;
	/**
	 * 
	 */
	private Float qNetprofitQoq;
	/**
	 * 
	 */
	private Float equityYoy;
	/**
	 * 
	 */
	private Float rdExp;
	/**
	 * 
	 */
	private String updateFlag;

}