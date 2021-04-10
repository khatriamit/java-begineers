

/*
    byte+short = int
    short+int = int
    long+float = float
    int+float = float
    char + int = int
    char + short = int
    long+double = double
    float+double = double

*/

public class ex5_data_type {
    public static void main(String[] args) {
        int a = 654 +6;
        float b = 6.5f +5;
        char c = 'a';

        // Increment and Decrement operators
        int i = 5;
        // i++ increases the value of i in next line.
        System.out.println(i++);

        // ++i increases the value of i on the same line
        System.out.println(++i);

        // increment/decrement operator works for characters also
        System.out.println(++c);
    }
}
