var pieChart = echarts.init(document.getElementById("echarts-pie-chart"));
var pieoption = {
	title: {
		text: '某站点用户访问来源',
		subtext: '纯属虚构',
		x: 'center'
	},
	tooltip: {
		trigger: 'item',
		formatter: "{a} <br/>{b} : {c} ({d}%)"
	},
	legend: {
		orient: 'vertical',
		x: 'left',
		data: ['直接访问', '邮件营销', '联盟广告', '视频广告', '搜索引擎']
	},
	calculable: true,
	series: [{
		name: '访问来源',
		type: 'pie',
		radius: '55%',
		center: ['50%', '60%'],
		data: [{
			value: 335,
			name: '直接访问'
		}, {
			value: 310,
			name: '邮件营销'
		}, {
			value: 234,
			name: '联盟广告'
		}, {
			value: 135,
			name: '视频广告'
		}, {
			value: 1548,
			name: '搜索引擎'
		}]
	}]
};
pieChart.setOption(pieoption);
//$(document).ready(pieChart.resize);
//$(window).resize(pieChart.resize);
/*window.onresize = pieChart.resize;*/

//$(document).ready()


var lineChart = echarts.init(document.getElementById("echarts-line-chart"));
var lineoption = {
	title: {
		text: '未来一周气温变化'
	},
	tooltip: {
		trigger: 'axis'
	},
	legend: {
		data: ['最高气温', '最低气温']
	},
	grid: {
		x: 40,
		x2: 40,
		y2: 24
	},
	calculable: true,
	xAxis: [{
		type: 'category',
		boundaryGap: false,
		data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日']
	}],
	yAxis: [{
		type: 'value',
		axisLabel: {
			formatter: '{value} °C'
		}
	}],
	series: [{
		name: '最高气温',
		type: 'line',
		data: [11, 11, 15, 13, 12, 13, 10],
		markPoint: {
			data: [{
				type: 'max',
				name: '最大值'
			}, {
				type: 'min',
				name: '最小值'
			}]
		},
		markLine: {
			data: [{
				type: 'average',
				name: '平均值'
			}]
		}
	}, {
		name: '最低气温',
		type: 'line',
		data: [1, -2, 2, 5, 3, 2, 0],
		markPoint: {
			data: [{
				name: '周最低',
				value: -2,
				xAxis: 1,
				yAxis: -1.5
			}]
		},
		markLine: {
			data: [{
				type: 'average',
				name: '平均值'
			}]
		}
	}]
};
lineChart.setOption(lineoption);
//$(window).resize(lineChart.resize);
//$(document).ready(lineChart());
//window.onload=  lineChart;
//window.onresize = lineChart.resize;