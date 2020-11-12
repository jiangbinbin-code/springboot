$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/income/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'annDate', index: 'ann_date', width: 80 }, 			
			{ label: '', name: 'fAnnDate', index: 'f_ann_date', width: 80 }, 			
			{ label: '', name: 'endDate', index: 'end_date', width: 80 }, 			
			{ label: '', name: 'reportType', index: 'report_type', width: 80 }, 			
			{ label: '', name: 'compType', index: 'comp_type', width: 80 }, 			
			{ label: '', name: 'basicEps', index: 'basic_eps', width: 80 }, 			
			{ label: '', name: 'dilutedEps', index: 'diluted_eps', width: 80 }, 			
			{ label: '', name: 'totalRevenue', index: 'total_revenue', width: 80 }, 			
			{ label: '', name: 'revenue', index: 'revenue', width: 80 }, 			
			{ label: '', name: 'intIncome', index: 'int_income', width: 80 }, 			
			{ label: '', name: 'premEarned', index: 'prem_earned', width: 80 }, 			
			{ label: '', name: 'commIncome', index: 'comm_income', width: 80 }, 			
			{ label: '', name: 'nCommisIncome', index: 'n_commis_income', width: 80 }, 			
			{ label: '', name: 'nOthIncome', index: 'n_oth_income', width: 80 }, 			
			{ label: '', name: 'nOthBIncome', index: 'n_oth_b_income', width: 80 }, 			
			{ label: '', name: 'premIncome', index: 'prem_income', width: 80 }, 			
			{ label: '', name: 'outPrem', index: 'out_prem', width: 80 }, 			
			{ label: '', name: 'unePremReser', index: 'une_prem_reser', width: 80 }, 			
			{ label: '', name: 'reinsIncome', index: 'reins_income', width: 80 }, 			
			{ label: '', name: 'nSecTbIncome', index: 'n_sec_tb_income', width: 80 }, 			
			{ label: '', name: 'nSecUwIncome', index: 'n_sec_uw_income', width: 80 }, 			
			{ label: '', name: 'nAssetMgIncome', index: 'n_asset_mg_income', width: 80 }, 			
			{ label: '', name: 'othBIncome', index: 'oth_b_income', width: 80 }, 			
			{ label: '', name: 'fvValueChgGain', index: 'fv_value_chg_gain', width: 80 }, 			
			{ label: '', name: 'investIncome', index: 'invest_income', width: 80 }, 			
			{ label: '', name: 'assInvestIncome', index: 'ass_invest_income', width: 80 }, 			
			{ label: '', name: 'forexGain', index: 'forex_gain', width: 80 }, 			
			{ label: '', name: 'totalCogs', index: 'total_cogs', width: 80 }, 			
			{ label: '', name: 'operCost', index: 'oper_cost', width: 80 }, 			
			{ label: '', name: 'intExp', index: 'int_exp', width: 80 }, 			
			{ label: '', name: 'commExp', index: 'comm_exp', width: 80 }, 			
			{ label: '', name: 'bizTaxSurchg', index: 'biz_tax_surchg', width: 80 }, 			
			{ label: '', name: 'sellExp', index: 'sell_exp', width: 80 }, 			
			{ label: '', name: 'adminExp', index: 'admin_exp', width: 80 }, 			
			{ label: '', name: 'finExp', index: 'fin_exp', width: 80 }, 			
			{ label: '', name: 'assetsImpairLoss', index: 'assets_impair_loss', width: 80 }, 			
			{ label: '', name: 'premRefund', index: 'prem_refund', width: 80 }, 			
			{ label: '', name: 'compensPayout', index: 'compens_payout', width: 80 }, 			
			{ label: '', name: 'reserInsurLiab', index: 'reser_insur_liab', width: 80 }, 			
			{ label: '', name: 'divPayt', index: 'div_payt', width: 80 }, 			
			{ label: '', name: 'reinsExp', index: 'reins_exp', width: 80 }, 			
			{ label: '', name: 'operExp', index: 'oper_exp', width: 80 }, 			
			{ label: '', name: 'compensPayoutRefu', index: 'compens_payout_refu', width: 80 }, 			
			{ label: '', name: 'insurReserRefu', index: 'insur_reser_refu', width: 80 }, 			
			{ label: '', name: 'reinsCostRefund', index: 'reins_cost_refund', width: 80 }, 			
			{ label: '', name: 'otherBusCost', index: 'other_bus_cost', width: 80 }, 			
			{ label: '', name: 'operateProfit', index: 'operate_profit', width: 80 }, 			
			{ label: '', name: 'nonOperIncome', index: 'non_oper_income', width: 80 }, 			
			{ label: '', name: 'nonOperExp', index: 'non_oper_exp', width: 80 }, 			
			{ label: '', name: 'ncaDisploss', index: 'nca_disploss', width: 80 }, 			
			{ label: '', name: 'totalProfit', index: 'total_profit', width: 80 }, 			
			{ label: '', name: 'incomeTax', index: 'income_tax', width: 80 }, 			
			{ label: '', name: 'nIncome', index: 'n_income', width: 80 }, 			
			{ label: '', name: 'nIncomeAttrP', index: 'n_income_attr_p', width: 80 }, 			
			{ label: '', name: 'minorityGain', index: 'minority_gain', width: 80 }, 			
			{ label: '', name: 'othComprIncome', index: 'oth_compr_income', width: 80 }, 			
			{ label: '', name: 'tComprIncome', index: 't_compr_income', width: 80 }, 			
			{ label: '', name: 'comprIncAttrP', index: 'compr_inc_attr_p', width: 80 }, 			
			{ label: '', name: 'comprIncAttrMS', index: 'compr_inc_attr_m_s', width: 80 }, 			
			{ label: '', name: 'ebit', index: 'ebit', width: 80 }, 			
			{ label: '', name: 'ebitda', index: 'ebitda', width: 80 }, 			
			{ label: '', name: 'insuranceExp', index: 'insurance_exp', width: 80 }, 			
			{ label: '', name: 'undistProfit', index: 'undist_profit', width: 80 }, 			
			{ label: '', name: 'distableProfit', index: 'distable_profit', width: 80 }, 			
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
		income: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.income = {};
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
                var url = vm.income.id == null ? "sys/income/save" : "sys/income/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.income),
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
                        url: baseURL + "sys/income/delete",
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
			$.get(baseURL + "sys/income/info/"+id, function(r){
                vm.income = r.income;
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