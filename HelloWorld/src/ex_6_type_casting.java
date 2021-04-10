
import java.util.Scanner;

public class ex_6_type_casting {
    public static void main(String[] args) {
        char grade = 'A';
        grade = (char) (grade + 10);
        System.out.println(grade);

        grade = (char) (grade-10);
        System.out.println(grade);

        System.out.print("Please enter any integer value greater than 5 : ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b>5){
            System.out.println("The number is greater than 5.");
        }
        else {
            System.out.println("The number is smaller than 5.");
        }
    }
}
