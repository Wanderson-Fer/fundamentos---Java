import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Conditions {
    public static void main(String[] args) {
        System.out.println("-----------------Conditions-----------------");

        /* Syntax
         * if (condition) {
         *     Block of code to be executed if the condition is true
         * }
        */
        
        int age = 20;
        int minAge = 18;

        if (age <= minAge) {
            System.out.println("You can't drink!");
        } else {
            System.out.println("Let's go to the party!");
        }

        System.out.println("--------------------------------------");
        
        int number1 = (int)(Math.random() * 101);
        int number2 = (int)(Math.random() * 101);
        
        if (number1 < number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1 > number2) {
            System.out.println(number2 + " is greater than " + number2);
        } else {
            System.out.println(number1 + " is equals " + number2);
        }
        
        System.out.println("--------------------------------------");

        /* Ternary operator
         * variable = (condition) ? expressionTrue : expressionFalse;
        */

        // EXTRA: Getting time on the system
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatHour = DateTimeFormatter.ofPattern("HH");  // pattern default "dd/MM/yyyy HH:mm:ss"
        int time = Integer.parseInt(formatHour.format(now));

        System.out.println("Current hour - " + time);
        
        String salutation = (time < 18) ? "Good Morning" : "Good Eveninig";
        System.out.println(salutation);

        System.out.println("-------------------------------------");
        
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
                break;
        }
    }
}
