import java.util.Scanner;

public class CallMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Methods calc = new Methods();

        System.out.println("Enter two numbers:");

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("The result of division is " + 
            calc.div(num1, num2));

        System.out.println("The result of multiplication is " + 
            calc.mul(num1, num2));

        System.out.println("The result of sum is " + 
            calc.sum(num1, num2));

        System.out.println("The result of subtraction is " + 
            calc.sub(num1, num2));

        scanner.close();
    }
}
