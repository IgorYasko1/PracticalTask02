package study.DataTypesTester;

public class DataTypesTester {

    public static void testBoolean() {
        boolean a = true;
        boolean b = false;
        boolean c;
        System.out.println("***** Arithmetical Operators *****");
        System.out.println("\nArithmetical operators cannot be applied to booleans");

        System.out.println("\n***** Relational Operators *****");
        //equal to ==
        System.out.printf("\nequal to: %b == %b - - > %b\n", a, b, a == b);
        //not equal to !=
        System.out.printf("not equal to: %b != %b - - > %b\n", a, b, a != b);
        System.out.println("\nOther operators are unavailable");

        System.out.println("\n***** Logical Operators *****");
        //logical not !
        System.out.printf("logical NOT: !%b - - -> %b\n", a, !a);
        //logical xor ^
        c = a ^ b;
        System.out.printf("logical XOR: %b ^ %b = %b\n", a, b, c);

        //logical AND &&
        c = a && b;
        System.out.printf("logical AND: %b && %b = %b\n", a, b, c);

        //logical OR ||
        c = a || b;
        System.out.printf("logical OR: %b || %b = %b\n", a, b, c);

        System.out.println("\n***** Bitwise Operators *****");
        //bitwise xor ^
        c = a ^ b;
        System.out.printf("bitwise XOR: %b ^ %b = %b\n", a, b, c);

        //bitwise AND &
        c = a & b;
        System.out.printf("bitwise AND: %b & %b = %b\n", a, b, c);

        //bitwise OR |
        c = a | b;
        System.out.printf("bitwise OR: %b | %b = %b\n", a, b, c);

        System.out.println("\nOther operators are unavailable");

        System.out.println("\n***** Assignment Operators*****");

        System.out.printf("%b &= %b - - > c = %b\n", c, a, c &= a);
        System.out.printf("%b |= %b - - > c = %b\n", c, a, c |= a);
        System.out.printf("%b ^= %b - - > c = %b\n", c, a, c ^= a);

        System.out.println("\nOther operators are unavailable");

        System.out.println("\n***** Conditional Operators *****");

        System.out.printf(" %b ? %b : %b - - > %b\n", c, a, b, (c ? a : b));

        System.out.println("\n***** TypeCast Operators *****");

        System.out.println("cannot cast other types to boolean");
    }

