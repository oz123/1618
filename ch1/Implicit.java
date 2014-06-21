/*
 * Implicit type conversions in Java
 */

public class Implicit {

    public static void main(String[] args){
    
       int i = 10;
       long l = 55567843L;
       byte by = 15;
       boolean b = true;
       double d = 1.25;
       l = i; // line 6 int converted to long
       d = l; // line 7 long converted to double
       // by = i; // int converted to byte - NOT ALLOWD, leads to loss of info
       l = l + by; // byte converted to long
       // by  = by - b; // boolean coverted to byte - NOT ALLOWD?
       d = (l / i) * 20; // int coverted to long    
       
        
    
    }

}
