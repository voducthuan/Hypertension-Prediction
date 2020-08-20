package hypertension;

public class BeliefRow {
    private String name;
    private double value;
    private String chartName;
    public BeliefRow() {
    }

    public BeliefRow(String n, double v, String c) {
        name = n;
        value = v;
        chartName = c;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public int getValueInt(){
        return (int)Math.round(value);
    }

    public String getChartName() {
        return chartName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setChatName(String name) {
        this.chartName = name;
    }
}
