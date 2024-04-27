package A67AddBinary;
//Given two binary strings a and b, return their sum as a binary string.
//Даны две двоичные строки a и b, верните их сумму в виде двоичной строки.
//
//Example 1:
//
//Input: a = "11", b = "1"
//Output: "100"
//Example 2:
//
//Input: a = "1010", b = "1011"
//Output: "10101"
public class Main {
    public static void main(String[] args) {
        String a1 = "11";
        String b1 = "1";
        System.out.println(addBinary(a1, b1));
        String a2 = "1010";
        String b2 = "1011";
        System.out.println(addBinary(a2, b2));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            sb.append(sum % 2);
        }

        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}


