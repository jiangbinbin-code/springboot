$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/finaindicator/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'annDate', index: 'ann_date', width: 80 }, 			
			{ label: '', name: 'endDate', index: 'end_date', width: 80 }, 			
			{ label: '', name: 'eps', index: 'eps', width: 80 }, 			
			{ label: '', name: 'dtEps', index: 'dt_eps', width: 80 }, 			
			{ label: '', name: 'totalRevenuePs', index: 'total_revenue_ps', width: 80 }, 			
			{ label: '', name: 'revenuePs', index: 'revenue_ps', width: 80 }, 			
			{ label: '', name: 'capitalResePs', index: 'capital_rese_ps', width: 80 }, 			
			{ label: '', name: 'surplusResePs', index: 'surplus_rese_ps', width: 80 }, 			
			{ label: '', name: 'undistProfitPs', index: 'undist_profit_ps', width: 80 }, 			
			{ label: '', name: 'extraItem', index: 'extra_item', width: 80 }, 			
			{ label: '', name: 'profitDedt', index: 'profit_dedt', width: 80 }, 			
			{ label: '', name: 'grossMargin', index: 'gross_margin', width: 80 }, 			
			{ label: '', name: 'currentRatio', index: 'current_ratio', width: 80 }, 			
			{ label: '', name: 'quickRatio', index: 'quick_ratio', width: 80 }, 			
			{ label: '', name: 'cashRatio', index: 'cash_ratio', width: 80 }, 			
			{ label: '', name: 'invturnDays', index: 'invturn_days', width: 80 }, 			
			{ label: '', name: 'arturnDays', index: 'arturn_days', width: 80 }, 			
			{ label: '', name: 'invTurn', index: 'inv_turn', width: 80 }, 			
			{ label: '', name: 'arTurn', index: 'ar_turn', width: 80 }, 			
			{ label: '', name: 'caTurn', index: 'ca_turn', width: 80 }, 			
			{ label: '', name: 'faTurn', index: 'fa_turn', width: 80 }, 			
			{ label: '', name: 'assetsTurn', index: 'assets_turn', width: 80 }, 			
			{ label: '', name: 'opIncome', index: 'op_income', width: 80 }, 			
			{ label: '', name: 'valuechangeIncome', index: 'valuechange_income', width: 80 }, 			
			{ label: '', name: 'interstIncome', index: 'interst_income', width: 80 }, 			
			{ label: '', name: 'daa', index: 'daa', width: 80 }, 			
			{ label: '', name: 'ebit', index: 'ebit', width: 80 }, 			
			{ label: '', name: 'ebitda', index: 'ebitda', width: 80 }, 			
			{ label: '', name: 'fcff', index: 'fcff', width: 80 }, 			
			{ label: '', name: 'fcfe', index: 'fcfe', width: 80 }, 			
			{ label: '', name: 'currentExint', index: 'current_exint', width: 80 }, 			
			{ label: '', name: 'noncurrentExint', index: 'noncurrent_exint', width: 80 }, 			
			{ label: '', name: 'interestdebt', index: 'interestdebt', width: 80 }, 			
			{ label: '', name: 'netdebt', index: 'netdebt', width: 80 }, 			
			{ label: '', name: 'tangibleAsset', index: 'tangible_asset', width: 80 }, 			
			{ label: '', name: 'workingCapital', index: 'working_capital', width: 80 }, 			
			{ label: '', name: 'networkingCapital', index: 'networking_capital', width: 80 }, 			
			{ label: '', name: 'investCapital', index: 'invest_capital', width: 80 }, 			
			{ label: '', name: 'retainedEarnings', index: 'retained_earnings', width: 80 }, 			
			{ label: '', name: 'diluted2Eps', index: 'diluted2_eps', width: 80 }, 			
			{ label: '', name: 'bps', index: 'bps', width: 80 }, 			
			{ label: '', name: 'ocfps', index: 'ocfps', width: 80 }, 			
			{ label: '', name: 'retainedps', index: 'retainedps', width: 80 }, 			
			{ label: '', name: 'cfps', index: 'cfps', width: 80 }, 			
			{ label: '', name: 'ebitPs', index: 'ebit_ps', width: 80 }, 			
			{ label: '', name: 'fcffPs', index: 'fcff_ps', width: 80 }, 			
			{ label: '', name: 'fcfePs', index: 'fcfe_ps', width: 80 }, 			
			{ label: '', name: 'netprofitMargin', index: 'netprofit_margin', width: 80 }, 			
			{ label: '', name: 'grossprofitMargin', index: 'grossprofit_margin', width: 80 }, 			
			{ label: '', name: 'cogsOfSales', index: 'cogs_of_sales', width: 80 }, 			
			{ label: '', name: 'expenseOfSales', index: 'expense_of_sales', width: 80 }, 			
			{ label: '', name: 'profitToGr', index: 'profit_to_gr', width: 80 }, 			
			{ label: '', name: 'saleexpToGr', index: 'saleexp_to_gr', width: 80 }, 			
			{ label: '', name: 'adminexpOfGr', index: 'adminexp_of_gr', width: 80 }, 			
			{ label: '', name: 'finaexpOfGr', index: 'finaexp_of_gr', width: 80 }, 			
			{ label: '', name: 'impaiTtm', index: 'impai_ttm', width: 80 }, 			
			{ label: '', name: 'gcOfGr', index: 'gc_of_gr', width: 80 }, 			
			{ label: '', name: 'opOfGr', index: 'op_of_gr', width: 80 }, 			
			{ label: '', name: 'ebitOfGr', index: 'ebit_of_gr', width: 80 }, 			
			{ label: '', name: 'roe', index: 'roe', width: 80 }, 			
			{ label: '', name: 'roeWaa', index: 'roe_waa', width: 80 }, 			
			{ label: '', name: 'roeDt', index: 'roe_dt', width: 80 }, 			
			{ label: '', name: 'roa', index: 'roa', width: 80 }, 			
			{ label: '', name: 'npta', index: 'npta', width: 80 }, 			
			{ label: '', name: 'roic', index: 'roic', width: 80 }, 			
			{ label: '', name: 'roeYearly', index: 'roe_yearly', width: 80 }, 			
			{ label: '', name: 'roa2Yearly', index: 'roa2_yearly', width: 80 }, 			
			{ label: '', name: 'roeAvg', index: 'roe_avg', width: 80 }, 			
			{ label: '', name: 'opincomeOfEbt', index: 'opincome_of_ebt', width: 80 }, 			
			{ label: '', name: 'investincomeOfEbt', index: 'investincome_of_ebt', width: 80 }, 			
			{ label: '', name: 'nOpProfitOfEbt', index: 'n_op_profit_of_ebt', width: 80 }, 			
			{ label: '', name: 'taxToEbt', index: 'tax_to_ebt', width: 80 }, 			
			{ label: '', name: 'dtprofitToProfit', index: 'dtprofit_to_profit', width: 80 }, 			
			{ label: '', name: 'salescashToOr', index: 'salescash_to_or', width: 80 }, 			
			{ label: '', name: 'ocfToOr', index: 'ocf_to_or', width: 80 }, 			
			{ label: '', name: 'ocfToOpincome', index: 'ocf_to_opincome', width: 80 }, 			
			{ label: '', name: 'capitalizedToDa', index: 'capitalized_to_da', width: 80 }, 			
			{ label: '', name: 'debtToAssets', index: 'debt_to_assets', width: 80 }, 			
			{ label: '', name: 'assetsToEqt', index: 'assets_to_eqt', width: 80 }, 			
			{ label: '', name: 'dpAssetsToEqt', index: 'dp_assets_to_eqt', width: 80 }, 			
			{ label: '', name: 'caToAssets', index: 'ca_to_assets', width: 80 }, 			
			{ label: '', name: 'ncaToAssets', index: 'nca_to_assets', width: 80 }, 			
			{ label: '', name: 'tbassetsToTotalassets', index: 'tbassets_to_totalassets', width: 80 }, 			
			{ label: '', name: 'intToTalcap', index: 'int_to_talcap', width: 80 }, 			
			{ label: '', name: 'eqtToTalcapital', index: 'eqt_to_talcapital', width: 80 }, 			
			{ label: '', name: 'currentdebtToDebt', index: 'currentdebt_to_debt', width: 80 }, 			
			{ label: '', name: 'longdebToDebt', index: 'longdeb_to_debt', width: 80 }, 			
			{ label: '', name: 'ocfToShortdebt', index: 'ocf_to_shortdebt', width: 80 }, 			
			{ label: '', name: 'debtToEqt', index: 'debt_to_eqt', width: 80 }, 			
			{ label: '', name: 'eqtToDebt', index: 'eqt_to_debt', width: 80 }, 			
			{ label: '', name: 'eqtToInterestdebt', index: 'eqt_to_interestdebt', width: 80 }, 			
			{ label: '', name: 'tangibleassetToDebt', index: 'tangibleasset_to_debt', width: 80 }, 			
			{ label: '', name: 'tangassetToIntdebt', index: 'tangasset_to_intdebt', width: 80 }, 			
			{ label: '', name: 'tangibleassetToNetdebt', index: 'tangibleasset_to_netdebt', width: 80 }, 			
			{ label: '', name: 'ocfToDebt', index: 'ocf_to_debt', width: 80 }, 			
			{ label: '', name: 'ocfToInterestdebt', index: 'ocf_to_interestdebt', width: 80 }, 			
			{ label: '', name: 'ocfToNetdebt', index: 'ocf_to_netdebt', width: 80 }, 			
			{ label: '', name: 'ebitToInterest', index: 'ebit_to_interest', width: 80 }, 			
			{ label: '', name: 'longdebtToWorkingcapital', index: 'longdebt_to_workingcapital', width: 80 }, 			
			{ label: '', name: 'ebitdaToDebt', index: 'ebitda_to_debt', width: 80 }, 			
			{ label: '', name: 'turnDays', index: 'turn_days', width: 80 }, 			
			{ label: '', name: 'roaYearly', index: 'roa_yearly', width: 80 }, 			
			{ label: '', name: 'roaDp', index: 'roa_dp', width: 80 }, 			
			{ label: '', name: 'fixedAssets', index: 'fixed_assets', width: 80 }, 			
			{ label: '', name: 'profitPrefinExp', index: 'profit_prefin_exp', width: 80 }, 			
			{ label: '', name: 'nonOpProfit', index: 'non_op_profit', width: 80 }, 			
			{ label: '', name: 'opToEbt', index: 'op_to_ebt', width: 80 }, 			
			{ label: '', name: 'nopToEbt', index: 'nop_to_ebt', width: 80 }, 			
			{ label: '', name: 'ocfToProfit', index: 'ocf_to_profit', width: 80 }, 			
			{ label: '', name: 'cashToLiqdebt', index: 'cash_to_liqdebt', width: 80 }, 			
			{ label: '', name: 'cashToLiqdebtWithinterest', index: 'cash_to_liqdebt_withinterest', width: 80 }, 			
			{ label: '', name: 'opToLiqdebt', index: 'op_to_liqdebt', width: 80 }, 			
			{ label: '', name: 'opToDebt', index: 'op_to_debt', width: 80 }, 			
			{ label: '', name: 'roicYearly', index: 'roic_yearly', width: 80 }, 			
			{ label: '', name: 'totalFaTrun', index: 'total_fa_trun', width: 80 }, 			
			{ label: '', name: 'profitToOp', index: 'profit_to_op', width: 80 }, 			
			{ label: '', name: 'qOpincome', index: 'q_opincome', width: 80 }, 			
			{ label: '', name: 'qInvestincome', index: 'q_investincome', width: 80 }, 			
			{ label: '', name: 'qDtprofit', index: 'q_dtprofit', width: 80 }, 			
			{ label: '', name: 'qEps', index: 'q_eps', width: 80 }, 			
			{ label: '', name: 'qNetprofitMargin', index: 'q_netprofit_margin', width: 80 }, 			
			{ label: '', name: 'qGsprofitMargin', index: 'q_gsprofit_margin', width: 80 }, 			
			{ label: '', name: 'qExpToSales', index: 'q_exp_to_sales', width: 80 }, 			
			{ label: '', name: 'qProfitToGr', index: 'q_profit_to_gr', width: 80 }, 			
			{ label: '', name: 'qSaleexpToGr', index: 'q_saleexp_to_gr', width: 80 }, 			
			{ label: '', name: 'qAdminexpToGr', index: 'q_adminexp_to_gr', width: 80 }, 			
			{ label: '', name: 'qFinaexpToGr', index: 'q_finaexp_to_gr', width: 80 }, 			
			{ label: '', name: 'qImpairToGrTtm', index: 'q_impair_to_gr_ttm', width: 80 }, 			
			{ label: '', name: 'qGcToGr', index: 'q_gc_to_gr', width: 80 }, 			
			{ label: '', name: 'qOpToGr', index: 'q_op_to_gr', width: 80 }, 			
			{ label: '', name: 'qRoe', index: 'q_roe', width: 80 }, 			
			{ label: '', name: 'qDtRoe', index: 'q_dt_roe', width: 80 }, 			
			{ label: '', name: 'qNpta', index: 'q_npta', width: 80 }, 			
			{ label: '', name: 'qOpincomeToEbt', index: 'q_opincome_to_ebt', width: 80 }, 			
			{ label: '', name: 'qInvestincomeToEbt', index: 'q_investincome_to_ebt', width: 80 }, 			
			{ label: '', name: 'qDtprofitToProfit', index: 'q_dtprofit_to_profit', width: 80 }, 			
			{ label: '', name: 'qSalescashToOr', index: 'q_salescash_to_or', width: 80 }, 			
			{ label: '', name: 'qOcfToSales', index: 'q_ocf_to_sales', width: 80 }, 			
			{ label: '', name: 'qOcfToOr', index: 'q_ocf_to_or', width: 80 }, 			
			{ label: '', name: 'basicEpsYoy', index: 'basic_eps_yoy', width: 80 }, 			
			{ label: '', name: 'dtEpsYoy', index: 'dt_eps_yoy', width: 80 }, 			
			{ label: '', name: 'cfpsYoy', index: 'cfps_yoy', width: 80 }, 			
			{ label: '', name: 'opYoy', index: 'op_yoy', width: 80 }, 			
			{ label: '', name: 'ebtYoy', index: 'ebt_yoy', width: 80 }, 			
			{ label: '', name: 'netprofitYoy', index: 'netprofit_yoy', width: 80 }, 			
			{ label: '', name: 'dtNetprofitYoy', index: 'dt_netprofit_yoy', width: 80 }, 			
			{ label: '', name: 'ocfYoy', index: 'ocf_yoy', width: 80 }, 			
			{ label: '', name: 'roeYoy', index: 'roe_yoy', width: 80 }, 			
			{ label: '', name: 'bpsYoy', index: 'bps_yoy', width: 80 }, 			
			{ label: '', name: 'assetsYoy', index: 'assets_yoy', width: 80 }, 			
			{ label: '', name: 'eqtYoy', index: 'eqt_yoy', width: 80 }, 			
			{ label: '', name: 'trYoy', index: 'tr_yoy', width: 80 }, 			
			{ label: '', name: 'orYoy', index: 'or_yoy', width: 80 }, 			
			{ label: '', name: 'qGrYoy', index: 'q_gr_yoy', width: 80 }, 			
			{ label: '', name: 'qGrQoq', index: 'q_gr_qoq', width: 80 }, 			
			{ label: '', name: 'qSalesYoy', index: 'q_sales_yoy', width: 80 }, 			
			{ label: '', name: 'qSalesQoq', index: 'q_sales_qoq', width: 80 }, 			
			{ label: '', name: 'qOpYoy', index: 'q_op_yoy', width: 80 }, 			
			{ label: '', name: 'qOpQoq', index: 'q_op_qoq', width: 80 }, 			
			{ label: '', name: 'qProfitYoy', index: 'q_profit_yoy', width: 80 }, 			
			{ label: '', name: 'qProfitQoq', index: 'q_profit_qoq', width: 80 }, 			
			{ label: '', name: 'qNetprofitYoy', index: 'q_netprofit_yoy', width: 80 }, 			
			{ label: '', name: 'qNetprofitQoq', index: 'q_netprofit_qoq', width: 80 }, 			
			{ label: '', name: 'equityYoy', index: 'equity_yoy', width: 80 }, 			
			{ label: '', name: 'rdExp', index: 'rd_exp', width: 80 }, 			
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
		finaIndicator: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.finaIndicator = {};
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
                var url = vm.finaIndicator.id == null ? "sys/finaindicator/save" : "sys/finaindicator/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.finaIndicator),
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
                        url: baseURL + "sys/finaindicator/delete",
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
			$.get(baseURL + "sys/finaindicator/info/"+id, function(r){
                vm.finaIndicator = r.finaIndicator;
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