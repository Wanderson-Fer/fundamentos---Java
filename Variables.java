public class Variables {
    public static void main(String[] args) {
        System.out.println("----------------Variables----------------");

        /* Syntax
         * type variableName = value;
        */

        // The 'String' type asign a text to the variable
        String name = "Wanderson";
        System.out.println(name);

        // The 'int' type asign a number (Integer) to the variable
        int idade = 20;
        System.out.println(idade);

        final int favoriteNumber = 1;
        System.out.println(favoriteNumber);
        /* can't overwrite 'final' variables
         * favoriteNumber = 13;
         * The final local variable favoriteNumber cannot be assigned. 
         * It must be blank and not using a compound assignment 
        */

        // The 'float' or 'double' type asign a rational number
        // double(8-64 bits) use more memory than float type(4-32 bits)
        float myHeight = 1.73f;
        System.out.println("My height is " + myHeight);

        /* General Java identifiers rules
         * Names can contain letters, digits, underscores, and dollar signs
         * Names must begin with a letter
         * Names should start with a lowercase letter and it cannot contain whitespace
         * Names can also begin with $ and _
         * Names are case sensitive ("myVar" and "myvar" are different variables)
         * Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        */

    }    
}
