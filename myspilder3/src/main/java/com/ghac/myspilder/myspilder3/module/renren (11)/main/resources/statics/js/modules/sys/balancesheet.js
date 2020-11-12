$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/balancesheet/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'annDate', index: 'ann_date', width: 80 }, 			
			{ label: '', name: 'fAnnDate', index: 'f_ann_date', width: 80 }, 			
			{ label: '', name: 'endDate', index: 'end_date', width: 80 }, 			
			{ label: '', name: 'reportType', index: 'report_type', width: 80 }, 			
			{ label: '', name: 'compType', index: 'comp_type', width: 80 }, 			
			{ label: '', name: 'totalShare', index: 'total_share', width: 80 }, 			
			{ label: '', name: 'capRese', index: 'cap_rese', width: 80 }, 			
			{ label: '', name: 'undistrPorfit', index: 'undistr_porfit', width: 80 }, 			
			{ label: '', name: 'surplusRese', index: 'surplus_rese', width: 80 }, 			
			{ label: '', name: 'specialRese', index: 'special_rese', width: 80 }, 			
			{ label: '', name: 'moneyCap', index: 'money_cap', width: 80 }, 			
			{ label: '', name: 'tradAsset', index: 'trad_asset', width: 80 }, 			
			{ label: '', name: 'notesReceiv', index: 'notes_receiv', width: 80 }, 			
			{ label: '', name: 'accountsReceiv', index: 'accounts_receiv', width: 80 }, 			
			{ label: '', name: 'othReceiv', index: 'oth_receiv', width: 80 }, 			
			{ label: '', name: 'prepayment', index: 'prepayment', width: 80 }, 			
			{ label: '', name: 'divReceiv', index: 'div_receiv', width: 80 }, 			
			{ label: '', name: 'intReceiv', index: 'int_receiv', width: 80 }, 			
			{ label: '', name: 'inventories', index: 'inventories', width: 80 }, 			
			{ label: '', name: 'amorExp', index: 'amor_exp', width: 80 }, 			
			{ label: '', name: 'ncaWithin1y', index: 'nca_within_1y', width: 80 }, 			
			{ label: '', name: 'settRsrv', index: 'sett_rsrv', width: 80 }, 			
			{ label: '', name: 'loantoOthBankFi', index: 'loanto_oth_bank_fi', width: 80 }, 			
			{ label: '', name: 'premiumReceiv', index: 'premium_receiv', width: 80 }, 			
			{ label: '', name: 'reinsurReceiv', index: 'reinsur_receiv', width: 80 }, 			
			{ label: '', name: 'reinsurResReceiv', index: 'reinsur_res_receiv', width: 80 }, 			
			{ label: '', name: 'purResaleFa', index: 'pur_resale_fa', width: 80 }, 			
			{ label: '', name: 'othCurAssets', index: 'oth_cur_assets', width: 80 }, 			
			{ label: '', name: 'totalCurAssets', index: 'total_cur_assets', width: 80 }, 			
			{ label: '', name: 'faAvailForSale', index: 'fa_avail_for_sale', width: 80 }, 			
			{ label: '', name: 'htmInvest', index: 'htm_invest', width: 80 }, 			
			{ label: '', name: 'ltEqtInvest', index: 'lt_eqt_invest', width: 80 }, 			
			{ label: '', name: 'investRealEstate', index: 'invest_real_estate', width: 80 }, 			
			{ label: '', name: 'timeDeposits', index: 'time_deposits', width: 80 }, 			
			{ label: '', name: 'othAssets', index: 'oth_assets', width: 80 }, 			
			{ label: '', name: 'ltRec', index: 'lt_rec', width: 80 }, 			
			{ label: '', name: 'fixAssets', index: 'fix_assets', width: 80 }, 			
			{ label: '', name: 'cip', index: 'cip', width: 80 }, 			
			{ label: '', name: 'constMaterials', index: 'const_materials', width: 80 }, 			
			{ label: '', name: 'fixedAssetsDisp', index: 'fixed_assets_disp', width: 80 }, 			
			{ label: '', name: 'producBioAssets', index: 'produc_bio_assets', width: 80 }, 			
			{ label: '', name: 'oilAndGasAssets', index: 'oil_and_gas_assets', width: 80 }, 			
			{ label: '', name: 'intanAssets', index: 'intan_assets', width: 80 }, 			
			{ label: '', name: 'rAndD', index: 'r_and_d', width: 80 }, 			
			{ label: '', name: 'goodwill', index: 'goodwill', width: 80 }, 			
			{ label: '', name: 'ltAmorExp', index: 'lt_amor_exp', width: 80 }, 			
			{ label: '', name: 'deferTaxAssets', index: 'defer_tax_assets', width: 80 }, 			
			{ label: '', name: 'decrInDisbur', index: 'decr_in_disbur', width: 80 }, 			
			{ label: '', name: 'othNca', index: 'oth_nca', width: 80 }, 			
			{ label: '', name: 'totalNca', index: 'total_nca', width: 80 }, 			
			{ label: '', name: 'cashReserCb', index: 'cash_reser_cb', width: 80 }, 			
			{ label: '', name: 'deposInOthBfi', index: 'depos_in_oth_bfi', width: 80 }, 			
			{ label: '', name: 'precMetals', index: 'prec_metals', width: 80 }, 			
			{ label: '', name: 'derivAssets', index: 'deriv_assets', width: 80 }, 			
			{ label: '', name: 'rrReinsUnePrem', index: 'rr_reins_une_prem', width: 80 }, 			
			{ label: '', name: 'rrReinsOutstdCla', index: 'rr_reins_outstd_cla', width: 80 }, 			
			{ label: '', name: 'rrReinsLinsLiab', index: 'rr_reins_lins_liab', width: 80 }, 			
			{ label: '', name: 'rrReinsLthinsLiab', index: 'rr_reins_lthins_liab', width: 80 }, 			
			{ label: '', name: 'refundDepos', index: 'refund_depos', width: 80 }, 			
			{ label: '', name: 'phPledgeLoans', index: 'ph_pledge_loans', width: 80 }, 			
			{ label: '', name: 'refundCapDepos', index: 'refund_cap_depos', width: 80 }, 			
			{ label: '', name: 'indepAcctAssets', index: 'indep_acct_assets', width: 80 }, 			
			{ label: '', name: 'clientDepos', index: 'client_depos', width: 80 }, 			
			{ label: '', name: 'clientProv', index: 'client_prov', width: 80 }, 			
			{ label: '', name: 'transacSeatFee', index: 'transac_seat_fee', width: 80 }, 			
			{ label: '', name: 'investAsReceiv', index: 'invest_as_receiv', width: 80 }, 			
			{ label: '', name: 'totalAssets', index: 'total_assets', width: 80 }, 			
			{ label: '', name: 'ltBorr', index: 'lt_borr', width: 80 }, 			
			{ label: '', name: 'stBorr', index: 'st_borr', width: 80 }, 			
			{ label: '', name: 'cbBorr', index: 'cb_borr', width: 80 }, 			
			{ label: '', name: 'deposIbDeposits', index: 'depos_ib_deposits', width: 80 }, 			
			{ label: '', name: 'loanOthBank', index: 'loan_oth_bank', width: 80 }, 			
			{ label: '', name: 'tradingFl', index: 'trading_fl', width: 80 }, 			
			{ label: '', name: 'notesPayable', index: 'notes_payable', width: 80 }, 			
			{ label: '', name: 'acctPayable', index: 'acct_payable', width: 80 }, 			
			{ label: '', name: 'advReceipts', index: 'adv_receipts', width: 80 }, 			
			{ label: '', name: 'soldForRepurFa', index: 'sold_for_repur_fa', width: 80 }, 			
			{ label: '', name: 'commPayable', index: 'comm_payable', width: 80 }, 			
			{ label: '', name: 'payrollPayable', index: 'payroll_payable', width: 80 }, 			
			{ label: '', name: 'taxesPayable', index: 'taxes_payable', width: 80 }, 			
			{ label: '', name: 'intPayable', index: 'int_payable', width: 80 }, 			
			{ label: '', name: 'divPayable', index: 'div_payable', width: 80 }, 			
			{ label: '', name: 'othPayable', index: 'oth_payable', width: 80 }, 			
			{ label: '', name: 'accExp', index: 'acc_exp', width: 80 }, 			
			{ label: '', name: 'deferredInc', index: 'deferred_inc', width: 80 }, 			
			{ label: '', name: 'stBondsPayable', index: 'st_bonds_payable', width: 80 }, 			
			{ label: '', name: 'payableToReinsurer', index: 'payable_to_reinsurer', width: 80 }, 			
			{ label: '', name: 'rsrvInsurCont', index: 'rsrv_insur_cont', width: 80 }, 			
			{ label: '', name: 'actingTradingSec', index: 'acting_trading_sec', width: 80 }, 			
			{ label: '', name: 'actingUwSec', index: 'acting_uw_sec', width: 80 }, 			
			{ label: '', name: 'nonCurLiabDue1y', index: 'non_cur_liab_due_1y', width: 80 }, 			
			{ label: '', name: 'othCurLiab', index: 'oth_cur_liab', width: 80 }, 			
			{ label: '', name: 'totalCurLiab', index: 'total_cur_liab', width: 80 }, 			
			{ label: '', name: 'bondPayable', index: 'bond_payable', width: 80 }, 			
			{ label: '', name: 'ltPayable', index: 'lt_payable', width: 80 }, 			
			{ label: '', name: 'specificPayables', index: 'specific_payables', width: 80 }, 			
			{ label: '', name: 'estimatedLiab', index: 'estimated_liab', width: 80 }, 			
			{ label: '', name: 'deferTaxLiab', index: 'defer_tax_liab', width: 80 }, 			
			{ label: '', name: 'deferIncNonCurLiab', index: 'defer_inc_non_cur_liab', width: 80 }, 			
			{ label: '', name: 'othNcl', index: 'oth_ncl', width: 80 }, 			
			{ label: '', name: 'totalNcl', index: 'total_ncl', width: 80 }, 			
			{ label: '', name: 'deposOthBfi', index: 'depos_oth_bfi', width: 80 }, 			
			{ label: '', name: 'derivLiab', index: 'deriv_liab', width: 80 }, 			
			{ label: '', name: 'depos', index: 'depos', width: 80 }, 			
			{ label: '', name: 'agencyBusLiab', index: 'agency_bus_liab', width: 80 }, 			
			{ label: '', name: 'othLiab', index: 'oth_liab', width: 80 }, 			
			{ label: '', name: 'premReceivAdva', index: 'prem_receiv_adva', width: 80 }, 			
			{ label: '', name: 'deposReceived', index: 'depos_received', width: 80 }, 			
			{ label: '', name: 'phInvest', index: 'ph_invest', width: 80 }, 			
			{ label: '', name: 'reserUnePrem', index: 'reser_une_prem', width: 80 }, 			
			{ label: '', name: 'reserOutstdClaims', index: 'reser_outstd_claims', width: 80 }, 			
			{ label: '', name: 'reserLinsLiab', index: 'reser_lins_liab', width: 80 }, 			
			{ label: '', name: 'reserLthinsLiab', index: 'reser_lthins_liab', width: 80 }, 			
			{ label: '', name: 'indeptAccLiab', index: 'indept_acc_liab', width: 80 }, 			
			{ label: '', name: 'pledgeBorr', index: 'pledge_borr', width: 80 }, 			
			{ label: '', name: 'indemPayable', index: 'indem_payable', width: 80 }, 			
			{ label: '', name: 'policyDivPayable', index: 'policy_div_payable', width: 80 }, 			
			{ label: '', name: 'totalLiab', index: 'total_liab', width: 80 }, 			
			{ label: '', name: 'treasuryShare', index: 'treasury_share', width: 80 }, 			
			{ label: '', name: 'ordinRiskReser', index: 'ordin_risk_reser', width: 80 }, 			
			{ label: '', name: 'forexDiffer', index: 'forex_differ', width: 80 }, 			
			{ label: '', name: 'investLossUnconf', index: 'invest_loss_unconf', width: 80 }, 			
			{ label: '', name: 'minorityInt', index: 'minority_int', width: 80 }, 			
			{ label: '', name: 'totalHldrEqyExcMinInt', index: 'total_hldr_eqy_exc_min_int', width: 80 }, 			
			{ label: '', name: 'totalHldrEqyIncMinInt', index: 'total_hldr_eqy_inc_min_int', width: 80 }, 			
			{ label: '', name: 'totalLiabHldrEqy', index: 'total_liab_hldr_eqy', width: 80 }, 			
			{ label: '', name: 'ltPayrollPayable', index: 'lt_payroll_payable', width: 80 }, 			
			{ label: '', name: 'othCompIncome', index: 'oth_comp_income', width: 80 }, 			
			{ label: '', name: 'othEqtTools', index: 'oth_eqt_tools', width: 80 }, 			
			{ label: '', name: 'othEqtToolsPShr', index: 'oth_eqt_tools_p_shr', width: 80 }, 			
			{ label: '', name: 'lendingFunds', index: 'lending_funds', width: 80 }, 			
			{ label: '', name: 'accReceivable', index: 'acc_receivable', width: 80 }, 			
			{ label: '', name: 'stFinPayable', index: 'st_fin_payable', width: 80 }, 			
			{ label: '', name: 'payables', index: 'payables', width: 80 }, 			
			{ label: '', name: 'hfsAssets', index: 'hfs_assets', width: 80 }, 			
			{ label: '', name: 'hfsSales', index: 'hfs_sales', width: 80 }, 			
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
		balancesheet: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.balancesheet = {};
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
                var url = vm.balancesheet.id == null ? "sys/balancesheet/save" : "sys/balancesheet/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.balancesheet),
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
                        url: baseURL + "sys/balancesheet/delete",
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
			$.get(baseURL + "sys/balancesheet/info/"+id, function(r){
                vm.balancesheet = r.balancesheet;
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