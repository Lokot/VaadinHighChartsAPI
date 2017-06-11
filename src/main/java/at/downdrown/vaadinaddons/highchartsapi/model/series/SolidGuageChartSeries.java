package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;


public class SolidGuageChartSeries extends HighChartsSeriesImpl {
	
	public SolidGuageChartSeries(String name) {
		this.name = name;
        chartType = ChartType.SOLIDGAUGE;
    }
}
