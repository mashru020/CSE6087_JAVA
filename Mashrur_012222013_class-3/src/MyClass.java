public class MyClass {
    private double a;
    private double b;

    public void setA( double a) {
        this.a = a;
    }

    public void setB( double b) {
        this.b = b;
    }

    double f () {
        double result = (a*a +Math.log(b*b - a*a)) / (0.5 * Math.log((1+(a+b))/(1-(a+b))));
        return result;
    }

    double g (double t) {
        double result = (Math.pow((a*a + b*b),t))/Math.exp(-(a*b));
        return result;
    }
}
