/*
    String is the sequence of the characters.
    It can be instantiated as follows:
        String var_name;
        var_name = new String("string_value");

    String is immutable in java.
*/


public class ex_7_string {
    public static void main(String[] args) {
//        String name = new String("Amit"); -> This also accepted.
//        String name1 = "Amit"; -> This is also accepted.
        String name;
        name = new String("Amit");
        System.out.println(name);

        // Sting Methods in Java
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim()); // Removes leading and trailing spaces.
        System.out.println(name.substring(3)); // Removes the leading characters of the give value.
        System.out.println(name.substring(2,4)); // Does not includes the end value but includes start value.
        System.out.println(name.replace('m','N'));
        System.out.println(name.replace("mit", "riafafat"));
        System.out.println(name.startsWith("Am")); // -> Returns boolean value
        System.out.println(name.endsWith("a")); // -> Returns boolean value
        System.out.println(name.indexOf('t'));
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf('t', 1)); // -> Start searching from index 1 and returns -1 if not found
        System.out.println(name.equals("Amit"));
        System.out.println(name.equalsIgnoreCase("amit"));
    }
}
