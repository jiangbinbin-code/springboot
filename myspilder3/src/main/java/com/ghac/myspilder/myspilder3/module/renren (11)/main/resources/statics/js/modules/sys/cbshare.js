$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/cbshare/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'tsCode', index: 'ts_code', width: 80 }, 			
			{ label: '', name: 'bondShortName', index: 'bond_short_name', width: 80 }, 			
			{ label: '', name: 'publishDate', index: 'publish_date', width: 80 }, 			
			{ label: '', name: 'endDate', index: 'end_date', width: 80 }, 			
			{ label: '', name: 'issueSize', index: 'issue_size', width: 80 }, 			
			{ label: '', name: 'convertPriceInitial', index: 'convert_price_initial', width: 80 }, 			
			{ label: '', name: 'convertPrice', index: 'convert_price', width: 80 }, 			
			{ label: '', name: 'convertVal', index: 'convert_val', width: 80 }, 			
			{ label: '', name: 'convertVol', index: 'convert_vol', width: 80 }, 			
			{ label: '', name: 'convertRatio', index: 'convert_ratio', width: 80 }, 			
			{ label: '', name: 'accConvertVal', index: 'acc_convert_val', width: 80 }, 			
			{ label: '', name: 'accConvertVol', index: 'acc_convert_vol', width: 80 }, 			
			{ label: '', name: 'accConvertRatio', index: 'acc_convert_ratio', width: 80 }, 			
			{ label: '', name: 'remainSize', index: 'remain_size', width: 80 }, 			
			{ label: '', name: 'totalShares', index: 'total_shares', width: 80 }			
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
		cbShare: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.cbShare = {};
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
                var url = vm.cbShare.id == null ? "sys/cbshare/save" : "sys/cbshare/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.cbShare),
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
                        url: baseURL + "sys/cbshare/delete",
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
			$.get(baseURL + "sys/cbshare/info/"+id, function(r){
                vm.cbShare = r.cbShare;
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