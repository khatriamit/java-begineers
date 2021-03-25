
//      Operators in Java
// note: arithmetic operators doesn't work with boolean
/*
    arithmetic operators = +, -, %, /(integer division), %(modular division), ++, --
    assignment operators = =, +=, -=, *=
    comparison operators(returns true or false) = >=, ==, <=, <, >
    logical operators = &&, ||, !: not:- do not use single (&) operator like in python
    bitwise operators = &, |
*/

public class ex3_operators {
    public static void main(String[] args) {
        int a = 4;
        int b = 6 + a;
        b+=5;
        b-=2;
        System.out.println(b);
        System.out.println(6!=5);
        System.out.println(45>5 && 6<45);
        // Bitwise operator example
        System.out.println(2&3);

        /*
         here:
          2 = 10
          3 = 11
          and using on and operator:
            = 10
         */
    }
}
