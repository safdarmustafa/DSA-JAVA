package functions_methods;

import javax.xml.namespace.QName;

public class student {
    // method with 4 parameters
    public static void student (String name, int age ,int StudentClass, String grade){
        System.out.println("Student " + name + " " + age +" " + grade +" " + StudentClass);

    }
    // Overloaded method with 0 parameters (to fix student() call)
    public static void student () {
        System.out.println("Student ");
    }
    public static void main (String[] args) {
        student("Safdar" ,12, 10, "First");
        System.out.println();
        System.out.println();
        student(); // This now works because the 0-arg version exists




    }

}

