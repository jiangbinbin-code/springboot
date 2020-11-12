$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/cashflow/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'annDate', index: 'ann_date', width: 80 }, 			
			{ label: '', name: 'fAnnDate', index: 'f_ann_date', width: 80 }, 			
			{ label: '', name: 'endDate', index: 'end_date', width: 80 }, 			
			{ label: '', name: 'compType', index: 'comp_type', width: 80 }, 			
			{ label: '', name: 'reportType', index: 'report_type', width: 80 }, 			
			{ label: '', name: 'netProfit', index: 'net_profit', width: 80 }, 			
			{ label: '', name: 'finanExp', index: 'finan_exp', width: 80 }, 			
			{ label: '', name: 'cFrSaleSg', index: 'c_fr_sale_sg', width: 80 }, 			
			{ label: '', name: 'recpTaxRends', index: 'recp_tax_rends', width: 80 }, 			
			{ label: '', name: 'nDeposIncrFi', index: 'n_depos_incr_fi', width: 80 }, 			
			{ label: '', name: 'nIncrLoansCb', index: 'n_incr_loans_cb', width: 80 }, 			
			{ label: '', name: 'nIncBorrOthFi', index: 'n_inc_borr_oth_fi', width: 80 }, 			
			{ label: '', name: 'premFrOrigContr', index: 'prem_fr_orig_contr', width: 80 }, 			
			{ label: '', name: 'nIncrInsuredDep', index: 'n_incr_insured_dep', width: 80 }, 			
			{ label: '', name: 'nReinsurPrem', index: 'n_reinsur_prem', width: 80 }, 			
			{ label: '', name: 'nIncrDispTfa', index: 'n_incr_disp_tfa', width: 80 }, 			
			{ label: '', name: 'ifcCashIncr', index: 'ifc_cash_incr', width: 80 }, 			
			{ label: '', name: 'nIncrDispFaas', index: 'n_incr_disp_faas', width: 80 }, 			
			{ label: '', name: 'nIncrLoansOthBank', index: 'n_incr_loans_oth_bank', width: 80 }, 			
			{ label: '', name: 'nCapIncrRepur', index: 'n_cap_incr_repur', width: 80 }, 			
			{ label: '', name: 'cFrOthOperateA', index: 'c_fr_oth_operate_a', width: 80 }, 			
			{ label: '', name: 'cInfFrOperateA', index: 'c_inf_fr_operate_a', width: 80 }, 			
			{ label: '', name: 'cPaidGoodsS', index: 'c_paid_goods_s', width: 80 }, 			
			{ label: '', name: 'cPaidToForEmpl', index: 'c_paid_to_for_empl', width: 80 }, 			
			{ label: '', name: 'cPaidForTaxes', index: 'c_paid_for_taxes', width: 80 }, 			
			{ label: '', name: 'nIncrCltLoanAdv', index: 'n_incr_clt_loan_adv', width: 80 }, 			
			{ label: '', name: 'nIncrDepCbob', index: 'n_incr_dep_cbob', width: 80 }, 			
			{ label: '', name: 'cPayClaimsOrigInco', index: 'c_pay_claims_orig_inco', width: 80 }, 			
			{ label: '', name: 'payHandlingChrg', index: 'pay_handling_chrg', width: 80 }, 			
			{ label: '', name: 'payCommInsurPlcy', index: 'pay_comm_insur_plcy', width: 80 }, 			
			{ label: '', name: 'othCashPayOperAct', index: 'oth_cash_pay_oper_act', width: 80 }, 			
			{ label: '', name: 'stCashOutAct', index: 'st_cash_out_act', width: 80 }, 			
			{ label: '', name: 'nCashflowAct', index: 'n_cashflow_act', width: 80 }, 			
			{ label: '', name: 'othRecpRalInvAct', index: 'oth_recp_ral_inv_act', width: 80 }, 			
			{ label: '', name: 'cDispWithdrwlInvest', index: 'c_disp_withdrwl_invest', width: 80 }, 			
			{ label: '', name: 'cRecpReturnInvest', index: 'c_recp_return_invest', width: 80 }, 			
			{ label: '', name: 'nRecpDispFiolta', index: 'n_recp_disp_fiolta', width: 80 }, 			
			{ label: '', name: 'nRecpDispSobu', index: 'n_recp_disp_sobu', width: 80 }, 			
			{ label: '', name: 'stotInflowsInvAct', index: 'stot_inflows_inv_act', width: 80 }, 			
			{ label: '', name: 'cPayAcqConstFiolta', index: 'c_pay_acq_const_fiolta', width: 80 }, 			
			{ label: '', name: 'cPaidInvest', index: 'c_paid_invest', width: 80 }, 			
			{ label: '', name: 'nDispSubsOthBiz', index: 'n_disp_subs_oth_biz', width: 80 }, 			
			{ label: '', name: 'othPayRalInvAct', index: 'oth_pay_ral_inv_act', width: 80 }, 			
			{ label: '', name: 'nIncrPledgeLoan', index: 'n_incr_pledge_loan', width: 80 }, 			
			{ label: '', name: 'stotOutInvAct', index: 'stot_out_inv_act', width: 80 }, 			
			{ label: '', name: 'nCashflowInvAct', index: 'n_cashflow_inv_act', width: 80 }, 			
			{ label: '', name: 'cRecpBorrow', index: 'c_recp_borrow', width: 80 }, 			
			{ label: '', name: 'procIssueBonds', index: 'proc_issue_bonds', width: 80 }, 			
			{ label: '', name: 'othCashRecpRalFncAct', index: 'oth_cash_recp_ral_fnc_act', width: 80 }, 			
			{ label: '', name: 'stotCashInFncAct', index: 'stot_cash_in_fnc_act', width: 80 }, 			
			{ label: '', name: 'freeCashflow', index: 'free_cashflow', width: 80 }, 			
			{ label: '', name: 'cPrepayAmtBorr', index: 'c_prepay_amt_borr', width: 80 }, 			
			{ label: '', name: 'cPayDistDpcpIntExp', index: 'c_pay_dist_dpcp_int_exp', width: 80 }, 			
			{ label: '', name: 'inclDvdProfitPaidScMs', index: 'incl_dvd_profit_paid_sc_ms', width: 80 }, 			
			{ label: '', name: 'othCashpayRalFncAct', index: 'oth_cashpay_ral_fnc_act', width: 80 }, 			
			{ label: '', name: 'stotCashoutFncAct', index: 'stot_cashout_fnc_act', width: 80 }, 			
			{ label: '', name: 'nCashFlowsFncAct', index: 'n_cash_flows_fnc_act', width: 80 }, 			
			{ label: '', name: 'effFxFluCash', index: 'eff_fx_flu_cash', width: 80 }, 			
			{ label: '', name: 'nIncrCashCashEqu', index: 'n_incr_cash_cash_equ', width: 80 }, 			
			{ label: '', name: 'cCashEquBegPeriod', index: 'c_cash_equ_beg_period', width: 80 }, 			
			{ label: '', name: 'cCashEquEndPeriod', index: 'c_cash_equ_end_period', width: 80 }, 			
			{ label: '', name: 'cRecpCapContrib', index: 'c_recp_cap_contrib', width: 80 }, 			
			{ label: '', name: 'inclCashRecSaims', index: 'incl_cash_rec_saims', width: 80 }, 			
			{ label: '', name: 'unconInvestLoss', index: 'uncon_invest_loss', width: 80 }, 			
			{ label: '', name: 'provDeprAssets', index: 'prov_depr_assets', width: 80 }, 			
			{ label: '', name: 'deprFaCogaDpba', index: 'depr_fa_coga_dpba', width: 80 }, 			
			{ label: '', name: 'amortIntangAssets', index: 'amort_intang_assets', width: 80 }, 			
			{ label: '', name: 'ltAmortDeferredExp', index: 'lt_amort_deferred_exp', width: 80 }, 			
			{ label: '', name: 'decrDeferredExp', index: 'decr_deferred_exp', width: 80 }, 			
			{ label: '', name: 'incrAccExp', index: 'incr_acc_exp', width: 80 }, 			
			{ label: '', name: 'lossDispFiolta', index: 'loss_disp_fiolta', width: 80 }, 			
			{ label: '', name: 'lossScrFa', index: 'loss_scr_fa', width: 80 }, 			
			{ label: '', name: 'lossFvChg', index: 'loss_fv_chg', width: 80 }, 			
			{ label: '', name: 'investLoss', index: 'invest_loss', width: 80 }, 			
			{ label: '', name: 'decrDefIncTaxAssets', index: 'decr_def_inc_tax_assets', width: 80 }, 			
			{ label: '', name: 'incrDefIncTaxLiab', index: 'incr_def_inc_tax_liab', width: 80 }, 			
			{ label: '', name: 'decrInventories', index: 'decr_inventories', width: 80 }, 			
			{ label: '', name: 'decrOperPayable', index: 'decr_oper_payable', width: 80 }, 			
			{ label: '', name: 'incrOperPayable', index: 'incr_oper_payable', width: 80 }, 			
			{ label: '', name: 'others', index: 'others', width: 80 }, 			
			{ label: '', name: 'imNetCashflowOperAct', index: 'im_net_cashflow_oper_act', width: 80 }, 			
			{ label: '', name: 'convDebtIntoCap', index: 'conv_debt_into_cap', width: 80 }, 			
			{ label: '', name: 'convCopbondsDueWithin1y', index: 'conv_copbonds_due_within_1y', width: 80 }, 			
			{ label: '', name: 'faFncLeases', index: 'fa_fnc_leases', width: 80 }, 			
			{ label: '', name: 'endBalCash', index: 'end_bal_cash', width: 80 }, 			
			{ label: '', name: 'begBalCash', index: 'beg_bal_cash', width: 80 }, 			
			{ label: '', name: 'endBalCashEqu', index: 'end_bal_cash_equ', width: 80 }, 			
			{ label: '', name: 'begBalCashEqu', index: 'beg_bal_cash_equ', width: 80 }, 			
			{ label: '', name: 'imNIncrCashEqu', index: 'im_n_incr_cash_equ', width: 80 }, 			
			{ label: '', name: 'updateFlag', index: 'update_flag', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		cashflow: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.cashflow = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
		    $('#btnSaveOrUpdate').button('loading').delay(1000).queue(function() {
                var url = vm.cashflow.id == null ? "sys/cashflow/save" : "sys/cashflow/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.cashflow),
                    success: function(r){
                        if(r.code === 0){
                             layer.msg("操作成功", {icon: 1});
                             vm.reload();
                             $('#btnSaveOrUpdate').button('reset');
                             $('#btnSaveOrUpdate').dequeue();
                        }else{
                            layer.alert(r.msg);
                            $('#btnSaveOrUpdate').button('reset');
                            $('#btnSaveOrUpdate').dequeue();
                        }
                    }
                });
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			var lock = false;
            layer.confirm('确定要删除选中的记录？', {
                btn: ['确定','取消'] //按钮
            }, function(){
               if(!lock) {
                    lock = true;
		            $.ajax({
                        type: "POST",
                        url: baseURL + "sys/cashflow/delete",
                        contentType: "application/json",
                        data: JSON.stringify(ids),
                        success: function(r){
                            if(r.code == 0){
                                layer.msg("操作成功", {icon: 1});
                                $("#jqGrid").trigger("reloadGrid");
                            }else{
                                layer.alert(r.msg);
                            }
                        }
				    });
			    }
             }, function(){
             });
		},
		getInfo: function(id){
			$.get(baseURL + "sys/cashflow/info/"+id, function(r){
                vm.cashflow = r.cashflow;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});