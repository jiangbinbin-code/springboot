$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/fundbasic/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'name', index: 'name', width: 80 }, 			
			{ label: '', name: 'management', index: 'management', width: 80 }, 			
			{ label: '', name: 'custodian', index: 'custodian', width: 80 }, 			
			{ label: '', name: 'fundType', index: 'fund_type', width: 80 }, 			
			{ label: '', name: 'foundDate', index: 'found_date', width: 80 }, 			
			{ label: '', name: 'dueDate', index: 'due_date', width: 80 }, 			
			{ label: '', name: 'listDate', index: 'list_date', width: 80 }, 			
			{ label: '', name: 'issueDate', index: 'issue_date', width: 80 }, 			
			{ label: '', name: 'delistDate', index: 'delist_date', width: 80 }, 			
			{ label: '', name: 'issueAmount', index: 'issue_amount', width: 80 }, 			
			{ label: '', name: 'mFee', index: 'm_fee', width: 80 }, 			
			{ label: '', name: 'cFee', index: 'c_fee', width: 80 }, 			
			{ label: '', name: 'durationYear', index: 'duration_year', width: 80 }, 			
			{ label: '', name: 'pValue', index: 'p_value', width: 80 }, 			
			{ label: '', name: 'minAmount', index: 'min_amount', width: 80 }, 			
			{ label: '', name: 'expReturn', index: 'exp_return', width: 80 }, 			
			{ label: '', name: 'benchmark', index: 'benchmark', width: 80 }, 			
			{ label: '', name: 'status', index: 'status', width: 80 }, 			
			{ label: '', name: 'investType', index: 'invest_type', width: 80 }, 			
			{ label: '', name: 'type', index: 'type', width: 80 }, 			
			{ label: '', name: 'trustee', index: 'trustee', width: 80 }, 			
			{ label: '', name: 'purcStartdate', index: 'purc_startdate', width: 80 }, 			
			{ label: '', name: 'redmStartdate', index: 'redm_startdate', width: 80 }, 			
			{ label: '', name: 'market', index: 'market', width: 80 }			
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
		fundBasic: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.fundBasic = {};
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
                var url = vm.fundBasic.id == null ? "sys/fundbasic/save" : "sys/fundbasic/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.fundBasic),
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
                        url: baseURL + "sys/fundbasic/delete",
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
			$.get(baseURL + "sys/fundbasic/info/"+id, function(r){
                vm.fundBasic = r.fundBasic;
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