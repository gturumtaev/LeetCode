import java.util.Arrays;

public class JustTest {
    public static void main(String[] args) {
        String[] s = {"f", "abc", "ab", "abcd"};
        System.out.println(generalSymbol(s));
    }
    public static String generalSymbol(String[] s) {
        Arrays.sort(s);
        int first = s[0].length();
        int last = s[s.length - 1].length();
        int ind = 0;

        for (int i = 0; i < Math.min(first, last); i++) {
            if (s[0].charAt(i) == s[s.length - 1].charAt(i)) {
                ind++;
            }
        }
        if (ind == 0) return "Нет общего корня";
        return s[0].substring(0, ind);
    }
}
