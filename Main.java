public class Main {
    public static void main(String[] args){
        //0 based indexing;
        System.out.print("Hello");
        System.out.println("Hello"); // new line after print

        //JVM
        //Heap memory --> for objects;
            //string pool (for reusing the strings)
        //Stack memory --> each for each method; store variables;

        //------------------------------------------------------------------------
        // DATA TYPES (so not pure OOP)
        //------------------------------------------------------------------------
        //byte(1byte (-128 to 127)); short(2); int(4); long(8);
        //float(4); double(8);
        //boolean(1bit); char(2bytes);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int a = 10; //a->variable name
        long x = 10000000000000000l; //long
        float b = 1.23f; // ~7 sig fig
        double c = 1.2345; // ~15 sig fig
        boolean d = true; // true or false
        char e = 'x'; // ' ' not " " (min 0 - max 65535) (Ascii 0-127)

        //Type Conversion-----------------------------------------
        //Widening conversion (auto)
        byte aa = 10;
        short bb = aa;
        int cc = bb;
        //Narrowing conversion (manual)(data loss)
        int dd = 10000;
        short ee = (short)dd;
        byte ff = (byte)ee;

        //------------------------------------------------------------------------
        //STRINGS (non mutable)
        //------------------------------------------------------------------------
        String str = new String("Hello"); //(creates objects outside string-pool in heap)
        String str1 = "Hello"; //string literal stored in string-pool
        String str2 = "Hello";
        //no new "Hello" will be created because it's already there in string-pool;
        //both str1 and str2 point to same memory loc in string-pool in heap;

        //str1 == str2; true //checks reference not value stored
        //str1 == str; false (different objects) //checks reference not value stored
        //str.equals(str1); true //checks value //.equals() --> in String class

        //str1.toUpperCase(); doesn't change original string
        str1 = str1.toUpperCase(); // creates new string and points to it.

        //String Operations------------------------------------ :)
        String s = "hello";
        String t = "world";
        s.length(); // 5  --> length of string
        s.charAt(1); // 'e' --> char at index
        s.substring(1, 4); // "ell" --> substring from start to end-1
        s.contains("lo"); // true --> checks if substring exists
        s.startsWith("he"); // true --> checks prefix
        s.endsWith("lo"); // true --> checks suffix
        s.indexOf('l'); // 2 --> first occurrence index
        s.lastIndexOf('l'); // 3 --> last occurrence index
        s.equals(t); // false --> checks exact equality
        s.equalsIgnoreCase("HELLO"); // true --> case-insensitive equality
        s.toUpperCase(); // "HELLO" --> convert to uppercase
        s.toLowerCase(); // "hello" --> convert to lowercase
        s.replace("l", "x"); // "hexxo" --> replace characters
        s.trim(); // "hello" --> removes leading/trailing spaces
        String s1 = s + t; // "helloworld" --> string concatenation
        s.isEmpty(); // false --> checks if length is 0
        "".isEmpty(); // true --> empty string check
        s.split("l"); // ["he", "", "o"] --> split by delimiter
        String.join("-", s, t); // "hello-world" --> join strings with delimiter
    }
}
