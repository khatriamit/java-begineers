
/*
                     Literals
   It is the constant value which is assigned to the variable. Below are the individual comments for the respective
   lines of code.

   12. Here 50 is the integer literal
   13. Naming convention for the character literal in java is to use single('') quote not double.
   14. By default precision numbers are considered as double by java compiler so we have to use f at the end of the
       number
   19. For long integer similar is the case. We have to use (l/L) to denote long since by default the number is integer

*/
public class ex1_literals {
    public static void main(String[] args) {
        byte age = 50;
        char ch = 'l';
        float f = 3.6f;
        double d = 3.6;
        long ln = 5555555555555555555l;
        String st = "Amit";
        System.out.println(age);
    }
}
