$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/fundcompany/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'name', index: 'name', width: 80 }, 			
			{ label: '', name: 'shortname', index: 'shortname', width: 80 }, 			
			{ label: '', name: 'shortEnname', index: 'short_enname', width: 80 }, 			
			{ label: '', name: 'province', index: 'province', width: 80 }, 			
			{ label: '', name: 'city', index: 'city', width: 80 }, 			
			{ label: '', name: 'address', index: 'address', width: 80 }, 			
			{ label: '', name: 'phone', index: 'phone', width: 80 }, 			
			{ label: '', name: 'office', index: 'office', width: 80 }, 			
			{ label: '', name: 'website', index: 'website', width: 80 }, 			
			{ label: '', name: 'chairman', index: 'chairman', width: 80 }, 			
			{ label: '', name: 'manager', index: 'manager', width: 80 }, 			
			{ label: '', name: 'regCapital', index: 'reg_capital', width: 80 }, 			
			{ label: '', name: 'setupDate', index: 'setup_date', width: 80 }, 			
			{ label: '', name: 'endDate', index: 'end_date', width: 80 }, 			
			{ label: '', name: 'employees', index: 'employees', width: 80 }, 			
			{ label: '', name: 'mainBusiness', index: 'main_business', width: 80 }, 			
			{ label: '', name: 'orgCode', index: 'org_code', width: 80 }, 			
			{ label: '', name: 'creditCode', index: 'credit_code', width: 80 }			
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
		fundCompany: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.fundCompany = {};
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
                var url = vm.fundCompany.id == null ? "sys/fundcompany/save" : "sys/fundcompany/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.fundCompany),
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
                        url: baseURL + "sys/fundcompany/delete",
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
			$.get(baseURL + "sys/fundcompany/info/"+id, function(r){
                vm.fundCompany = r.fundCompany;
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