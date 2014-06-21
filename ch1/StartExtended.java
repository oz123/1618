/*
 * Demonstrate command line args
 * 
 * */

public class StartExtended {
    public static void main(String[] args) {
        String Surname;
        String Firstname;
        Firstname = args[0];
        Surname = args[1];

        System.out.println("Hello "+ Firstname +" " +Surname + "!");

    }

}
