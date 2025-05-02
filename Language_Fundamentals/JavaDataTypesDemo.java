package Language_Fundamentals;

public class JavaDataTypesDemo {
    public static void main(String[] args) {
        byte b = 10;
        byte b1 = 127;
//        byte b2 = 128; // Compile time error saying incompatible types possible lossy conversion from int to byte.
//        byte b3 = 10.5; // Compile time error saying incompatible types possible lossy conversion from double to byte.
//        byte b4 = true; // Compile time error saying incompatible types possible lossy conversion from boolean to byte.
//        byte b5 = "aakash"; // Compile time error saying incompatible types possible lossy conversion from String to byte.

        short s = 32767;
//        short s = 32768 // Compile time error saying incompatible types possible lossy conversion from int to short.
//        short s = 10.5; // Compile time error saying incompatible types possible lossy conversion from double to short.
//        short s = true; // Compile time error saying incompatible types possible lossy conversion from boolean to short.
//        short s = "aakash"; // Compile time error saying incompatible types possible lossy conversion from String to short.

        int i = 2147483647;
//        int i = 2147483648; // Compile time error saying integer number too large
//        int i2 = 2147483648l; // Compile time error saying incompatible types possible lossy conversion from long to int.
//        int i3 = true; // Compile time error saying incompatible types possible lossy conversion from boolean to int.
//        int i4 = "aakash"; // Compile time error saying incompatible types possible lossy conversion from String to int.

        boolean bool = true;
//        boolean bool1 = 0; // Compile time error saying incompatible types possible lossy conversion from int to boolean.
//        boolean bool1 = True; // Compile time error saying cannot find symbol True in location class JavaIdentifiersDemo.
//        boolean bool1 = "aakash"; // Compile time error saying incompatible types possible lossy conversion from String to boolean.

//        int i2 = 0;
//        if(i2) System.out.println("Hello"); Compile time error saying int cannot be converted to boolean
//        else System.out.println("Hi");

//        while(1) System.out.println("Hello"); Compile time error saying int cannot be converted to boolean
//        char ch = null; // Compile time error saying incompatible types <null> cannot be converted to char.

    }
}
