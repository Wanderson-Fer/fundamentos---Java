import java.util.Scanner;

public class Methods {
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    public double mul(double num1, double num2) {
        return num1 * num2;
    }

    public double div(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println("---------------------Methods-----------------------");

        Scanner scanner = new Scanner(System.in);
        Methods calc = new Methods();
        String answer = "";

        do {
            System.out.println("Enter two numbers:");
            double num1 = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.println("Choose operation:");
            System.out.println("1 - Sum");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.print("==> ");

            switch (scanner.nextLine()) {
                case "1":
                    System.out.println(calc.sum(num1, num2));
                    break;
                case "2":
                    System.out.println(calc.sub(num1, num2));
                    break;
                case "3":
                    System.out.println(calc.mul(num1, num2));
                    break;
                case "4":
                    System.out.println(calc.div(num1, num2));
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.println("Do you want to continue? (Y/N)");
            answer = scanner.nextLine();

        } while (answer != "N");

        scanner.close();
    }
}
