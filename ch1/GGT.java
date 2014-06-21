/*
 * Greater Common divisor
 */

public class GGT {

    public static void main(String [] args){
        
        int a;
        int b;
        int ggt;

        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        
        } catch (NumberFormatException e) {
            System.out.println("str keine int-Konstante");
            return;
        }

        if (a == 0) {
            ggt = b;
            // System.out.println("GGT is: " + b);
            return;
        } else {
            while (b != 0) {
                if (a > b){
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            //System.out.println("GGT is: " + a);
            ggt = a;
        }

        switch (ggt) {
        
            case 1: System.out.println("GGT is 1");
                    break;
            case 2: System.out.println("GGT is 2");
                    break;
            case 3: System.out.println("GGT is 3");
                    break;
            case 4: System.out.println("GGT is 4");
                    break;
            default: System.out.println("GGT is :" + ggt);
                    break;
        }
    } 
}
