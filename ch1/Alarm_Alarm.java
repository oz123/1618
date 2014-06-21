/*
 * Exceptions 
 */

public class Alarm_Alarm {

    public static void main(String[] args) {
    
        try {
            try {
                int i = 7 % 5;
                // devide by zero, throws Exception
                if (i / (i % 2) == 1) throw new Exception();
                System.out.println("leichtsinnig");
            }
        
            catch (Exception e) {
                // print out man
                System.out.println("man");
                try {
                    // evaluated to 1 == 1 , hence throw Exception
                    if ((7 % 6 / (7 % 6 % 2)) == 1 ) throw new Exception();
                    System.out.println("leichtsinnig");
                } 
                catch (Exception u) {
                    // print out spielt
                    System.out.println("spielt");
                }
            }
            // print out nicht
            System.out.println("nicht");
            
            try { 
                // evaluated to 1 , hence mit is printed 
                // there is no break, hence Exception is also thrown
                int i = true && false ? 0 : 1;
                switch (i) {
                    case 1:
                        System.out.println("mit");
                    default:
                        throw new Exception();
                }
             // skipped !
             } catch (ArithmeticException e) {
                 System.out.println("Streichhoelzern");
             // print out Feuer
             } catch (Exception e) { 
                System.out.println("Feuer");
             }
             
             finally {
                 // evaluated to 2 
                int i = false && true ? 0 : 2;
                switch (i) {
                    case 1:
                        System.out.println("mit");
                    // throw Exception
                    default:
                        throw new Exception();
                    }
                }
            }
            // skipped
            catch (ArithmeticException e) {
                System.out.println("Kerzen");
            }
            // print ""
            catch (Exception e) {
                System.out.println("");
            }
        }
    }
