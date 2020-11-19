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
 * @date 2020-11-12 14:58:00
 */
@Data
@TableName("balancesheet")
public class BalancesheetEntity implements Serializable {
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
	private String compType;
	/**
	 * 
	 */
	private Float totalShare;
	/**
	 * 
	 */
	private Float capRese;
	/**
	 * 
	 */
	private Float undistrPorfit;
	/**
	 * 
	 */
	private Float surplusRese;
	/**
	 * 
	 */
	private Float specialRese;
	/**
	 * 
	 */
	private Float moneyCap;
	/**
	 * 
	 */
	private Float tradAsset;
	/**
	 * 
	 */
	private Float notesReceiv;
	/**
	 * 
	 */
	private Float accountsReceiv;
	/**
	 * 
	 */
	private Float othReceiv;
	/**
	 * 
	 */
	private Float prepayment;
	/**
	 * 
	 */
	private Float divReceiv;
	/**
	 * 
	 */
	private Float intReceiv;
	/**
	 * 
	 */
	private Float inventories;
	/**
	 * 
	 */
	private Float amorExp;
	/**
	 * 
	 */
	private Float ncaWithin1y;
	/**
	 * 
	 */
	private Float settRsrv;
	/**
	 * 
	 */
	private Float loantoOthBankFi;
	/**
	 * 
	 */
	private Float premiumReceiv;
	/**
	 * 
	 */
	private Float reinsurReceiv;
	/**
	 * 
	 */
	private Float reinsurResReceiv;
	/**
	 * 
	 */
	private Float purResaleFa;
	/**
	 * 
	 */
	private Float othCurAssets;
	/**
	 * 
	 */
	private Float totalCurAssets;
	/**
	 * 
	 */
	private Float faAvailForSale;
	/**
	 * 
	 */
	private Float htmInvest;
	/**
	 * 
	 */
	private Float ltEqtInvest;
	/**
	 * 
	 */
	private Float investRealEstate;
	/**
	 * 
	 */
	private Float timeDeposits;
	/**
	 * 
	 */
	private Float othAssets;
	/**
	 * 
	 */
	private Float ltRec;
	/**
	 * 
	 */
	private Float fixAssets;
	/**
	 * 
	 */
	private Float cip;
	/**
	 * 
	 */
	private Float constMaterials;
	/**
	 * 
	 */
	private Float fixedAssetsDisp;
	/**
	 * 
	 */
	private Float producBioAssets;
	/**
	 * 
	 */
	private Float oilAndGasAssets;
	/**
	 * 
	 */
	private Float intanAssets;
	/**
	 * 
	 */
	private Float rAndD;
	/**
	 * 
	 */
	private Float goodwill;
	/**
	 * 
	 */
	private Float ltAmorExp;
	/**
	 * 
	 */
	private Float deferTaxAssets;
	/**
	 * 
	 */
	private Float decrInDisbur;
	/**
	 * 
	 */
	private Float othNca;
	/**
	 * 
	 */
	private Float totalNca;
	/**
	 * 
	 */
	private Float cashReserCb;
	/**
	 * 
	 */
	private Float deposInOthBfi;
	/**
	 * 
	 */
	private Float precMetals;
	/**
	 * 
	 */
	private Float derivAssets;
	/**
	 * 
	 */
	private Float rrReinsUnePrem;
	/**
	 * 
	 */
	private Float rrReinsOutstdCla;
	/**
	 * 
	 */
	private Float rrReinsLinsLiab;
	/**
	 * 
	 */
	private Float rrReinsLthinsLiab;
	/**
	 * 
	 */
	private Float refundDepos;
	/**
	 * 
	 */
	private Float phPledgeLoans;
	/**
	 * 
	 */
	private Float refundCapDepos;
	/**
	 * 
	 */
	private Float indepAcctAssets;
	/**
	 * 
	 */
	private Float clientDepos;
	/**
	 * 
	 */
	private Float clientProv;
	/**
	 * 
	 */
	private Float transacSeatFee;
	/**
	 * 
	 */
	private Float investAsReceiv;
	/**
	 * 
	 */
	private Float totalAssets;
	/**
	 * 
	 */
	private Float ltBorr;
	/**
	 * 
	 */
	private Float stBorr;
	/**
	 * 
	 */
	private Float cbBorr;
	/**
	 * 
	 */
	private Float deposIbDeposits;
	/**
	 * 
	 */
	private Float loanOthBank;
	/**
	 * 
	 */
	private Float tradingFl;
	/**
	 * 
	 */
	private Float notesPayable;
	/**
	 * 
	 */
	private Float acctPayable;
	/**
	 * 
	 */
	private Float advReceipts;
	/**
	 * 
	 */
	private Float soldForRepurFa;
	/**
	 * 
	 */
	private Float commPayable;
	/**
	 * 
	 */
	private Float payrollPayable;
	/**
	 * 
	 */
	private Float taxesPayable;
	/**
	 * 
	 */
	private Float intPayable;
	/**
	 * 
	 */
	private Float divPayable;
	/**
	 * 
	 */
	private Float othPayable;
	/**
	 * 
	 */
	private Float accExp;
	/**
	 * 
	 */
	private Float deferredInc;
	/**
	 * 
	 */
	private Float stBondsPayable;
	/**
	 * 
	 */
	private Float payableToReinsurer;
	/**
	 * 
	 */
	private Float rsrvInsurCont;
	/**
	 * 
	 */
	private Float actingTradingSec;
	/**
	 * 
	 */
	private Float actingUwSec;
	/**
	 * 
	 */
	private Float nonCurLiabDue1y;
	/**
	 * 
	 */
	private Float othCurLiab;
	/**
	 * 
	 */
	private Float totalCurLiab;
	/**
	 * 
	 */
	private Float bondPayable;
	/**
	 * 
	 */
	private Float ltPayable;
	/**
	 * 
	 */
	private Float specificPayables;
	/**
	 * 
	 */
	private Float estimatedLiab;
	/**
	 * 
	 */
	private Float deferTaxLiab;
	/**
	 * 
	 */
	private Float deferIncNonCurLiab;
	/**
	 * 
	 */
	private Float othNcl;
	/**
	 * 
	 */
	private Float totalNcl;
	/**
	 * 
	 */
	private Float deposOthBfi;
	/**
	 * 
	 */
	private Float derivLiab;
	/**
	 * 
	 */
	private Float depos;
	/**
	 * 
	 */
	private Float agencyBusLiab;
	/**
	 * 
	 */
	private Float othLiab;
	/**
	 * 
	 */
	private Float premReceivAdva;
	/**
	 * 
	 */
	private Float deposReceived;
	/**
	 * 
	 */
	private Float phInvest;
	/**
	 * 
	 */
	private Float reserUnePrem;
	/**
	 * 
	 */
	private Float reserOutstdClaims;
	/**
	 * 
	 */
	private Float reserLinsLiab;
	/**
	 * 
	 */
	private Float reserLthinsLiab;
	/**
	 * 
	 */
	private Float indeptAccLiab;
	/**
	 * 
	 */
	private Float pledgeBorr;
	/**
	 * 
	 */
	private Float indemPayable;
	/**
	 * 
	 */
	private Float policyDivPayable;
	/**
	 * 
	 */
	private Float totalLiab;
	/**
	 * 
	 */
	private Float treasuryShare;
	/**
	 * 
	 */
	private Float ordinRiskReser;
	/**
	 * 
	 */
	private Float forexDiffer;
	/**
	 * 
	 */
	private Float investLossUnconf;
	/**
	 * 
	 */
	private Float minorityInt;
	/**
	 * 
	 */
	private Float totalHldrEqyExcMinInt;
	/**
	 * 
	 */
	private Float totalHldrEqyIncMinInt;
	/**
	 * 
	 */
	private Float totalLiabHldrEqy;
	/**
	 * 
	 */
	private Float ltPayrollPayable;
	/**
	 * 
	 */
	private Float othCompIncome;
	/**
	 * 
	 */
	private Float othEqtTools;
	/**
	 * 
	 */
	private Float othEqtToolsPShr;
	/**
	 * 
	 */
	private Float lendingFunds;
	/**
	 * 
	 */
	private Float accReceivable;
	/**
	 * 
	 */
	private Float stFinPayable;
	/**
	 * 
	 */
	private Float payables;
	/**
	 * 
	 */
	private Float hfsAssets;
	/**
	 * 
	 */
	private Float hfsSales;
	/**
	 * 
	 */
	private String updateFlag;

}