    public static void testByte() {
        byte a = 9;
        byte b = 6;
        byte c;

        System.out.println("***** Arithmetical Operators *****");

        //addition +
        c = (byte) (a + b);
        System.out.printf("addition: (byte) (%d + %d) = %d\n", a, b, c);
        //subtraction -
        c = (byte) (a - b);
        System.out.printf("subtraction: %d = (byte) (%d - %d)\n", c, a, b);
        //multiplication *
        c = (byte) (a * b);
        System.out.printf("multiplication: %d = (byte) (%d * %d)\n", c, a, b);
        //division
        c = (byte) (a / b);
        System.out.printf("division: %d = (byte) (%d / %d)\n", c, a, b);
        try {
            c = (byte) (a / 0);
        } catch (ArithmeticException e) {
            System.out.printf("***Arithmetic Exeption: %d = (byte) (%d / 0)\n", c, a);
        }
        //modulus
        c = (byte) (a % b);
        System.out.printf("modulus: %d = (byte) (%d %% %d)\n", c, a, b);
        try {
            c = (byte) (a % 0);
        } catch (ArithmeticException e) {
            System.out.printf("***ArithmeticException: %d = (byte) (%d %% 0)\n", c, a);
        }
        //unary plus / minus
        c = (byte)-a;
        System.out.printf("unary minus: (byte)-%d = %d\n", a, c);
        c = (byte)+a;
        System.out.printf("unary plus: (byte)+%d = %d\n", a, c);
        //increment ++
        a = 9;
        System.out.printf("prefix increment: ++%d = %d\n", a, ++a);
        a = 9;
        System.out.printf("postfix increment: %d++ = %d\n", a, a++);
        //decrement --
        a = 9;
        System.out.printf("prefix decrement: --%d = %d\n", a, --a);
        a = 9;
        System.out.printf("postfix decrement: %d-- = %d\n", a, a--);

        System.out.println("\n***** Relational Operators *****");
        a = 9;
        b = 6;
        //equal to ==
        System.out.printf("equal to: %d == %d - - > %b\n", a, b, a == b);
        //not equal to !=
        System.out.printf("not equal to: %d != %d - - > %b\n", a, b, a != b);
        //greater than >
        System.out.printf("greater than: %d > %d - - > %b\n", a, b, a > b);
        //less than <
        System.out.printf("less than: %d < %d - - > %b\n", a, b, a < b);
        //greater than or equal to >=
        System.out.printf("greater than or equal to: %d >= %d - - > %b\n", a, b, a>= b);
        //less than or equal to <=
        System.out.printf("less than or equal to: %d <= %d - - > %b\n", a, b, a<=b);

        System.out.println("\n***** Logical Operators *****");
        //logical not !
        System.out.printf("logical not: !(%d > %d) - - > %b\n", a, b, !(a>b));
        System.out.printf("logical not: !(%d < %d) - - > %b\n", a, b, !(a<b));
        //logical xor ^
        System.out.printf("logical xor: %d >= %d | %d != 0 - - > %b\n", a, b, b, a>=b ^ b!=0);
        System.out.printf("logical xor: %d <= %d | %d != 0 - - > %b\n", a, b, b, a<=b ^ b!=0);
        System.out.printf("logical xor: %d <= %d | %d != 2 - - > %b\n", a, b, b, a<=b ^ b!=2);
        //logical AND &&
        System.out.printf("logical AND: %d > %d && %d > 0 - - > %b\n", a, b, a, a>b && a>0);
        System.out.printf("logical AND: %d < %d && %d > 0 - - > %b\n", a, b, a, a<b && a>0);
        System.out.printf("logical AND: %d < %d && %d < 0 - - > %b\n", a, b, a, a<b && a<0);
        //logical OR ||
        System.out.printf("logical OR: %d > %d || %d < 0 - - > %b\n", a, b, a, a>b || a<0);
        System.out.printf("logical OR: %d < %d || %d < 0 - - > %b\n", a, b, a, a<b || a<0);
        System.out.printf("logical OR: %d < %d || %d < 0 - - > %b\n", a, b, a, a>b || a<0);

        System.out.println("\n***** Bitwise Operators *****");
        //bitwise AND &
        c = (byte) (a & b);
        System.out.println("\nbitwise AND");
        System.out.printf("(byte) (%d & %d) = %d\n", a, b, c);
        System.out.printf("in binary form: (byte) (%s & %s) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise OR |
        c = (byte) (a | b);
        System.out.println("\nbitwise OR");
        System.out.printf("(byte) (%d | %d) = %d\n", a, b, c);
        System.out.printf("in binary form: (byte) (%s | %s) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise XOR ^
        c = (byte) (a ^ b);
        System.out.println("\nbitwise XOR");
        System.out.printf("(byte) (%d ^ %d) = %d\n", a, b, c);
        System.out.printf("in binary form: (byte) (%s ^ %s) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise compliment ~
        c = (byte) ~a;
        System.out.println("\nbitwise unary compliment");
        System.out.printf(" (byte) ~%d = %d\n", a, c);
        System.out.printf("in binary form: (byte) ~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //left shift <<
        c = (byte) (a << 1);
        System.out.println("\nleft shift");
        System.out.printf(" (byte) (%d << 1) = %d\n", a, c);
        System.out.printf("in binary form: (byte) (%s << 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //right shift >>
        a = 9;
        c = (byte) (a >> 1);
        System.out.println("\nright shift");
        System.out.printf(" (byte) (%d >> 1) = %d\n", a, c);
        System.out.printf("in binary form: (byte) (%s >> 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = -9;
        c = (byte) (a >> 1);
        System.out.printf(" (byte) (%d >> 1) = %d\n", a, c);
        System.out.printf("in binary form: (byte) (%s >> 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //zero fill right shift >>>
        System.out.println("\nzero fill right shift");
        a = 9;
        c = (byte) (a >>> 1);
        System.out.printf(" (byte) (%d >>> 1) = %d\n", a, c);
        System.out.printf("in binary form: (byte) (%s >>> 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = -9;
        c = (byte) (a >>> 1);
        System.out.printf(" (byte) (%d >>> 1) = %d\n", a, c);
        System.out.printf("in binary form: (byte) (%s >>> 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators*****");

        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c += a --> " + "c = " + (c += a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c -= a --> " + "c = " + (c -= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c *= a --> " + "c = " + (c *= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c /= a --> " + "c = " + (c /= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c %= a --> " + "c = " + (c %= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c <<= a --> " + "c = " + (c <<= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c >>= a --> " + "c = " + (c >>= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c >>>= a --> " + "c = " + (c >>>= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c &= a --> " + "c = " + (c &= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c ^= a --> " + "c = " + (c ^= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c |= a --> " + "c = " + (c |= a));

        System.out.println("\n***** Conditional Operators *****");
        a = 9;
        b = 6;
        System.out.printf("%d > %d ? %d : %d --> %d\n", a,b,a,b,(a>b?a:b));

        System.out.println("\n***** TypeCast Operators *****");
        //byte byt = -1;
        short sh = 32000;
        char cha = '!';
        int i = 11;
        long lon = -2_000_000_000_000L;
        float floa = 2.345F;
        double doubl = -5.9321;
        boolean bool = true;

        c = (byte) sh;
        System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
        c = (byte) cha;
        System.out.printf("byte = char: c = (byte)'%c' --> c = %d\n", cha, c);
        c = (byte) i;
        System.out.printf("byte = int: c = (byte)%d --> c = %d\n", i, c);
        c = (byte) lon;
        System.out.printf("byte = long: c = (byte)%d --> c = %d\n", lon, c);
        c = (byte) floa;
        System.out.printf("byte = float: c = (byte)%f --> c = %d\n", floa, c);
        c = (byte) doubl;
        System.out.printf("byte = double: c = (byte)%f --> c = %d\n", doubl, c);
        //c = bool;
        System.out.printf("byte = boolean: Error\n");
    }

    public static void testShort() {
        short a = 9;
        short b = 6;
        short c;

        System.out.println("***** Arithmetical Operators *****");

        //addition +
        c = (short) (a + b);
        System.out.printf("addition: (short) (%d + %d) = %d\n", a, b, c);
        //subtraction -
        c = (short) (a - b);
        System.out.printf("subtraction: %d = (short) (%d - %d)\n", c, a, b);
        //multiplication *
        c = (short) (a * b);
        System.out.printf("multiplication: %d = (short) (%d * %d)\n", c, a, b);
        //division
        c = (short) (a / b);
        System.out.printf("division: %d = (short) (%d / %d)\n", c, a, b);
        try {
            c = (short) (a / 0);
        } catch (ArithmeticException e) {
            System.out.printf("***Arithmetic Exeption: %d = (short) (%d / 0)\n", c, a);
        }
        //modulus
        c = (short) (a % b);
        System.out.printf("modulus: %d = (short) (%d %% %d)\n", c, a, b);
        try {
            c = (short) (a % 0);
        } catch (ArithmeticException e) {
            System.out.printf("***ArithmeticException: %d = (short) (%d %% 0)\n", c, a);
        }
        //unary plus / minus
        c = (short)-a;
        System.out.printf("unary minus: (short)-%d = %d\n", a, c);
        c = (short)+a;
        System.out.printf("unary plus: (short)+%d = %d\n", a, c);
        //increment ++
        a = 9;
        System.out.printf("prefix increment: ++%d = %d\n", a, ++a);
        a = 9;
        System.out.printf("postfix increment: %d++ = %d\n", a, a++);
        //decrement --
        a = 9;
        System.out.printf("prefix decrement: --%d = %d\n", a, --a);
        a = 9;
        System.out.printf("postfix decrement: %d-- = %d\n", a, a--);


        System.out.println("\n***** Relational Operators *****");
        a = 9;
        b = 6;
        //equal to ==
        System.out.printf("equal to: %d == %d - - > %b\n", a, b, a == b);
        //not equal to !=
        System.out.printf("not equal to: %d != %d - - > %b\n", a, b, a != b);
        //greater than >
        System.out.printf("greater than: %d > %d - - > %b\n", a, b, a > b);
        //less than <
        System.out.printf("less than: %d < %d - - > %b\n", a, b, a < b);
        //greater than or equal to >=
        System.out.printf("greater than or equal to: %d >= %d - - > %b\n", a, b, a>= b);
        //less than or equal to <=
        System.out.printf("less than or equal to: %d <= %d - - > %b\n", a, b, a<=b);

        System.out.println("\n***** Logical Operators *****");
        //logical not !
        System.out.printf("logical not: !(%d > %d) - - > %b\n", a, b, !(a>b));
        System.out.printf("logical not: !(%d < %d) - - > %b\n", a, b, !(a<b));
        //logical xor ^
        System.out.printf("logical xor: %d >= %d | %d != 0 - - > %b\n", a, b, b, a>=b ^ b!=0);
        System.out.printf("logical xor: %d <= %d | %d != 0 - - > %b\n", a, b, b, a<=b ^ b!=0);
        System.out.printf("logical xor: %d <= %d | %d != 2 - - > %b\n", a, b, b, a<=b ^ b!=2);
        //logical AND &&
        System.out.printf("logical AND: %d > %d && %d > 0 - - > %b\n", a, b, a, a>b && a>0);
        System.out.printf("logical AND: %d < %d && %d > 0 - - > %b\n", a, b, a, a<b && a>0);
        System.out.printf("logical AND: %d < %d && %d < 0 - - > %b\n", a, b, a, a<b && a<0);
        //logical OR ||
        System.out.printf("logical OR: %d > %d || %d < 0 - - > %b\n", a, b, a, a>b || a<0);
        System.out.printf("logical OR: %d < %d || %d < 0 - - > %b\n", a, b, a, a<b || a<0);
        System.out.printf("logical OR: %d < %d || %d < 0 - - > %b\n", a, b, a, a>b || a<0);

        System.out.println("\n***** Bitwise Operators *****");
        //bitwise AND &
        c = (short) (a & b);
        System.out.println("\nbitwise AND");
        System.out.printf("(short) (%d & %d) = %d\n", a, b, c);
        System.out.printf("in binary form: (short) (%s & %s) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise OR |
        c = (short) (a | b);
        System.out.println("\nbitwise OR");
        System.out.printf("(short) (%d | %d) = %d\n", a, b, c);
        System.out.printf("in binary form: (short) (%s | %s) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise XOR ^
        c = (short) (a ^ b);
        System.out.println("\nbitwise XOR");
        System.out.printf("(short) (%d ^ %d) = %d\n", a, b, c);
        System.out.printf("in binary form: (short) (%s ^ %s) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise compliment ~
        c = (short) ~a;
        System.out.println("\nbitwise unary compliment");
        System.out.printf(" (short) ~%d = %d\n", a, c);
        System.out.printf("in binary form: (short) ~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //left shift <<
        c = (short) (a << 1);
        System.out.println("\nleft shift");
        System.out.printf(" (short) (%d << 1) = %d\n", a, c);
        System.out.printf("in binary form: (short) (%s << 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //right shift >>
        a = 9;
        c = (short) (a >> 1);
        System.out.println("\nright shift");
        System.out.printf(" (short) (%d >> 1) = %d\n", a, c);
        System.out.printf("in binary form: (short) (%s >> 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = -9;
        c = (short) (a >> 1);
        System.out.printf(" (short) (%d >> 1) = %d\n", a, c);
        System.out.printf("in binary form: (short) (%s >> 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //zero fill right shift >>>
        System.out.println("\nzero fill right shift");
        a = 9;
        c = (short) (a >>> 1);
        System.out.printf(" (short) (%d >>> 1) = %d\n", a, c);
        System.out.printf("in binary form: (short) (%s >>> 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = -9;
        c = (short) (a >>> 1);
        System.out.printf(" (short) (%d >>> 1) = %d\n", a, c);
        System.out.printf("in binary form: (short) (%s >>> 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators*****");

        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c += a --> " + "c = " + (c += a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c -= a --> " + "c = " + (c -= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c *= a --> " + "c = " + (c *= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c /= a --> " + "c = " + (c /= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c %= a --> " + "c = " + (c %= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c <<= a --> " + "c = " + (c <<= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c >>= a --> " + "c = " + (c >>= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c >>>= a --> " + "c = " + (c >>>= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c &= a --> " + "c = " + (c &= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c ^= a --> " + "c = " + (c ^= a));
        c = 12;
        a = 9;
        System.out.println("c = 12, a = 9, c |= a --> " + "c = " + (c |= a));

        System.out.println("\n***** Conditional Operators *****");
        a = 9;
        b = 6;
        System.out.printf("%d > %d ? %d : %d --> %d\n", a,b,a,b,(a>b?a:b));

        System.out.println("\n***** TypeCast Operators *****");
        byte byt = -1;
        //short sh = 32000;
        char cha = '!';
        int i = 11;
        long lon = -2_000_000_000_000L;
        float floa = 2.345F;
        double doubl = -5.9321;
        boolean bool = true;

        c = byt;
        System.out.printf("short = byte: c = %d --> c = %d\n", byt, c);
        c = (short) cha;
        System.out.printf("short = char: c = (short)'%c' --> c = %d\n", cha, c);
        c = (short) i;
        System.out.printf("short = int: c = (short)%d --> c = %d\n", i, c);
        c = (short) lon;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", lon, c);
        c = (short) floa;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", floa, c);
        c = (short) doubl;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", doubl, c);
        //c = (short) bool;
        System.out.printf("short = boolean: Error\n");
    }

    public static void testChar() {
        char a = 'C';
        char b = '&';
        char c;

        System.out.println("***** Arithmetical Operators *****");
        System.out.println("if char convert to int, we can operate with it using arithmetical operators and ascii table");

        //addition +
        c = (char) (a + b);
        int d = c;
        int e = b;
        int f = a;
        //System.out.println((char) (a + 4));
        System.out.printf("addition: (char) (%c + %c) = %c\n", a, b, c);
        //System.out.println(f + " + " + e + " = " + d);
        //subtraction -
        c = (char) (a - b);
        System.out.printf("subtraction: '%c' = (char) ('%c' - '%c')\n", c, a, b);
        //multiplication *
        c = (char) (a * b);
        System.out.printf("multiplication: '%c' = (char) ('%c' * '%c')\n", c, a, b);
        //division
        c = (char) (a / b);
        System.out.printf("division: '%c' = (char) ('%c' / '%c')\n", c, a, b);
        //modulus
        c = (char) (a % b);
        System.out.printf("modulus: '%c' = (char) ('%c' %% '%c')\n", c, a, b);
        //unary plus / minus
        c = (char)-a;
        System.out.printf("unary minus: (char)-'%c' = '%c'\n", a, c);
        c = (char)+a;
        System.out.printf("unary plus: (char)+'%c' = '%c'\n", a, c);
        //increment ++
        a = 'A';
        System.out.printf("prefix increment: ++'%c' = '%c'\n", a, ++a);
        a = 'A';
        System.out.printf("postfix increment: '%c'++ = '%c'\n", a, a++);
        //decrement --
        a = 'A';
        System.out.printf("prefix decrement: --'%c' = '%c'\n", a, --a);
        a = 'A';
        System.out.printf("postfix decrement: '%c'-- = '%c'\n", a, a--);


        System.out.println("\n***** Relational Operators *****");
        System.out.println("\n!!Relational operators use int value of appropriate char");
        a = 'C';
        b = '&';
        //equal to ==
        System.out.printf("equal to: %c == %c - - > %b\n", d, e, d == e);
        //not equal to !=
        System.out.printf("not equal to: %c != %c - - > %b\n", a, b, a != b);
        //greater than >
        System.out.printf("greater than: %c > %c - - > %b\n", a, b, a > b);
        //less than <
        System.out.printf("less than: %c < %c - - > %b\n", a, b, a < b);
        //greater than or equal to >=
        System.out.printf("greater than or equal to: %c >= %c - - > %b\n", a, b, a>= b);
        //less than or equal to <=
        System.out.printf("less than or equal to: %c <= %c - - > %b\n", a, b, a<=b);

        System.out.println("\n***** Logical Operators *****");
        System.out.println("\n!! Logical operators use int value of appropriate char");
        //logical not !
        System.out.printf("logical not: !(%c > %c) - - > %b\n", a, b, !(a>b));
        System.out.printf("logical not: !(%c < %c) - - > %b\n", a, b, !(a<b));
        //logical xor ^
        System.out.printf("logical xor: %c >= %c | %c != 0 - - > %b\n", a, b, b, a>=b ^ b!=0);
        System.out.printf("logical xor: %c <= %c | %c != 0 - - > %b\n", a, b, b, a<=b ^ b!=0);
        System.out.printf("logical xor: %c <= %c | %c != 2 - - > %b\n", a, b, b, a<=b ^ b!=2);
        //logical AND &&
        System.out.printf("logical AND: %c > %c && %c > 0 - - > %b\n", a, b, a, a>b && a>0);
        System.out.printf("logical AND: %c < %c && %c > 0 - - > %b\n", a, b, a, a<b && a>0);
        System.out.printf("logical AND: %c < %c && %c < 0 - - > %b\n", a, b, a, a<b && a<0);
        //logical OR ||
        System.out.printf("logical OR: %c > %c || %c < 0 - - > %b\n", a, b, a, a>b || a<0);
        System.out.printf("logical OR: %c < %c || %c < 0 - - > %b\n", a, b, a, a<b || a<0);
        System.out.printf("logical OR: %c < %c || %c < 0 - - > %b\n", a, b, a, a>b || a<0);

        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("\n!!  Bitwise operators use int value of appropriate char");
        //bitwise AND &
        c = (char) (a & b);
        System.out.println("\nbitwise AND");
        System.out.printf("(char) (%c & %c) = %c\n", a, b, c);
        System.out.printf("in binary form: (char) (%s & %s) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise OR |
        c = (char) (a | b);
        System.out.println("\nbitwise OR");
        System.out.printf("(char) (%c | %c) = %c\n", a, b, c);
        System.out.printf("in binary form: (char) (%s | %s) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise XOR ^
        c = (char) (a ^ b);
        System.out.println("\nbitwise XOR");
        System.out.printf("(char) (%c ^ %c) = %c\n", a, b, c);
        System.out.printf("in binary form: (char) (%s ^ %s) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise compliment ~
        c = (char) ~a;
        System.out.println("\nbitwise unary compliment");
        System.out.printf(" (char) ~%c = %c\n", a, c);
        System.out.printf("in binary form: (char) ~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //left shift <<
        c = (char) (a << 1);
        System.out.println("\nleft shift");
        System.out.printf(" (char) (%c << 1) = %c\n", a, c);
        System.out.printf("in binary form: (char) (%s << 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //right shift >>
        a = 'A';
        c = (char) (a >> 1);
        System.out.println("\nright shift");
        System.out.printf(" (char) (%c >> 1) = %c\n", a, c);
        System.out.printf("in binary form: (char) (%s >> 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //zero fill right shift >>>
        System.out.println("\nzero fill right shift");
        a = 'A';
        c = (char) (a >>> 1);
        System.out.printf(" (char) (%c >>> 1) = %c\n", a, c);
        System.out.printf("in binary form: (char) (%s >>> 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators*****");
        System.out.println("\n!!  Assignment operators use int value of appropriate char");
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c += a --> " + "c = " + (c += a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c -= a --> " + "c = " + (c -= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c *= a --> " + "c = " + (c *= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c /= a --> " + "c = " + (c /= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c %= a --> " + "c = " + (c %= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c <<= a --> " + "c = " + (c <<= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c >>= a --> " + "c = " + (c >>= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c >>>= a --> " + "c = " + (c >>>= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c &= a --> " + "c = " + (c &= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c ^= a --> " + "c = " + (c ^= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c |= a --> " + "c = " + (c |= a));

        System.out.println("\n***** Conditional Operators *****");
        System.out.println("\n!!  Conditional operators use int value of appropriate char");
        a = 'A';
        b = '!';
        System.out.printf("%c > %c ? %c : %c --> %c\n", a,b,a,b,(a>b?a:b));

        System.out.println("\n***** TypeCast Operators *****");
        byte byt = 33;
        short sh = 32000;
        //char cha = '!';
        int i = -11;
        long lon = -2_000_000_000_000L;
        float floa = 222.345F;
        double doubl = -55.9321;
        boolean bool = true;

        c = (char) byt;
        System.out.printf("char = byte(only positive): c = (char)%d --> c = %c\n", byt, c);
        c = (char) sh;
        System.out.printf("char = short(only positive): c = (char)'%c' --> c = %c\n", sh, c);
        c = (char) i;
        System.out.printf("char = int: c = (char)%d --> c = %c\n", i, c);
        c = (char) lon;
        System.out.printf("char = long: c = (char)%d --> c = %c\n", lon, c);
        c = (char) floa;
        System.out.printf("char = float: c = (char)%f --> c = %c\n", floa, c);
        c = (char) doubl;
        System.out.printf("char = double: c = (char)%f --> c = %c\n", doubl, c);
        //c = bool;
        System.out.printf("short = boolean: Error\n");
    }

    public static void testInt() {
        int a = 1 + (int) (Math.random() * 4);
        int b = 1 + (int) (Math.random() * 7);
        int c;
        System.out.println("\n***** Arithmetical Operators int *****");
//      addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
//      subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
//      multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
//      division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
//      modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 5;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,

                (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,

                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,

                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,

                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,

                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,

                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);

        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);

    }

    public static void testLong() {
        long a = 15L;
        long b = 18L;
        long c;

        System.out.println("***** Arithmetical Operators *****");

        //addition +
        c = a + b;
        System.out.printf("addition: %d + %d = %d\n", a, b, c);
        //subtraction -
        c = a - b;
        System.out.printf("subtraction: %d = %d - %d\n", c, a, b);
        //multiplication *
        c = a * b;
        System.out.printf("multiplication: %d = %d * %d\n", c, a, b);
        //division
        c = a / b;
        System.out.printf("division: %d = %d / %d\n", c, a, b);
        try {
            c = a / 0;
        } catch (ArithmeticException e) {
            System.out.printf("***Arithmetic Exeption: %d = %d / 0\n", c, a);
        }
        //modulus
        c = a % b;
        System.out.printf("modulus: %d = %d %% %d\n", c, a, b);
        try {
            c = a % 0;
        } catch (ArithmeticException e) {
            System.out.printf("***ArithmeticException: %d = %d %% 0\n", c, a);
        }
        //unary plus / minus
        c = -a;
        System.out.printf("unary minus: -%d = %d\n", a, c);
        c = +a;
        System.out.printf("unary plus: +%d = %d\n", a, c);
        //increment ++
        a = 9L;
        System.out.printf("prefix increment: ++%d = %d\n", a, ++a);
        a = 9L;
        System.out.printf("postfix increment: %d++ = %d\n", a, a++);
        //decrement --
        a = 9L;
        System.out.printf("prefix decrement: --%d = %d\n", a, --a);
        a = 9L;
        System.out.printf("postfix decrement: %d-- = %d\n", a, a--);


        System.out.println("\n***** Relational Operators *****");
        a = 9L;
        b = 6L;
        //equal to ==
        System.out.printf("equal to: %d == %d - - > %b\n", a, b, a == b);
        //not equal to !=
        System.out.printf("not equal to: %d != %d - - > %b\n", a, b, a != b);
        //greater than >
        System.out.printf("greater than: %d > %d - - > %b\n", a, b, a > b);
        //less than <
        System.out.printf("less than: %d < %d - - > %b\n", a, b, a < b);
        //greater than or equal to >=
        System.out.printf("greater than or equal to: %d >= %d - - > %b\n", a, b, a>= b);
        //less than or equal to <=
        System.out.printf("less than or equal to: %d <= %d - - > %b\n", a, b, a<=b);

        System.out.println("\n***** Logical Operators *****");
        //logical not !
        System.out.printf("logical not: !(%d > %d) - - > %b\n", a, b, !(a>b));
        System.out.printf("logical not: !(%d < %d) - - > %b\n", a, b, !(a<b));
        //logical xor ^
        System.out.printf("logical xor: %d >= %d | %d != 0 - - > %b\n", a, b, b, a>=b ^ b!=0);
        System.out.printf("logical xor: %d <= %d | %d != 0 - - > %b\n", a, b, b, a<=b ^ b!=0);
        System.out.printf("logical xor: %d <= %d | %d != 2 - - > %b\n", a, b, b, a<=b ^ b!=2);
        //logical AND &&
        System.out.printf("logical AND: %d > %d && %d > 0 - - > %b\n", a, b, a, a>b && a>0);
        System.out.printf("logical AND: %d < %d && %d > 0 - - > %b\n", a, b, a, a<b && a>0);
        System.out.printf("logical AND: %d < %d && %d < 0 - - > %b\n", a, b, a, a<b && a<0);
        //logical OR ||
        System.out.printf("logical OR: %d > %d || %d < 0 - - > %b\n", a, b, a, a>b || a<0);
        System.out.printf("logical OR: %d < %d || %d < 0 - - > %b\n", a, b, a, a<b || a<0);
        System.out.printf("logical OR: %d < %d || %d < 0 - - > %b\n", a, b, a, a>b || a<0);

        System.out.println("\n***** Bitwise Operators *****");
        //bitwise AND &
        c = a & b;
        System.out.println("\nbitwise AND");
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.printf("in binary form: %s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
        //bitwise OR |
        c = a | b;
        System.out.println("\nbitwise OR");
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.printf("in binary form: %s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
        //bitwise XOR ^
        c = a ^ b;
        System.out.println("\nbitwise XOR");
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.printf("in binary form: %s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
        //bitwise compliment ~
        c = ~a;
        System.out.println("\nbitwise unary compliment");
        System.out.printf("~%d = %d\n", a, c);
        System.out.printf("in binary form: ~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        //left shift <<
        c = a << 1;
        System.out.println("\nleft shift");
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.printf("in binary form: %s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        //right shift >>
        a = 9L;
        c = a >> 1;
        System.out.println("\nright shift");
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.printf("in binary form: %s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        a = -9L;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.printf("in binary form: %s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        //zero fill right shift >>>
        System.out.println("\nzero fill right shift");
        a = 9L;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.printf("in binary form: %s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
        a = -9L;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.printf("in binary form: %s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        System.out.println("\n***** Assignment Operators*****");

        c = 12;
        a = 9L;
        System.out.println("c = 12, a = 9L, c += a --> " + "c = " + (c += a));
        c = 12;
        a = 9L;
        System.out.println("c = 12, a = 9L, c -= a --> " + "c = " + (c -= a));
        c = 12;
        a = 9L;
        System.out.println("c = 12, a = 9L, c *= a --> " + "c = " + (c *= a));
        c = 12;
        a = 9L;
        System.out.println("c = 12, a = 9L, c /= a --> " + "c = " + (c /= a));
        c = 12;
        a = 9L;
        System.out.println("c = 12, a = 9L, c %= a --> " + "c = " + (c %= a));
        c = 12;
        a = 9L;
        System.out.println("c = 12, a = 9L, c <<= a --> " + "c = " + (c <<= a));
        c = 12;
        a = 9L;
        System.out.println("c = 12, a = 9L, c >>= a --> " + "c = " + (c >>= a));
        c = 12;
        a = 9L;
        System.out.println("c = 12, a = 9L, c >>>= a --> " + "c = " + (c >>>= a));

        c = 12;
        a = 9L;
        System.out.println("c = 12, a = 9L, c &= a --> " + "c = " + (c &= a));
        c = 12;
        a = 9L;
        System.out.println("c = 12, a = 9L, c ^= a --> " + "c = " + (c ^= a));
        c = 12;
        a = 9L;
        System.out.println("c = 12, a = 9L, c |= a --> " + "c = " + (c |= a));

        System.out.println("\n***** Conditional Operators *****");
        a = 9L;
        b = 6;
        System.out.printf("%d > %d ? %d : %d --> %d\n", a,b,a,b,(a>b?a:b));

        System.out.println("\n***** TypeCast Operators *****");
        byte b1 = -1;
        short sh = 32000;
        char c1 = '!';
        int i = 11;
        //long l1 = -2_000_000_000_000L;
        float f1 = 2.345F;
        double d1 = -5.9321;
        boolean bool = true;

        c = b1;
        System.out.printf("long = byte: c = %d --> c = %d\n", b1, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = c1;
        System.out.printf("long = char: c = '%c' --> c = %d\n", c1, c);
        c = i;
        System.out.printf("long = int: c = %d --> c = %d\n", i, c);
        c = (long) f1;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f1, c);
        c = (long) d1;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d1, c);
        //c = (long) bool;
        System.out.printf("long = boolean: Error\n");
    }





    public static void testFloat() {
        float a = 9.1f;
        float b = -0.1f;
        float c;

        System.out.println("***** Arithmetical Operators *****");

        //addition +
        c = a + b;
        System.out.printf("addition: %f + %f = %f\n", a, b, c);
        //subtraction -
        c = a - b;
        System.out.printf("subtraction: %f = %f - %f\n", c, a, b);
        //multiplication *
        c = a * b;
        System.out.printf("multiplication: %f = %f * %f\n", c, a, b);
        //division
        c = a / b;
        System.out.printf("division: %f = %f / %f\n", c, a, b);
        try {
            c = a / 0;
        } catch (ArithmeticException e) {
            System.out.printf("***Arithmetic Exeption: %f = %f / 0\n", c, a);
        }
        //modulus
        c = a % b;
        System.out.printf("modulus: %f = %f %% %f\n", c, a, b);
        try {
            c = a % 0;
        } catch (ArithmeticException e) {
            System.out.printf("***ArithmeticException: %f = %f %% 0\n", c, a);
        }
        //unary plus / minus
        c = -a;
        System.out.printf("unary minus: -%f = %f\n", a, c);
        c = +a;
        System.out.printf("unary plus: +%f = %f\n", a, c);
        //increment ++
        a = 9.7f;
        System.out.printf("prefix increment: ++%f = %f\n", a, ++a);
        a = 9.7f;
        System.out.printf("postfix increment: %f++ = %f\n", a, a++);
        //decrement --
        a = 9.7f;
        System.out.printf("prefix decrement: --%f = %f\n", a, --a);
        a = 9.7f;
        System.out.printf("postfix decrement: %f-- = %f\n", a, a--);


        System.out.println("\n***** Relational Operators *****");
        a = 9.7f;
        b = -3.876543219f;
        //equal to ==
        System.out.printf("equal to: %f == %f - - > %b\n", a, b, a == b);
        //not equal to !=
        System.out.printf("not equal to: %f != %f - - > %b\n", a, b, a != b);
        //greater than >
        System.out.printf("greater than: %f > %f - - > %b\n", a, b, a > b);
        //less than <
        System.out.printf("less than: %f < %f - - > %b\n", a, b, a < b);
        //greater than or equal to >=
        System.out.printf("greater than or equal to: %f >= %f - - > %b\n", a, b, a>= b);
        //less than or equal to <=
        System.out.printf("less than or equal to: %f <= %f - - > %b\n", a, b, a<=b);

        System.out.println("\n***** Logical Operators *****");
        //logical not !
        System.out.printf("logical not: !(%f > %f) - - > %b\n", a, b, !(a>b));
        System.out.printf("logical not: !(%f < %f) - - > %b\n", a, b, !(a<b));
        //logical xor ^
        System.out.printf("logical xor: %f >= %f | %f != 0 - - > %b\n", a, b, b, a>=b ^ b!=0);
        System.out.printf("logical xor: %f <= %f | %f != 0 - - > %b\n", a, b, b, a<=b ^ b!=0);
        System.out.printf("logical xor: %f <= %f | %f != 2 - - > %b\n", a, b, b, a<=b ^ b!=2);
        //logical AND &&
        System.out.printf("logical AND: %f > %f && %f > 0 - - > %b\n", a, b, a, a>b && a>0);
        System.out.printf("logical AND: %f < %f && %f > 0 - - > %b\n", a, b, a, a<b && a>0);
        System.out.printf("logical AND: %f < %f && %f < 0 - - > %b\n", a, b, a, a<b && a<0);
        //logical OR ||
        System.out.printf("logical OR: %f > %f || %f < 0 - - > %b\n", a, b, a, a>b || a<0);
        System.out.printf("logical OR: %f < %f || %f < 0 - - > %b\n", a, b, a, a<b || a<0);
        System.out.printf("logical OR: %f < %f || %f < 0 - - > %b\n", a, b, a, a>b || a<0);

        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("Bitwise operators cannot be applied to float");

        System.out.println("\n***** Assignment Operators*****");

        c = 0.1f;
        a = 9.1f;
        System.out.println("c = 0.1, a = 9.1, c += a --> " + "c = " + (c += a) + "!!!");
        c = 0.1f;
        a = 9.1f;
        System.out.println("c = 0.1, a = 9.1, c -= a --> " + "c = " + (c -= a));
        c = 0.1f;
        a = 9.1f;
        System.out.println("c = 0.1, a = 9.1, c *= a --> " + "c = " + (c *= a));
        c = 0.1f;
        a = 9.1f;
        System.out.println("c = 0.1, a = 9.1, c /= a --> " + "c = " + (c /= a));
        c = 0.1f;
        a = 9.1f;
        System.out.println("c = 0.1, a = 9.1, c %= a --> " + "c = " + (c %= a));

        System.out.println("\n <<=, >>=, >>>=, &=, ^=, |= cannot be applied to float");

        System.out.println("\n***** Conditional Operators *****");
        a = 9.1f;
        b = 2.3456789123f;
        System.out.printf("%f > %f ? %f : %f --> %f\n", a,b,a,b,(a>b?a:b));

        System.out.println("\n***** TypeCast Operators *****");
        byte b1 = -1;
        short sh = 32000;
        char c1 = '!';
        int i = 11;
        long l1 = -2_000_000_000_000L;
        //float f1 = 2.345F;
        double d1 = -5.9321;
        boolean bool = true;

        c = b1;
        System.out.printf("float = byte: c = %d --> c = %f\n", b1, c);
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
        c = c1;
        System.out.printf("float = char: c = '%c' --> c = %f\n", c1, c);
        c = i;
        System.out.printf("float = int: c = %d --> c = %f\n", i, c);
        c = (float) l1;
        System.out.printf("float = long: c = (float)%d --> c = %f\n", l1, c);
        c = (float) d1;
        System.out.printf("float = double: c = (float)%f --> c = %f\n", d1, c);
        //c = bool;
        System.out.printf("float = boolean: Error\n");
    }

    public static void testDouble() {
        double a = 9.1d;
        double b = -0.1d;
        double c;

        System.out.println("***** Arithmetical Operators *****");

        //addition +
        c = a + b;
        System.out.printf("addition: %1.2f + %.2f = %.2f\n", a, b, c);
        //subtraction -
        c = a - b;
        System.out.printf("subtraction: %f = %f - %f\n", c, a, b);
        //multiplication *
        c = a * b;
        System.out.printf("multiplication: %f = %f * %f\n", c, a, b);
        //division
        c = a / b;
        System.out.printf("division: %f = %f / %f\n", c, a, b);
        try {
            c = a / 0;
        } catch (ArithmeticException e) {
            System.out.printf("***Arithmetic Exception: %f = %f / 0\n", c, a);
        }
        //modulus
        c = a % b;
        System.out.printf("modulus: %f = %f %% %f\n", c, a, b);
        try {
            c = a % 0;
        } catch (ArithmeticException e) {
            System.out.printf("***ArithmeticException: %f = %f %% 0\n", c, a);
        }
        //unary plus / minus
        c = -a;
        System.out.printf("unary minus: -%f = %f\n", a, c);
        c = +a;
        System.out.printf("unary plus: +%f = %f\n", a, c);
        //increment ++
        a = 9.7f;
        System.out.printf("prefix increment: ++%f = %f\n", a, ++a);
        a = 9.7f;
        System.out.printf("postfix increment: %f++ = %f\n", a, a++);
        //decrement --
        a = 9.7f;
        System.out.printf("prefix decrement: --%f = %f\n", a, --a);
        a = 9.7f;
        System.out.printf("postfix decrement: %f-- = %f\n", a, a--);


        System.out.println("\n***** Relational Operators *****");
        a = 9.7;
        b = -3.876543219;
        //equal to ==
        System.out.printf("equal to: %f == %f - - > %b\n", a, b, a == b);
        //not equal to !=
        System.out.printf("not equal to: %f != %f - - > %b\n", a, b, a != b);
        //greater than >
        System.out.printf("greater than: %f > %f - - > %b\n", a, b, a > b);
        //less than <
        System.out.printf("less than: %f < %f - - > %b\n", a, b, a < b);
        //greater than or equal to >=
        System.out.printf("greater than or equal to: %f >= %f - - > %b\n", a, b, a>= b);
        //less than or equal to <=
        System.out.printf("less than or equal to: %f <= %f - - > %b\n", a, b, a<=b);

        System.out.println("\n***** Logical Operators *****");
        //logical not !
        System.out.printf("logical not: !(%f > %f) - - > %b\n", a, b, !(a>b));
        System.out.printf("logical not: !(%f < %f) - - > %b\n", a, b, !(a<b));
        //logical xor ^
        System.out.printf("logical xor: %f >= %f | %f != 0 - - > %b\n", a, b, b, a>=b ^ b!=0);
        System.out.printf("logical xor: %f <= %f | %f != 0 - - > %b\n", a, b, b, a<=b ^ b!=0);
        System.out.printf("logical xor: %f <= %f | %f != 2 - - > %b\n", a, b, b, a<=b ^ b!=2);
        //logical AND &&
        System.out.printf("logical AND: %f > %f && %f > 0 - - > %b\n", a, b, a, a>b && a>0);
        System.out.printf("logical AND: %f < %f && %f > 0 - - > %b\n", a, b, a, a<b && a>0);
        System.out.printf("logical AND: %f < %f && %f < 0 - - > %b\n", a, b, a, a<b && a<0);
        //logical OR ||
        System.out.printf("logical OR: %f > %f || %f < 0 - - > %b\n", a, b, a, a>b || a<0);
        System.out.printf("logical OR: %f < %f || %f < 0 - - > %b\n", a, b, a, a<b || a<0);
        System.out.printf("logical OR: %f < %f || %f < 0 - - > %b\n", a, b, a, a>b || a<0);

        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("Bitwise operators cannot be applied to double");

        System.out.println("\n***** Assignment Operators*****");

        c = 0.1;
        a = 9.1;
        System.out.println("c = 0.1, a = 9.1, c += a --> " + "c = " + (c += a));
        c = 0.1;
        a = 9.1;
        System.out.println("c = 0.1, a = 9.1, c -= a --> " + "c = " + (c -= a));
        c = 0.1;
        a = 9.1;
        System.out.println("c = 0.1, a = 9.1, c *= a --> " + "c = " + (c *= a));
        c = 0.1;
        a = 9.1;
        System.out.println("c = 0.1, a = 9.1, c /= a --> " + "c = " + (c /= a));
        c = 0.1;
        a = 9.1;
        System.out.println("c = 0.1, a = 9.1, c %= a --> " + "c = " + (c %= a));

        System.out.println("\n <<=, >>=, >>>=, &=, ^=, |= cannot be applied to double");

        System.out.println("\n***** Conditional Operators *****");
        a = 9.1;
        b = 2.3456789123;
        System.out.printf("%f > %f ? %f : %f --> %f\n", a,b,a,b,(a>b?a:b));

        System.out.println("\n***** TypeCast Operators *****");
        byte b1 = -1;
        short sh = 32000;
        char c1 = '!';
        int i = 11;
        long l1 = -2_000_000_000_000L;
        float f1 = 2.345F;
        boolean bool = true;

        c = b1;
        System.out.printf("double = byte: c = %d --> c = %f\n", b1, c);
        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
        c = c1;
        System.out.printf("double = char: c = '%c' --> c = %f\n", c1, c);
        c = i;
        System.out.printf("double = int: c = %d --> c = %f\n", i, c);
        c = l1;
        System.out.printf("double = long: c = %d --> c = %f\n", l1, c);
        c = f1;
        System.out.printf("double = float: c = %f --> c = %f\n", f1, c);
        //c = bool;
        System.out.printf("double = boolean: Error\n");
    }


    public static void testStudent() {

        Student student1 = new Student("Alex", 10);
        Student student2 = new Student("Roma", 9);
        Student student3;

        System.out.println("***** Arithmetical Operators *****");
        System.out.println("Cannot be applied");


        System.out.println("\n***** Relational Operators *****");
        System.out.println("Cannot be applied, method equals() could be used for comparison");

        System.out.println("\n***** Logical Operators *****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** Assignment Operators*****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** Conditional Operators *****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** TypeCast Operators *****");
        System.out.println("Incompatible types error");
    }

    public static void testString() {
        String a = "asd";
        String b = "jkl";
        String c;

        System.out.println("***** Arithmetical Operators *****");
        //addition +
        c = a + b;
        System.out.printf("addition: %s + %s = %s\n", a, b, c);
        System.out.println("Only operator '+' is available");

        System.out.println("\n***** Relational Operators *****");
        //equal to ==
        System.out.printf("equal to: %s == %s - - > %b\n", a, b, a == b);
        //not equal to !=
        System.out.printf("not equal to: %s != %s - - > %b\n", a, b, a != b);
        System.out.println("Other operators, like >< are unavailable");

        System.out.println("\n***** Logical Operators *****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** Assignment Operators*****");
        a = "abc";
        c = "def";
        System.out.println("a = abc, c = def, c += a --> " + "c = " + (c += a));

        System.out.println("\n***** Conditional Operators *****");
        System.out.println("Cannot be applied");

        System.out.println("\n***** TypeCast Operators *****");
        byte b1 = -1;
        short sh = 32000;
        char c1 = '!';
        int i = 12;
        long l1 = -2_000_000_000_000L;
        float f1 = 2.345F;
        double d1 = -5.9321;
        boolean bool = true;

        System.out.println("\n!! method toString() could be used\n");
        c = Byte.toString(b1);
        System.out.printf("String = byte: c = %d --> c = %s\n", b1, c);
        c = Short.toString(sh);
        System.out.printf("String = short: c = %d --> c = %s\n", sh, c);
        c = Character.toString(c1);
        System.out.printf("String = char: c = '%c' --> c = %s\n", c1, c);
        c = Integer.toString(i);
        System.out.printf("String = int: c = %d --> c = %s\n", i, c);
        c = Long.toString(l1);
        System.out.printf("String = long: c = %d --> c = %s\n", l1, c);
        c = Float.toString(f1);
        System.out.printf("String = float: c = %f --> c = %s\n", f1, c);
        c = Double.toString(d1);
        System.out.printf("String = double: c = %f --> c = %s\n", d1, c);
        c = Boolean.toString(bool);
        System.out.printf("String = boolean: c = %b --> c = %s\n", bool, c);
    }

}
