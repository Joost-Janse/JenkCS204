import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean done = false;

        while (!done) {
            Calculator calculator = new Calculator();
            Scanner input = new Scanner(System.in);
            System.out.print("==> ");

            String operation = input.next();
            if (operation.equalsIgnoreCase("add")) {
                int val1 = Integer.parseInt(input.next());
                int val2 = Integer.parseInt(input.next());
                System.out.println(calculator.add(val1, val2));
            } else if (operation.equalsIgnoreCase("subtract")) {
                int val1 = Integer.parseInt(input.next());
                int val2 = Integer.parseInt(input.next());
                System.out.println(calculator.subtract(val1, val2));
            } else if (operation.equalsIgnoreCase("divide")) {
                int val1 = Integer.parseInt(input.next());
                int val2 = Integer.parseInt(input.next());
                System.out.println(calculator.divide(val1, val2));
            } else if (operation.equalsIgnoreCase("multiply")) {
                int val1 = Integer.parseInt(input.next());
                int val2 = Integer.parseInt(input.next());
                System.out.println(calculator.multiply(val1, val2));
            } else if (operation.equalsIgnoreCase("fib")) {
                int val1 = Integer.parseInt(input.next());
                System.out.println(calculator.fibonacciNumberFinder(val1));
            } else if (operation.equalsIgnoreCase("binary")) {
                int val1 = Integer.parseInt(input.next());
                System.out.println(calculator.intToBinaryNumber(val1));
            } else {
                done = true;
            }
        }
    }
}
