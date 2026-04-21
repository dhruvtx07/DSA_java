package operators;
public class operators {

    // Helper method to show 32-bit binary
    public static String toBinary(int n) {
        return String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
    }

    public static void main(String[] args) {

        int a = 10, b = 3;

        System.out.println("===== ARITHMETIC OPERATORS =====");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b)); // addition
        System.out.println("a - b = " + (a - b)); // subtraction
        System.out.println("a * b = " + (a * b)); // multiplication
        System.out.println("a / b = " + (a / b)); // division (integer)
        System.out.println("a % b = " + (a % b)); // remainder

        System.out.println("\n===== UNARY OPERATORS =====");
        int x = 5;
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x)); // pre-increment
        System.out.println("x++ = " + (x++)); // post-increment
        System.out.println("After x++ = " + x);
        System.out.println("--x = " + (--x)); // pre-decrement
        System.out.println("x-- = " + (x--)); // post-decrement
        System.out.println("After x-- = " + x);
        System.out.println("-x = " + (-x));   // unary minus

        System.out.println("\n===== RELATIONAL OPERATORS =====");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        System.out.println("\n===== LOGICAL OPERATORS =====");
        boolean p = true, q = false;
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p && q = " + (p && q)); // AND
        System.out.println("p || q = " + (p || q)); // OR
        System.out.println("!p = " + (!p));         // NOT

        System.out.println("\n===== ASSIGNMENT OPERATORS =====");
        int num = 5;
        System.out.println("num = " + num);
        num += 3; // num = num + 3
        System.out.println("num += 3 → " + num);
        num -= 2;
        System.out.println("num -= 2 → " + num);
        num *= 4;
        System.out.println("num *= 4 → " + num);
        num /= 2;
        System.out.println("num /= 2 → " + num);
        num %= 3;
        System.out.println("num %= 3 → " + num);

        System.out.println("\n===== BITWISE OPERATORS =====");
        int m = 5;  // 000...0101
        int n = 3;  // 000...0011

        System.out.println("m = " + m + " (" + toBinary(m) + ")");
        System.out.println("n = " + n + " (" + toBinary(n) + ")");

        int and = m & n;
        System.out.println("m & n = " + and + " (" + toBinary(and) + ")");

        int or = m | n;
        System.out.println("m | n = " + or + " (" + toBinary(or) + ")");

        int xor = m ^ n;
        System.out.println("m ^ n = " + xor + " (" + toBinary(xor) + ")");

        int not = ~m;
        System.out.println("~m = " + not + " (" + toBinary(not) + ")");

        int leftShift = m << 1;
        System.out.println("m << 1 = " + leftShift + " (" + toBinary(leftShift) + ")");

        int rightShift = m >> 1;
        System.out.println("m >> 1 = " + rightShift + " (" + toBinary(rightShift) + ")");

        int unsignedShift = m >>> 1;
        System.out.println("m >>> 1 = " + unsignedShift + " (" + toBinary(unsignedShift) + ")");
    }
}