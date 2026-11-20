package functions_methods;

import org.w3c.dom.ls.LSOutput;

public class scope_of_variable {
    public static void main (String[] args) {
        int i;
        for (i = 1; i <= 10; i++) ;
        System.out.println(i);
    }
    public static void method(){
       //, System.out.println(i);  // hm yaha pe i ko se nahi kar pa rhe hain kyuki hmne is method function me i initialize
        // hi nahi kr rakha hain halaki  int i; but ye main function me hain or uska  int i; scope main function tak hi hain
        // method function me hm use nahi kr skte
    }

}
