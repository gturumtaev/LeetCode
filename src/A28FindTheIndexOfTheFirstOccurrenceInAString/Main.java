package A28FindTheIndexOfTheFirstOccurrenceInAString;
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//Учитывая две строки, игла и стог сена, верните индекс первого вхождения иглы в стоге сена или -1, если игла не является частью стога сена.
//
//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//Пояснение: «грустный» встречается в индексах 0 и 6.
//Первое вхождение имеет индекс 0, поэтому мы возвращаем 0.
//Example 2:
//
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.Given two strings needle and haystack,
//return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//Пояснение: «leeto» не встречается в «leetcode», поэтому мы возвращаем -1.Для двух строк: игла и стог сена,
//возвращаем индекс первого появления иглы в стоге сена или -1, если игла не является частью стога сена.

public class Main {
    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println(strStr(haystack1, needle1));
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(strStr(haystack2, needle2));


    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0 ) return 0;
        if (haystack.length() == 0) return -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) return -1;
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) !=  haystack.charAt(i + j)) break;
                if (j == needle.length() - 1) return i;
            }
        }
        return -1;
    }
}

