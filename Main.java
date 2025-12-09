public class Main {
    public static void main(String[] args){
        System.out.print("Hello");
        System.out.println("Hello"); // new line after print

        //Data types ------------------------------------->(not pure OOP)
        //byte(1byte (-128 to 127)) short(2) int(4) long(8)
        //float(4) double(8)
        //boolean(1bit) char(2bytes)

        int a = 10; //a->variable name
        long x = 10000000000000000l; //long
        float b = 1.23f; // ~7 sig fig
        double c = 1.2345; // ~15 sig fig
        boolean d = true; // true or false
        char e = 'x'; // ' ' not " " (min 0 - max 65535) (Ascii 0-127)

        //Conversion-----------------------------------------
        //Widening conversion (auto)
        byte aa = 10;
        short bb = aa;
        int cc = bb;

        //Narrowing conversion (manual)(data loss)
        int dd = 10000;
        short ee = (short)dd;
        byte ff = (byte)ee;
    }
}
