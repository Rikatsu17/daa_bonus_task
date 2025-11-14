public class Metrics {

    private int comparisons = 0;
    private double execTimeMs = 0;

    public void incComp() {
        comparisons++;
    }

    public int getComparisons() {
        return comparisons;
    }

    public void reset() {
        comparisons = 0;
        execTimeMs = 0;
    }

    public void setExecTime(double ms) {
        this.execTimeMs = ms;
    }

    public double getExecTime() {
        return execTimeMs;
    }

    @Override
    public String toString() {
        return "Metrics{" +
                "comparisons=" + comparisons +
                ", execTimeMs=" + execTimeMs +
                '}';
    }
}
