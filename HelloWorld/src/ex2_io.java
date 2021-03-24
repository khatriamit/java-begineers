
import java.util.Scanner;

public class ex2_io {
    public static void main(String[] args) {
        System.out.println("Taking inputs form the user");
        Scanner sc = new Scanner(System.in); // System.in reads form the keyboard
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("The sum of these two number is: ");
        System.out.println(sum);
    }
}
