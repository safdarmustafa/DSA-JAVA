package Conditional_and_Loops;

public class Conditional {
    public static void main(String[] args) {


        // if statement

        // In if or else either if  will be executed either else will be executed only of them will be executed

        int salary = 25000;
//        if (salary >= 15000) {
//            salary = salary + 2000;
//        } else { salary = salary + 1000;
//
//        }
//        System.out.println(salary);

        // Multiple if else
        if (salary >= 15000){
            salary += 2000;
        } else if (salary >= 20000 ){
            salary += 3000;
        } else {
            salary += 0;
        }
        System.out.println(salary);
    }
}