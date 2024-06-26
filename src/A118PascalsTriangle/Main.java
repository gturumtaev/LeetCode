package A118PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

//Given an integer numRows, return the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//Учитывая целое число numRows, верните первые числа треугольника Паскаля.
//В треугольнике Паскаля каждое число является суммой двух чисел, расположенных непосредственно над ним, как показано на рисунке:
//
//Example 1:
//
//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//Example 2:
//
//Input: numRows = 1
//Output: [[1]]
public class Main {
    public static void main(String[] args) {
        int a1 = 5;
        System.out.println(generate(a1));
        int a2 = 1;
        System.out.println(a2);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) return triangle;

        triangle.add(new ArrayList<>(List.of(1)));

        for (int i = 1; i < numRows; i++) {
            List<Integer> previewRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(previewRow.get(j - 1) + previewRow.get(j));
            }
            currentRow.add(1);

            triangle.add(currentRow);
        }
        return triangle;
    }
}
