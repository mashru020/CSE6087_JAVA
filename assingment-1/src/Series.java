public class Series {
    private static int n;
    private static double x;

    public void setX(double a) {
        this.x = a;
    }
    public void setN(int n) {
        this.n = n;
    }
    public static double CalcSeries() {
        double result = Math.PI / 2;
        double term = 1.0;

        for (int i = 1; i <= n; i++) {
            term *= (-1) * (2 * i - 1) / (2 * i * (x - 1));
            result += term;
        }

        return result;
    }
}
