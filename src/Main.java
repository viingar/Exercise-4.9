import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = 5.0;
        double b = 3.0;


        Calculator calculator = new Calculator(new Multiplication());
        calculator.calc(a, b);

        calculator = new Calculator(new Divide());
        calculator.calc(a,b);

        calculator = new Calculator((n,m ) -> n + m);
        calculator.calc(a,b);

        calculator = new Calculator((n,m) -> n - m);
        calculator.calc(a,b);

        }
    }
