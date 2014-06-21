/*
 * Java koan? Fixed that sort program ...
 * */

public class Sortieren {

    public static void main(String[] args) {
        // create an array in the size of args
        double[] feld = new double[args.length];

        // convert all command line args to double values
        for (int i = 0; i < args.length; i = i + 1) {
            feld[i] = Double.parseDouble(args[i]);
        
        } 

        // sort the array
        for (int i = 0 ; i < feld.length-1; i = i + 1) {
            int max = i;
            for (int j = i + 1; j < feld.length; j = j + 1) {
                if (feld[j] > feld[max]){
                    max = j;    
                }
            }
            double tmp = feld[i];
            feld[i] = feld[max];
            feld[max] = tmp;
        }
        
        // output the largest element 
        System.out.println("The biggest element is: "+ feld[0]);

        // output the whole array
        for (double item: feld) {
            System.out.print(item+"  ");
        }
    }



}
