package functions_methods;
import java.util.Scanner;
public class inbuilt_library {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(Math.max(i, Math.max(j, k)));

    }
}
