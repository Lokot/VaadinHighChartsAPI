package at.downdrown.vaadinaddons.highchartsapi.model.series;

import java.util.ArrayList;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;


public class GuageChartSeries extends HighChartsSeriesImpl {
	
//    tooltip: {
//        valueSuffix: ' °C'
//    }

	public GuageChartSeries(String name) {
        chartType = ChartType.GAUGE;
        this.name = name;
    }

//    @Override
//    public String getHighChartValue() {
//        return "{ name: '" + this.name + "', type: '" + this.chartType.name().toLowerCase() + "', data: " + this.data + " }";
//    }

}
