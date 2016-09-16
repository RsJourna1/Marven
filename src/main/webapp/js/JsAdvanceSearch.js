	$(function() {
		$("#ul_select").find(".dl").children("dd").click(function() { //每个条件分类行绑定点击事件
			$(this).addClass("selected").siblings("dd").removeClass("selected"); //当前元素选中，其余删除选中样式
			var index = $(this).parents(".select-list").index(); //获取父级索引index
			var goods = $(this).children("a").text(); //获取当前条件名称
			//$("#select_" + index).remove(); //删除当前索引的筛选,2016年3月29日
			//console.log($("#dl_result").text().indexOf(goods));
			
			if (goods != 'All' && ($("#dl_result").text().indexOf(goods) == -1)) { //若不是all并且筛选区域找不到当前标签则在筛选区域添加条件
				$("#dl_result").append("<dd id='select_" + index + "' class='selected' onclick=removeChose($(this),'" + index + "')><a href='#'>" + goods + "</a></dd>");
			} else if(goods == 'All'){
				//console.log($("#dl_result").find("#select_1").length);
				//console.log(index);
				while($("#dl_result").find("#select_" + index).length == 1){//如果找到了select_index这个id则循环删除，all的作用完成
					//console.log($("#dl_result").text().indexOf("#select_" + index));
					$("#select_" + index).remove();	
				}
			}
			
			getResult();
		})
	});
	

	function removeChose(obj, index) { //删除筛选
		$("#ul_select").children(".select-list").eq(index).find(".selected").removeClass("selected"); //删除条件选中样式
		$("#ul_select").children(".select-list").eq(index).find("dd").eq(0).addClass("selected"); //给全部添加选中样式
		obj.remove(); //当前按钮删除
		getResult();
	}

	function getResult() { //结果处理
		var len_chose = $("#dl_result").children(".selected").length;
		if (len_chose > 0) { //若是筛选区域选中项大于0
			$(".select-no").hide(); //暂时没有选择过滤条件 隐藏
		} else {
			$(".select-no").show(); //暂时没有选择过滤条件 显示
		}
	}