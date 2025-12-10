void main() {
    //------------------------------------------------------------------------
    // OPERATORS
    //------------------------------------------------------------------------

    int a = 10, b = 20;

    // Arithmetic operators
    a + b;          // 30  --> addition
    a - b;          // -10 --> subtraction
    a * b;          // 200 --> multiplication
    b / a;          // 2   --> division (integer)
    b % a;          // 0   --> modulus (remainder)

    // Comparison operators
    a == b;         // false --> equal to
    a != b;         // true  --> not equal to
    a > b;          // false --> greater than
    a < b;          // true  --> less than
    a >= b;         // false --> greater or equal
    a <= b;         // true  --> less or equal

    // Logical operators
    true && false;  // false --> logical AND
    true || false;  // true  --> logical OR
    !true;          // false --> logical NOT

    // Assignment operators
    a = 5;          // 5   --> simple assignment
    a += 2;         // 7   --> a = a + 2
    a -= 1;         // 6   --> a = a - 1
    a *= 3;         // 18  --> a = a * 3
    a /= 2;         // 9   --> a = a / 2
    a %= 4;         // 1   --> a = a % 4

    // Increment / Decrement
    a++;            // post-increment (++ after use)
    ++a;            // pre-increment (++ before use)
    b--;            // post-decrement
    --b;            // pre-decrement

    // Conditional (Ternary)
    int max = (a > b) ? a : b;   // choose larger value

    // Bitwise operators (with examples)
    int a = 10;     // 1010 in binary
    int b = 6;      // 0110 in binary

    a & b;          // 2   --> 1010 & 0110 = 0010 (AND)
    a | b;          // 14  --> 1010 | 0110 = 1110 (OR)
    a ^ b;          // 12  --> 1010 ^ 0110 = 1100 (XOR)
    ~a;             // -11 --> ~(1010) = ...11110101 (NOT - flips all bits)

    a << 1;         // 20  --> 1010 << 1  = 10100  (left shift)
    a >> 1;         // 5   --> 1010 >> 1  = 0101   (right shift - keeps sign)
    a >>> 1;        // 5   --> 1010 >>> 1 = 0101   (unsigned right shift)

    Integer.toBinaryString(a);

}