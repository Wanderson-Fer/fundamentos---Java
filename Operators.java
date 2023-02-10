public class Operators {
    public static void main(String[] args) {
        System.out.println("------------------Operators-----------------");

        // Java arithmetic operator

        int sum1 = 100 + 50; 
        int sum2 = sum1 + 50;
        System.out.println("sum1 - " + sum1); // 150
        System.out.println("sum2 - " + sum2); // 200

        int sub1 = 100 - 50;
        int sub2 = sub1 - 200;
        System.out.println("sub1 - " + sub1); // 50
        System.out.println("sub2 - " + sub2); // -150

        int mult1 = 5 * 50;
        double mult2 = mult1 * -1.2;
        System.out.println("mult1 - " + mult1); // 250
        System.out.println("mult2 - " + mult2); // 

        double div1 = 100d / 3d; // using double
        double div2 = 100f / 3f; // using float
        double div3 = 100 / 3; // using int
        double div4 = 5 / 10;
        System.out.println("div1 - " + div1); // 33.333333333333336 (high precision for double)
        System.out.println("div2 - " + div2); // 33.33333206176758 (less precision, because has casting from float to double)
        System.out.println("div3 - " + div3); // 33.0 (Rounded, because it used int for the division)
        System.out.println("div4 - " + div4); // 0.5

        // The '=' asign operator
        // Was used just now

        // The '+=' asign operator
        sum2 += 100;
        System.out.println("sum2 - " + sum2); // 300

        // Java comparisson operators

        System.out.println("sum1 == sum2 - " + (sum1 == sum2)); // false
        System.out.println("sum1 > sum2 - " + (sum1 > sum2)); // false
        System.out.println("sum1 < sum2 - " + (sum1 < sum2)); // true

        // Java logical operators

        // 'Or' operator is '||'
        System.out.println("Or - " + (sum1 == sum2 || sum1 < sum2)); // true
        // 'And' operator is '&&'
        System.out.println("And - " + (sum1 == sum2 && sum1 < sum2)); // false

    }
}
