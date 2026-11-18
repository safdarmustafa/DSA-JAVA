package functions_methods;

public class new_method {


   public static void passmethod (){
        int passing_marks = 33;
        int distinction = 75;
        System.out.println("passing marks");
       sports();
    }

   public static void main(String[] args) {
       int oops_marks = 90;
       int java_marks = 95;
       int ml_marks = 99;
       passmethod ();
       System.out.println(Math.max(oops_marks, java_marks));
       System.out.println(ml_marks);
       additionalactivity();
       sports();
       }
    public static void additionalactivity (){

        int research_paper = 5;
        int journal_paper = 10;
        int letter = 6;
        System.out.println("research paper");
    }

    public static void sports (){
        additionalactivity();
        int cricket_matches = 5;
        int footBall_mathces = 10;
        int basketBall_matches = 6;
        System.out.println("cricket matches");
    }

}
