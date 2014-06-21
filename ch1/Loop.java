/*
 * Demonstrate the use of loops in JAVA
 */

public class Loop {

    public static void main(String[] args){
        
        for (String word : args) {
            System.out.println(word);
        }

        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}
