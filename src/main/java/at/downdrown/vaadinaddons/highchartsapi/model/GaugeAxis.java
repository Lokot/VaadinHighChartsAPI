package at.downdrown.vaadinaddons.highchartsapi.model;

import java.util.ArrayList;
import java.util.List;

import at.downdrown.vaadinaddons.highchartsapi.exceptions.HighChartsException;

import com.vaadin.shared.ui.colorpicker.Color;

public class GaugeAxis extends Axis {

	private Number min;
	private Number max;
	private List<PlotBand> plotBands = new ArrayList<>();
	private List<Stop> stops = new ArrayList<>();

	/**
	 * Default constructor.
	 * 
	 * @param axisType
	 *            - Type of axis you want to create.
	 */
	public GaugeAxis(AxisType axisType) {
		super(axisType);
	}

	public String getHighChartValue() throws HighChartsException {

		if (getAxisType() == null)
			throw new HighChartsException(
					"No AxisType was set to the passed Axis object.");

		StringBuilder builder = new StringBuilder();
		builder.append(getAxisType().name() + ": { ");

		// Axis Title
		if (getTitle() != null) {
			builder.append("title : { text: '" + getTitle() + "' }");
		} else {
			builder.append("title : { text: null }");
		}

		builder.append(", min: " + this.min);
		builder.append(", max: " + this.max);
		
		if (stops.size() > 0) {
			builder.append(", stops: [");
			boolean first = true;
			for (Stop stop : stops) {
				if (first) {
					first = false;
				} else {
					builder.append(",");
				}
				builder.append(stop.getHighChartValue());
			}
			builder.append(" ]");

		}
		
		if (plotBands.size() > 0) {
			builder.append(", plotBands: [");
			boolean first = true;
			for (PlotBand plotBand : plotBands) {
				if (first) {
					first = false;
				} else {
					builder.append(",");
				}
				builder.append(plotBand.getHighChartValue());
			}
			builder.append(" ]");

		}
		// Close Tag
		builder.append(" }");
		return builder.toString();
	}

	public Number getMin() {
		return min;
	}

	public void setMin(Number min) {
		this.min = min;
	}

	public Number getMax() {
		return max;
	}

	public void setMax(Number max) {
		this.max = max;
	}

	public List<PlotBand> getPlotBands() {
		return plotBands;
	}

	public void setPlotBands(List<PlotBand> plotBands) {
		this.plotBands = plotBands;
	}

	public void addPlotBand(Number from, Number to, Color color) {
		plotBands.add(new PlotBand(from, to, color));
	}

	public void addPlotBand(PlotBand plotBand) {
		plotBands.add(plotBand);
	}
	
	public void addStop(float val, Color color) {
		stops.add(new Stop(val, color));
	}

	public void addStop(Stop stop) {
		stops.add(stop);
	}

	public class PlotBand {

		private Number from;
		private Number to;
		private Color color;

		public PlotBand(Number from, Number to, Color color) {
			this.from = from;
			this.to = to;
			this.color = color;
		}

		public String getHighChartValue() throws HighChartsException {
			StringBuilder builder = new StringBuilder();
			builder.append("{ ");
			builder.append("from : " + this.from.toString() + ", ");
			builder.append("to : " + this.to.toString() + ", ");
			builder.append("color : '" + this.color.getCSS() + "' ");
			// Close Tag
			builder.append(" }");
			return builder.toString();
		}
	}
	
	public class Stop {

		private Float val;
		private Color color;

		public Stop(float val, Color color) {
			this.val = val;
			this.color = color;
		}

		public String getHighChartValue() throws HighChartsException {
			StringBuilder builder = new StringBuilder();
			builder.append("[ ");
			builder.append(this.val.toString() + ", ");
			builder.append("'" + this.color.getCSS() + "' ");
			// Close Tag
			builder.append("]");
			return builder.toString();
		}

	}
}
