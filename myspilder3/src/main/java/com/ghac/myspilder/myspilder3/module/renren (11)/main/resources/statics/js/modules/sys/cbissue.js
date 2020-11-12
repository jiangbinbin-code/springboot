$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/cbissue/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'annDate', index: 'ann_date', width: 80 }, 			
			{ label: '', name: 'resAnnDate', index: 'res_ann_date', width: 80 }, 			
			{ label: '', name: 'planIssueSize', index: 'plan_issue_size', width: 80 }, 			
			{ label: '', name: 'issueSize', index: 'issue_size', width: 80 }, 			
			{ label: '', name: 'issuePrice', index: 'issue_price', width: 80 }, 			
			{ label: '', name: 'issueType', index: 'issue_type', width: 80 }, 			
			{ label: '', name: 'issueCost', index: 'issue_cost', width: 80 }, 			
			{ label: '', name: 'onlCode', index: 'onl_code', width: 80 }, 			
			{ label: '', name: 'onlName', index: 'onl_name', width: 80 }, 			
			{ label: '', name: 'onlDate', index: 'onl_date', width: 80 }, 			
			{ label: '', name: 'onlSize', index: 'onl_size', width: 80 }, 			
			{ label: '', name: 'onlPchVol', index: 'onl_pch_vol', width: 80 }, 			
			{ label: '', name: 'onlPchNum', index: 'onl_pch_num', width: 80 }, 			
			{ label: '', name: 'onlPchExcess', index: 'onl_pch_excess', width: 80 }, 			
			{ label: '', name: 'onlWinningRate', index: 'onl_winning_rate', width: 80 }, 			
			{ label: '', name: 'shdRationCode', index: 'shd_ration_code', width: 80 }, 			
			{ label: '', name: 'shdRationName', index: 'shd_ration_name', width: 80 }, 			
			{ label: '', name: 'shdRationDate', index: 'shd_ration_date', width: 80 }, 			
			{ label: '', name: 'shdRationRecordDate', index: 'shd_ration_record_date', width: 80 }, 			
			{ label: '', name: 'shdRationPayDate', index: 'shd_ration_pay_date', width: 80 }, 			
			{ label: '', name: 'shdRationPrice', index: 'shd_ration_price', width: 80 }, 			
			{ label: '', name: 'shdRationRatio', index: 'shd_ration_ratio', width: 80 }, 			
			{ label: '', name: 'shdRationSize', index: 'shd_ration_size', width: 80 }, 			
			{ label: '', name: 'shdRationVol', index: 'shd_ration_vol', width: 80 }, 			
			{ label: '', name: 'shdRationNum', index: 'shd_ration_num', width: 80 }, 			
			{ label: '', name: 'shdRationExcess', index: 'shd_ration_excess', width: 80 }, 			
			{ label: '', name: 'offlSize', index: 'offl_size', width: 80 }, 			
			{ label: '', name: 'offlDeposit', index: 'offl_deposit', width: 80 }, 			
			{ label: '', name: 'offlPchVol', index: 'offl_pch_vol', width: 80 }, 			
			{ label: '', name: 'offlPchNum', index: 'offl_pch_num', width: 80 }, 			
			{ label: '', name: 'offlPchExcess', index: 'offl_pch_excess', width: 80 }, 			
			{ label: '', name: 'offlWinningRate', index: 'offl_winning_rate', width: 80 }, 			
			{ label: '', name: 'leadUnderwriter', index: 'lead_underwriter', width: 80 }, 			
			{ label: '', name: 'leadUnderwriterVol', index: 'lead_underwriter_vol', width: 80 }			
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
		cbIssue: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.cbIssue = {};
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
                var url = vm.cbIssue.id == null ? "sys/cbissue/save" : "sys/cbissue/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.cbIssue),
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
                        url: baseURL + "sys/cbissue/delete",
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
			$.get(baseURL + "sys/cbissue/info/"+id, function(r){
                vm.cbIssue = r.cbIssue;
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