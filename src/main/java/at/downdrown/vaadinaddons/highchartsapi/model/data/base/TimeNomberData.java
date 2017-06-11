package at.downdrown.vaadinaddons.highchartsapi.model.data.base;


public class TimeNomberData implements HighChartsBaseData {
    private long time;
    private Number value;

    public TimeNomberData(long name, Number value) {
        this.time = name;
        this.value = value;
    }

    public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    @Override
    public String getHighChartValue() {
        return "[" + time + ", " + String.valueOf(value) + "]";
    }

    @Override
    public String toString() {
        return this.getHighChartValue();
    }

}
