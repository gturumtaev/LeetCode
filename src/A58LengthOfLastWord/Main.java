package A58LengthOfLastWord;

import java.util.Arrays;

//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.
//
//Дана строка s, состоящая из слов и пробелов, верните длину последнего слова в строке.
//Слово – это максимум подстрока состоящий только из символов, не являющихся пробелами.
//
//Example 1:
//
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
//Example 2:
//
//Input: s = "   fly me   to   the moon  "
//Output: 4
//Explanation: The last word is "moon" with length 4.
//Example 3:
//
//Input: s = "luffy is still joyboy"
//Output: 6
//Explanation: The last word is "joyboy" with length 6.
public class Main {
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));
        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s2));
        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s3));
    }

    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }

        }
        return count;
    }
}
