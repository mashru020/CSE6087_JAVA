import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x (double): ");
        double x = scanner.nextDouble();
        System.out.print("Enter the value of n (Integer): ");
        int n = scanner.nextInt();
        scanner.close();

        Series p = new Series();
        p.setN(n);
        p.setX(x);
        System.out.println(p.CalcSeries());
        
    }
}