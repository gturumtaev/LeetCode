package A771JewelsAndStones;

import java.util.HashSet;
import java.util.Set;

//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
// Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//Letters are case sensitive, so "a" is considered a different type of stone from "A".
//1 <= jewels.length, stones.length <= 50
//        jewels and stones consist of only English letters.
//        All the characters of jewels are unique.
//Вам даны цепочки драгоценных камней, представляющие типы камней, которые являются драгоценными камнями, и камни, представляющие те камни, которые у вас есть.
// Каждый символ в камнях — это тип имеющегося у вас камня. Вы хотите знать, сколько камней у вас тоже являются драгоценностями.
//Буквы чувствительны к регистру, поэтому «а» считается другим типом камня, чем «А».
//
//1 <= драгоценности.длина, камни.длина <= 50
//        драгоценности и камни состоят только из английских букв.
//        Все характеры драгоценностей уникальны.
//
//
//Example 1:
//
//Input: jewels = "aA", stones = "aAAbbbb"
//Output: 3
//Example 2:
//
//Input: jewels = "z", stones = "ZZ"
//Output: 0
public class Main {
    public static void main(String[] args) {
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels1, stones1));
        String jewels2 = "z";
        String stones2 = "ZZ";
        System.out.println(numJewelsInStones(jewels2, stones2));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int current = 0;
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                current++;
            }
        }
        return current;
    }
}

