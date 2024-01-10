public class conversion {
    public static void main(String[] args) {
        // String to int
        String strToInt = "123";
        int intValue = Integer.parseInt(strToInt);

        // int to String
        int intToString = 456;
        String strValue = Integer.toString(intToString);

        // String to double
        String strToDouble = "3.14";
        double doubleValue = Double.parseDouble(strToDouble);

        // double to String
        double doubleToString = 2.718;
        String strDoubleValue = Double.toString(doubleToString);

        // String to char
        String strToChar = "A";
        char charValue = strToChar.charAt(0);

        // char to String
        char charToString = 'B';
        String strCharValue = Character.toString(charToString);

        // int to double
        int intToDouble = 42;
        double doubleFromInt = (double) intToDouble;

        // double to int
        double doubleToInt = 3.14;
        int intFromDouble = (int) doubleToInt;

        // String to boolean
        String strToBoolean = "true";
        boolean boolValue = Boolean.parseBoolean(strToBoolean);

        // boolean to String
        boolean boolToString = false;
        String strBoolValue = Boolean.toString(boolToString);


        // String to Object
        String s="hello";  
        Object obj=s;  

        // Binary to Decimal
        String binaryStr = "1101";
        int decimalValue = Integer.parseInt(binaryStr, 2);

        // Decimal to Binary
        int decimalToBinary = 25;
        String binaryStrFromDecimal = Integer.toBinaryString(decimalToBinary);

        // Decimal to Hexadecimal
        int decimalToHexadecimal = 255;
        String hexStrFromDecimal = Integer.toHexString(decimalToHexadecimal);

        // Character to ASCII
        char charToAscii = 'Z';
        int asciiValue = (int) charToAscii;



        // // Displaying the results
        // System.out.println("String to int: " + intValue);
        // System.out.println("int to String: " + strValue);
        // System.out.println("String to double: " + doubleValue);
        // System.out.println("double to String: " + strDoubleValue);
        // System.out.println("String to char: " + charValue);
        // System.out.println("char to String: " + strCharValue);
        // System.out.println("int to double: " + doubleFromInt);
        // System.out.println("double to int: " + intFromDouble);
        // System.out.println("String to boolean: " + boolValue);
        // System.out.println("boolean to String: " + strBoolValue);

        System.out.println("Binary to Decimal: " + decimalValue);
        System.out.println("Decimal to Binary: " + binaryStrFromDecimal);
        System.out.println("Decimal to Hexadecimal: " + hexStrFromDecimal);
        System.out.println("Character to ASCII: " + asciiValue);



        // Hexadecimal to Decimal
        String hexStr = "1A";
        int decimalFromHex = Integer.parseInt(hexStr, 16);

        // Octal to Decimal
        String octalStr = "25";
        int decimalFromOctal = Integer.parseInt(octalStr, 8);

        // Decimal to Octal
        int decimalNumber = 123;
        String octalString = Integer.toOctalString(decimalNumber);

        // Displaying the results
        System.out.println("Hexadecimal to Decimal: " + decimalFromHex);
        System.out.println("Octal to Decimal: " + decimalFromOctal);
        System.out.println("Decimal to Octal: " + octalString);


    }
}