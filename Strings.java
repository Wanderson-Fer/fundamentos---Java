public class Strings {
    public static void main(String[] args) {
        System.out.println("-----------Strings-----------");

        // String asign use double quotes ""
        String firstName = "Wanderson";
        String lastName = "Fernandes";

        // Concatenate strings with '+' operator
        String name = firstName + " " + lastName;

        System.out.println(name); // Wanderson Fernandes

        System.out.println("The length of the name is " + name.length()); // The length of the name is 19

        System.out.println("to uppercase - " + name.toUpperCase()); // to uppercase - WANDERSON FERNANDES
        System.out.println("to lowercase - " + name.toLowerCase()); // to lowercase - wanderson fernandes

        System.out.println("Finding 'Fernandes'\n\tindex of substring " 
            + name.indexOf("Fernandes"));
        /* Finding 'Fernandes'
         * index of substring 10 
        */ 
    }
}
