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

}