package Language_Fundamentals;

public class LiteralsDemo {
    public static void main(String[] args) {

        int x = 10;
//        int x2 = 0787; // Compile time error saying ';' expected
//        int x3 = 0xBeer; // Compile time error saying ';' expected

        int integer1 = 10;
        int integer2 = 010;
        int integer3 = 0xa0;
        System.out.println( integer1 + " " + integer2 + " " + integer3); // 10 8 16


//        float f = 123.456; // Compile time error saying incompatible types possible lossy conversion from double to float.
//        float f = 123.456d; // Compile time error saying incompatible types possible lossy conversion form double to float.
        double d = 123.456;
        double d1 = 0123.456;
//        double d2 = 0xa0.123; // Compile time error saying malformed floating point literal.
//        double d2 = 0786; // Compile time error saying ';' expected
        double d3 = 0xFace; // Valid
//        double d31 = 0xFace.0; // Compile time error saying malformed floating point literal.
        double d4 = 0786.0; // Valid
        double d5 = 10; // Valid
        double d6 = 0777; // Valid

        double d7 = 10; // Valid
//        int d8 = 10.0; // Compile time error saying incompatible types possible lossy conversion from double to int


        double d9 = 1.2e3;
//        float f = 1.2e3; // Compile time error saying incompatible types possible lossy conversion from float to double
        float f = 1.2e3f; // Valid

        boolean b = true; // Valid
//        boolean b1 = 0; // Compile time error saying incompatible types possible lossy conversion from int to boolean.
//        boolean b2 = True; // Compile time error saying cannot find symbol True in location className
//        boolean b3 = "true"; // Compile time error saying incompatible types possible lossy conversion from String to boolean.

//        int i2 = 0;
//        if(i2) System.out.println("Hello"); Compile time error saying int cannot be converted to boolean
//        else System.out.println("Hi");

//        while(1) System.out.println("Hello"); Compile time error saying int cannot be converted to boolean
//        char ch = null; // Compile time error saying incompatible types <null> cannot be converted to char.

        char ch = 'a'; // Valid
//        char ch1 = a; // Compile time error saying cannot find a symbol a in location className.
//        char ch2 = "a";  // Compile time error saying incompatible types possible lossy conversion from String to char.
//        char ch3 = 'ab'; // 3 Compile time errors 2 are unclosed character literal and 1 is not a statement.
        char ch4 = 97; // Valid
        System.out.println(ch4); // outputs a

        char ch5 = 0xFace;
        char ch6 = 0777;
        char ch7 = 65535;
//        char ch8 = 65536; // Compile time error saying incompatible types possible lossy conversion from int to char.

        char ch9 = '\u0061'; // Valid

        char ch10 = '\n'; // Valid newline character
        char ch11 = '\''; // Valid single quote character
        char ch12 = '\"'; // Valid double quote character
        char ch13 = '\\'; // Valid backslash character
        char ch14 = '\b'; // Valid backspace character
        char ch15 = '\f'; // Valid form feed character
        char ch16 = '\r'; // Valid carriage return character
        char ch17 = '\t'; // Valid tab character

//        char ch18 = 65536; // Compile time error saying incompatible types possible lossy conversion from int to char.
//        char ch19 = 0xBeer; // Compile time error saying ';' expected
//        char ch20 = \uface; // cannot find symbol 龜 in class Literal Demo
        char ch21 = '\ubeef';
        System.out.println(ch21); // outputs 뻯
//        char ch22 = '\m'; // Compile time error saying illegal escape character
//        char ch23 = '\iface'; // Compile time error saying illegal escape character

        double db1 = 123_456.7_8_9; // Valid
        double db2 = 1_2_3_4_5_6.7_8_9; // Valid
        double db3 = 1___23___4_____56.7____8__9; // Valid
//        double db4 = 12_3__45__6_.7__8__9; // Invalid
//        double db5 = _12__3___45__6.7_8_9; // Invalid
//        double db6 = 12_34_56._7_8_9; // Invalid

        float f1 = 10l; // Valid
    }

}
