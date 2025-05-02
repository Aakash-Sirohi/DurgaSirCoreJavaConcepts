package Language_Fundamentals;

// JavaIdentifiersDemo is an identifier
public class JavaIdentifiersDemo {
    // main is an identifier
    // String is an identifier
    // args is an identifier
    public static void main(String[] args) {
        // x is an identifier
        int x = 10;

        // int total_number; ==> valid identifier
        // int total#; ==> invalid identifier
        // int total123; ==> valid identifier
        // int 123total; ==> invalid identifier

        // we can take any length identifier in java
        // It is recommended to not take too lengthy identifiers
        int xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz= 44;


        // we cannot take reserved words as identifiers
        // int if = 20;

        // All pre-defined java class names and interfaces are valid identifiers
        // Even though it is valid, but it is not a good practice to use them as identifiers

        int String = 10;
        System.out.println(String);

        int Runnable = 22;
        System.out.println(Runnable);







    }
}
