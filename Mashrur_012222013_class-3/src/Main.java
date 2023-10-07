import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         MyClass n = new MyClass();
        System.out.println("Enter value of a : ");
         double a = scanner.nextDouble();
        System.out.println("Enter value of b : ");
         double b = scanner.nextDouble();
        System.out.println("Enter value of t : ");
         double t = scanner.nextDouble();

         scanner.close();
         n.setA(a);
         n.setB(b);

         System.out.println("Restult of function f :" + n.f());

         System.out.println("Restult of function g :" + n.g(t));

    }
}