package Conditional_and_Loops;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {

/*
syntax of for loop
for (variable initialization; condition ; increment/decrement i++ / i-- )
 */
        // Question : print number from 1 to 100
        // how will you print

        // In the for Loop the initialization of variable will be under () this brackets the condition will be
        // always written writen in the same as well as increment and decrement
       // for (int num = 1; num <= 10; num+= 2) {
          //  System.out.println(num);
            // what happends exactly when we debug the loop compiler checks the condition every time
            // of the condition is not satisfied the loop will be continoued and whenever conditions satisfy the loop will stops its execution

        // print number from 1 to n where n is something user will input
        // we use scanner funtion for the user input
        // syntax of Scanner is
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <= n  ; num++) {
        System.out.println(num + " ");
        }
    }
}

