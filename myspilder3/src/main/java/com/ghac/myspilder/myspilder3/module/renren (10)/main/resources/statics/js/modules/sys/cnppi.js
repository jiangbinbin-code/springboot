$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/cnppi/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'month', index: 'month', width: 80 }, 			
			{ label: '', name: 'ppiYoy', index: 'ppi_yoy', width: 80 }, 			
			{ label: '', name: 'ppiMpYoy', index: 'ppi_mp_yoy', width: 80 }, 			
			{ label: '', name: 'ppiMpQmYoy', index: 'ppi_mp_qm_yoy', width: 80 }, 			
			{ label: '', name: 'ppiMpRmYoy', index: 'ppi_mp_rm_yoy', width: 80 }, 			
			{ label: '', name: 'ppiMpPYoy', index: 'ppi_mp_p_yoy', width: 80 }, 			
			{ label: '', name: 'ppiCgYoy', index: 'ppi_cg_yoy', width: 80 }, 			
			{ label: '', name: 'ppiCgFYoy', index: 'ppi_cg_f_yoy', width: 80 }, 			
			{ label: '', name: 'ppiCgCYoy', index: 'ppi_cg_c_yoy', width: 80 }, 			
			{ label: '', name: 'ppiCgAduYoy', index: 'ppi_cg_adu_yoy', width: 80 }, 			
			{ label: '', name: 'ppiCgDcgYoy', index: 'ppi_cg_dcg_yoy', width: 80 }, 			
			{ label: '', name: 'ppiMom', index: 'ppi_mom', width: 80 }, 			
			{ label: '', name: 'ppiMpMom', index: 'ppi_mp_mom', width: 80 }, 			
			{ label: '', name: 'ppiMpQmMom', index: 'ppi_mp_qm_mom', width: 80 }, 			
			{ label: '', name: 'ppiMpRmMom', index: 'ppi_mp_rm_mom', width: 80 }, 			
			{ label: '', name: 'ppiMpPMom', index: 'ppi_mp_p_mom', width: 80 }, 			
			{ label: '', name: 'ppiCgMom', index: 'ppi_cg_mom', width: 80 }, 			
			{ label: '', name: 'ppiCgFMom', index: 'ppi_cg_f_mom', width: 80 }, 			
			{ label: '', name: 'ppiCgCMom', index: 'ppi_cg_c_mom', width: 80 }, 			
			{ label: '', name: 'ppiCgAduMom', index: 'ppi_cg_adu_mom', width: 80 }, 			
			{ label: '', name: 'ppiCgDcgMom', index: 'ppi_cg_dcg_mom', width: 80 }, 			
			{ label: '', name: 'ppiAccu', index: 'ppi_accu', width: 80 }, 			
			{ label: '', name: 'ppiMpAccu', index: 'ppi_mp_accu', width: 80 }, 			
			{ label: '', name: 'ppiMpQmAccu', index: 'ppi_mp_qm_accu', width: 80 }, 			
			{ label: '', name: 'ppiMpRmAccu', index: 'ppi_mp_rm_accu', width: 80 }, 			
			{ label: '', name: 'ppiMpPAccu', index: 'ppi_mp_p_accu', width: 80 }, 			
			{ label: '', name: 'ppiCgAccu', index: 'ppi_cg_accu', width: 80 }, 			
			{ label: '', name: 'ppiCgFAccu', index: 'ppi_cg_f_accu', width: 80 }, 			
			{ label: '', name: 'ppiCgCAccu', index: 'ppi_cg_c_accu', width: 80 }, 			
			{ label: '', name: 'ppiCgAduAccu', index: 'ppi_cg_adu_accu', width: 80 }, 			
			{ label: '', name: 'ppiCgDcgAccu', index: 'ppi_cg_dcg_accu', width: 80 }			
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
		cnPpi: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.cnPpi = {};
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
                var url = vm.cnPpi.id == null ? "sys/cnppi/save" : "sys/cnppi/update";
                $.ajax({
                    type: "POST",
                    url: baseURL + url,
                    contentType: "application/json",
                    data: JSON.stringify(vm.cnPpi),
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
                        url: baseURL + "sys/cnppi/delete",
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
			$.get(baseURL + "sys/cnppi/info/"+id, function(r){
                vm.cnPpi = r.cnPpi;
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