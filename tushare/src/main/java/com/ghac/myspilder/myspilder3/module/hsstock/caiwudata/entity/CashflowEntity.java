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
 * @date 2020-11-12 14:57:59
 */
@Data
@TableName("cashflow")
public class CashflowEntity implements Serializable {
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
	private String compType;
	/**
	 * 
	 */
	private String reportType;
	/**
	 * 
	 */
	private Float netProfit;
	/**
	 * 
	 */
	private Float finanExp;
	/**
	 * 
	 */
	private Float cFrSaleSg;
	/**
	 * 
	 */
	private Float recpTaxRends;
	/**
	 * 
	 */
	private Float nDeposIncrFi;
	/**
	 * 
	 */
	private Float nIncrLoansCb;
	/**
	 * 
	 */
	private Float nIncBorrOthFi;
	/**
	 * 
	 */
	private Float premFrOrigContr;
	/**
	 * 
	 */
	private Float nIncrInsuredDep;
	/**
	 * 
	 */
	private Float nReinsurPrem;
	/**
	 * 
	 */
	private Float nIncrDispTfa;
	/**
	 * 
	 */
	private Float ifcCashIncr;
	/**
	 * 
	 */
	private Float nIncrDispFaas;
	/**
	 * 
	 */
	private Float nIncrLoansOthBank;
	/**
	 * 
	 */
	private Float nCapIncrRepur;
	/**
	 * 
	 */
	private Float cFrOthOperateA;
	/**
	 * 
	 */
	private Float cInfFrOperateA;
	/**
	 * 
	 */
	private Float cPaidGoodsS;
	/**
	 * 
	 */
	private Float cPaidToForEmpl;
	/**
	 * 
	 */
	private Float cPaidForTaxes;
	/**
	 * 
	 */
	private Float nIncrCltLoanAdv;
	/**
	 * 
	 */
	private Float nIncrDepCbob;
	/**
	 * 
	 */
	private Float cPayClaimsOrigInco;
	/**
	 * 
	 */
	private Float payHandlingChrg;
	/**
	 * 
	 */
	private Float payCommInsurPlcy;
	/**
	 * 
	 */
	private Float othCashPayOperAct;
	/**
	 * 
	 */
	private Float stCashOutAct;
	/**
	 * 
	 */
	private Float nCashflowAct;
	/**
	 * 
	 */
	private Float othRecpRalInvAct;
	/**
	 * 
	 */
	private Float cDispWithdrwlInvest;
	/**
	 * 
	 */
	private Float cRecpReturnInvest;
	/**
	 * 
	 */
	private Float nRecpDispFiolta;
	/**
	 * 
	 */
	private Float nRecpDispSobu;
	/**
	 * 
	 */
	private Float stotInflowsInvAct;
	/**
	 * 
	 */
	private Float cPayAcqConstFiolta;
	/**
	 * 
	 */
	private Float cPaidInvest;
	/**
	 * 
	 */
	private Float nDispSubsOthBiz;
	/**
	 * 
	 */
	private Float othPayRalInvAct;
	/**
	 * 
	 */
	private Float nIncrPledgeLoan;
	/**
	 * 
	 */
	private Float stotOutInvAct;
	/**
	 * 
	 */
	private Float nCashflowInvAct;
	/**
	 * 
	 */
	private Float cRecpBorrow;
	/**
	 * 
	 */
	private Float procIssueBonds;
	/**
	 * 
	 */
	private Float othCashRecpRalFncAct;
	/**
	 * 
	 */
	private Float stotCashInFncAct;
	/**
	 * 
	 */
	private Float freeCashflow;
	/**
	 * 
	 */
	private Float cPrepayAmtBorr;
	/**
	 * 
	 */
	private Float cPayDistDpcpIntExp;
	/**
	 * 
	 */
	private Float inclDvdProfitPaidScMs;
	/**
	 * 
	 */
	private Float othCashpayRalFncAct;
	/**
	 * 
	 */
	private Float stotCashoutFncAct;
	/**
	 * 
	 */
	private Float nCashFlowsFncAct;
	/**
	 * 
	 */
	private Float effFxFluCash;
	/**
	 * 
	 */
	private Float nIncrCashCashEqu;
	/**
	 * 
	 */
	private Float cCashEquBegPeriod;
	/**
	 * 
	 */
	private Float cCashEquEndPeriod;
	/**
	 * 
	 */
	private Float cRecpCapContrib;
	/**
	 * 
	 */
	private Float inclCashRecSaims;
	/**
	 * 
	 */
	private Float unconInvestLoss;
	/**
	 * 
	 */
	private Float provDeprAssets;
	/**
	 * 
	 */
	private Float deprFaCogaDpba;
	/**
	 * 
	 */
	private Float amortIntangAssets;
	/**
	 * 
	 */
	private Float ltAmortDeferredExp;
	/**
	 * 
	 */
	private Float decrDeferredExp;
	/**
	 * 
	 */
	private Float incrAccExp;
	/**
	 * 
	 */
	private Float lossDispFiolta;
	/**
	 * 
	 */
	private Float lossScrFa;
	/**
	 * 
	 */
	private Float lossFvChg;
	/**
	 * 
	 */
	private Float investLoss;
	/**
	 * 
	 */
	private Float decrDefIncTaxAssets;
	/**
	 * 
	 */
	private Float incrDefIncTaxLiab;
	/**
	 * 
	 */
	private Float decrInventories;
	/**
	 * 
	 */
	private Float decrOperPayable;
	/**
	 * 
	 */
	private Float incrOperPayable;
	/**
	 * 
	 */
	private Float others;
	/**
	 * 
	 */
	private Float imNetCashflowOperAct;
	/**
	 * 
	 */
	private Float convDebtIntoCap;
	/**
	 * 
	 */
	private Float convCopbondsDueWithin1y;
	/**
	 * 
	 */
	private Float faFncLeases;
	/**
	 * 
	 */
	private Float endBalCash;
	/**
	 * 
	 */
	private Float begBalCash;
	/**
	 * 
	 */
	private Float endBalCashEqu;
	/**
	 * 
	 */
	private Float begBalCashEqu;
	/**
	 * 
	 */
	private Float imNIncrCashEqu;
	/**
	 * 
	 */
	private String updateFlag;

}
