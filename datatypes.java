public class datatypes {
  public static void main(String[] args) {
    int num = 20;

    int binary = 0b1011; //11 binary
    int hex = 0x7E; //hexadecimal

    int num_1 = 10_00_00_000; // can give underscore for counting numberes

    short sh = 10;
    byte by = 10;  //-128 to 127
    long l = 100l;

    float f = 22.8f;
    double d = 22.8;

    char c = 'k'; // '' no ""

    boolean b = true;

    System.out.println(num+" "+sh+" "+by+" "+l+" ");
  }
}
