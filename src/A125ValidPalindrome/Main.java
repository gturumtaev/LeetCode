package A125ValidPalindrome;
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
//non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
//
//Фраза является палиндромом, если после преобразования всех прописных букв в строчные и удаления всех
//не буквенно-цифровых символов она читается одинаково как в прямом, так и в обратном направлении.
//Буквенно-цифровые символы включают буквы и цифры.
//При заданной строке s верните true, если это палиндром, или false в противном случае.
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
public class Main {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));
        String s2 = "race a car";
        System.out.println(isPalindrome(s2));
        String s3 = " ";
        System.out.println(isPalindrome(s3));
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;

        int first = 0;
        int last = s.length() - 1;

        while (first <= last) {
            char currentFirst = s.charAt(first);
            char currentLast = s.charAt(last);

            if (!Character.isLetterOrDigit(currentFirst)) first++;
            else if (!Character.isLetterOrDigit(currentLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currentFirst) != Character.toLowerCase(currentLast)) return false;
                first++;
                last--;
            }
        }
        return true;
    }
}
