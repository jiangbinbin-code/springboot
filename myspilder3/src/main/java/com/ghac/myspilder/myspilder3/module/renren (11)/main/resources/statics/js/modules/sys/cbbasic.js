$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/cbbasic/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'bondFullName', index: 'bond_full_name', width: 80 }, 			
			{ label: '', name: 'bondShortName', index: 'bond_short_name', width: 80 }, 			
			{ label: '', name: 'cbCode', index: 'cb_code', width: 80 }, 			
			{ label: '', name: 'stkCode', index: 'stk_code', width: 80 }, 			
			{ label: '', name: 'stkShortName', index: 'stk_short_name', width: 80 }, 			
			{ label: '', name: 'maturity', index: 'maturity', width: 80 }, 			
			{ label: '', name: 'par', index: 'par', width: 80 }, 			
			{ label: '', name: 'issuePrice', index: 'issue_price', width: 80 }, 			
			{ label: '', name: 'issueSize', index: 'issue_size', width: 80 }, 			
			{ label: '', name: 'remainSize', index: 'remain_size', width: 80 }, 			
			{ label: '', name: 'valueDate', index: 'value_date', width: 80 }, 			
			{ label: '', name: 'maturityDate', index: 'maturity_date', width: 80 }, 			
			{ label: '', name: 'rateType', index: 'rate_type', width: 80 }, 			
			{ label: '', name: 'couponRate', index: 'coupon_rate', width: 80 }, 			
			{ label: '', name: 'addRate', index: 'add_rate', width: 80 }, 			
			{ label: '', name: 'payPerYear', index: 'pay_per_year', width: 80 }, 			
			{ label: '', name: 'listDate', index: 'list_date', width: 80 }, 			
			{ label: '', name: 'delistDate', index: 'delist_date', width: 80 }, 			
			{ label: '', name: 'exchange', index: 'exchange', width: 80 }, 			
			{ label: '', name: 'convStartDate', index: 'conv_start_date', width: 80 }, 			
			{ label: '', name: 'convEndDate', index: 'conv_end_date', width: 80 }, 			
			{ label: '', name: 'firstConvPrice', index: 'first_conv_price', width: 80 }, 			
			{ label: '', name: 'convPrice', index: 'conv_price', width: 80 }, 			
			{ label: '', name: 'rateClause', index: 'rate_clause', width: 80 }, 			
			{ label: '', name: 'putClause', index: 'put_clause', width: 80 }, 			
			{ label: '', name: 'maturityPutPrice', index: 'maturity_put_price', width: 80 }, 			
			{ label: '', name: 'callClause', index: 'call_clause', width: 80 }, 			
			{ label: '', name: 'resetClause', index: 'reset_clause', width: 80 }, 			
			{ label: '', name: 'convClause', index: 'conv_clause', width: 80 }, 			
			{ label: '', name: 'guarantor', index: 'guarantor', width: 80 }, 			
			{ label: '', name: 'guaranteeType', index: 'guarantee_type', width: 80 }, 			
			{ label: '', name: 'issueRating', index: 'issue_rating', width: 80 }, 			
			{ label: '', name: 'newestRating', index: 'newest_rating', width: 80 }, 			
			{ label: '', name: 'ratingComp', index: 'rating_comp', width: 80 }			
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
		cbBasic: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.cbBasic = {};
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
                var url = vm.cbBasic.id == null ? "sys/cbbasic/save" : "sys/cbbasic/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.cbBasic),
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
                        url: baseURL + "sys/cbbasic/delete",
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
			$.get(baseURL + "sys/cbbasic/info/"+id, function(r){
                vm.cbBasic = r.cbBasic;
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