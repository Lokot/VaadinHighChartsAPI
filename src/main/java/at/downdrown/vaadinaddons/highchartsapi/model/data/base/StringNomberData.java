package at.downdrown.vaadinaddons.highchartsapi.model.data.base;

/**
 * You can use this type of data if you want to specify the name of your values.
 * The name will be displayed in a tooltip if you hover over your points.
 */
public class StringNomberData implements HighChartsBaseData {
    private String name;
    private Number value;

    public StringNomberData(String name, Number value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    @Override
    public String getHighChartValue() {
        return "['" + name + "', " + value + "]";
    }

    @Override
    public String toString() {
        return this.getHighChartValue();
    }
}
