package at.downdrown.vaadinaddons.highchartsapi.model;

public class PaneOptions implements HighchartsObject {
	
	private int startAngle;
	private int endAngle;
	
	public PaneOptions() {
		super();
	}

	public PaneOptions(int startAngle, int endAngle) {
		super();
		this.startAngle = startAngle;
		this.endAngle = endAngle;
	}

	public int getStartAngle() {
		return startAngle;
	}

	public void setStartAngle(int startAngle) {
		this.startAngle = startAngle;
	}

	public int getEndAngle() {
		return endAngle;
	}

	public void setEndAngle(int endAngle) {
		this.endAngle = endAngle;
	}

	@Override
	public String getHighChartValue() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		builder.append("startAngle: " + startAngle + ",");
		builder.append("endAngle: " + endAngle);
		builder.append(" }");
		return builder.toString();
	}

}
