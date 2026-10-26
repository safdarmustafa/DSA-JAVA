package Conditional_and_Loops;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        {

            Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            // Question : Find the largest Number of he 3 Numbers

            int max = a; // we assumed here a as largest number
            if (b > max) {
                max = b; // here loop is checking the condition if the b will be larger the user input then b will be max
            }
            if (c > max) { // here loop will be checing the condition if c will be greater than the b then c will be max

                max = c;

            }
            System.out.println(max); // here we are printiing the maximum number
        }
    }
}