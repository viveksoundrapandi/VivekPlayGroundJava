public class Metric {
    public double baseValue;
    public Metric() {
        this.baseValue = 0;
    }

    public void createInch(double v) {
        this.baseValue = v;
    }

    public void createFeet(double v) {
        this.baseValue = v*12;
    }
}
