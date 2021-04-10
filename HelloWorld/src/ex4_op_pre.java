
//      Operator precedence in Java
// Precedence and Associativity
// Precedence is the level of the operator to be evaluated
// Associativity is the position of the operators to be evaluated if they have same precedence level
//associativity basically starts from left to right.


public class ex4_op_pre {
    public static void main(String[] args) {
        int a = 6 * 5 - 8 / 2;
        /*
            6*5-8/2
            30-8/2
            30-4
            26
        */
        System.out.println(a);
        int b = 40/4+5*2;
        /*
        40/4+5*2
        10+5*2
        10+10
        20
        */
        System.out.println(b);
    }
}
