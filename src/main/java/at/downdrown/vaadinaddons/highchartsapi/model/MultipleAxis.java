package at.downdrown.vaadinaddons.highchartsapi.model;

import java.util.ArrayList;
import java.util.List;

import at.downdrown.vaadinaddons.highchartsapi.exceptions.HighChartsException;

public class MultipleAxis extends Axis {

	private List<Axis> axisSet = new ArrayList<>();
	
	public MultipleAxis(AxisType axisType) {
        super(axisType);
    }

	public List<Axis> getAxisSet() {
		return axisSet;
	}

	public void setAxisSet(List<Axis> axisSet) {
		this.axisSet = axisSet;
	}

	public void addAxis(Axis axis) {
		axisSet.add(axis);
	}

	@Override
	public String getHighChartValue() throws HighChartsException {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getAxisType().name() + ": [ ");

		int i = 0;
		for (Axis axis : axisSet) {
			if (i > 0) builder.append(",");
			builder.append(axis.getHighChartValue().replaceFirst("yAxis:", ""));
			i++;
		}

		// Close Tag
		builder.append("]");

		return builder.toString();
	}
}
