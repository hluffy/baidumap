<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> 
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=oEPhemHF86gtygZBvz8c3QAuAAcBrHut"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/library/Heatmap/2.0/src/Heatmap_min.js"></script>
    <title>热力图功能示例</title>
    <style type="text/css">
		ul,li{list-style: none;margin:0;padding:0;float:left;}
		html{height:100%}
		body{height:100%;margin:0px;padding:0px;font-family:"微软雅黑";}
		#container{height:100%;width:100%;}
		#r-result{width:100%;}
    </style>	
</head>
<body>
	<div id="container"></div>
<!-- 	<div id="r-result"> -->
<!-- 		<input type="button"  onclick="openHeatmap();" value="显示热力图"/><input type="button"  onclick="closeHeatmap();" value="关闭热力图"/> -->
<!-- 	</div> -->
</body>
</html>
<script src="js/jquery-2.1.4.min.js"></script>
<script type="text/javascript">
$(function(){
	var map = new BMap.Map("container");
	var point = new BMap.Point(116.418261,39.921984);
	map.centerAndZoom(point,15);
	map.enableScrollWheelZoom();
	var point = new Array();
	$.ajax({
		type:"post",
		url:"http://localhost:8080/baidumap/map/getinfos.ll",
		type:"json",
		success:function(data){
			var infos = data.data;
			for(var i =0;i<infos.length;i++){
// 				point[i] = {"lng":infos[i].xloc,"lat":infos[i].yloc};
				point = new BMap.Point(infos[i].xloc,infos[i].yloc);
				var marker = new BMap.Marker(point);        // 创建标注    
				map.addOverlay(marker);
			}
		}
	});
	
	
	
	 
	
	
	
});


</script>