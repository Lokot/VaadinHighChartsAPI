package at.downdrown.vaadinaddons.highchartsapi.model.data.base;

public class NomberNomberData implements HighChartsBaseData {
	private Number xVal;
	private Number yVal;

	public NomberNomberData(Number xVal, Number yVal) {
		super();
		this.xVal = xVal;
		this.yVal = yVal;
	}

	public Number getxVal() {
		return xVal;
	}

	public void setxVal(Number xVal) {
		this.xVal = xVal;
	}

	public Number getyVal() {
		return yVal;
	}

	public void setyVal(Number yVal) {
		this.yVal = yVal;
	}

	@Override
	public String getHighChartValue() {
		return "[" + xVal + ", " + yVal + "]";
	}

	@Override
	public String toString() {
		return this.getHighChartValue();
	}

}
