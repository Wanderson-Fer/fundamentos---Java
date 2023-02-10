public class Loops {
    public static void main(String[] args) {
        System.out.println("--------------Loops--------------");

        /* Systax
         * while (condition) {
         *     Code block to be executed
         * }
        */

        int i = 0;
        while (i < 10) {
            System.out.print(i + ", ");
            i++;
        }

        /* Syntax (A bit diference)
         * do {
         *     Code block to be executed
         * } while (condition)
         */

        System.out.println("------------------------------------");

        /* Syntax
         * for (statement 1; statement 2; statement 3) {
         *     Code block to be executed
         * }
         * 
         * Statement 1 is executed (one time) before the execution of the code block.
         * Statement 2 defines the condition for executing the code block.
         * Statement 3 is executed (every time) after the code block has been executed
         * reference(https://www.w3schools.com/java/java_for_loop.asp)
        */

        for (i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }

        String cars[] = {"Rolls-Royce", "Bugatti", "Uno Wladder", "Ferrari", "Lamborghini"};
        for (String car: cars) {
            System.out.println(car);
        }
    }
}
