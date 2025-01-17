package TinkoffExam;
//В одной из предыдущих задач требовалось вывести перевернутую матрицу, теперь задача усложняется:
//При этом поворот необходимо осуществлять in−place, т. е. без выделения дополнительной памяти.
//Для этого вместо результирующей матрицы необходимо вывести последовательность операций.
//За одну операцию можно обменять местами два элемента матрицы.
//Вам дана матрица n×n, а так же указано, надо ли повернуть изображение по часовой R или против часовой L стрелки.
//Выведите последовательность операций, чтобы исходная матрица повернулась на 90 градусов в указанном направлении.
//Заметьте, что необязательно переставлять элементы в том порядке, в котором происходил бы поворот,
//главное чтобы в результате матрица соответствовала повороту на 90 градусов.
//Также необязательно, чтобы количество операций было минимальным, нужно только вписаться в ограничения.
//
//Формат входных данных
//Первая строка содержит одно натуральное число n (1≤n≤10) и указание направления поворота — символ R или L.
//Следующие n строк содержат описание матрицы, по n целых неотрицательных чисел, не превосходящих 10^18.
//
//Формат выходных данных
//В первой строке выведите число k — необходимое количество операций, при этом это число не должно превосходить 7n^2.
//В последующих k строках выведите по две пары чисел — координаты (x1 ,y1) и (x2 ,y2) ячеек,
//между которыми необходимо обменять элементы матрицы.
//
//Замечание
//Обратите внимание, что нумерация строк и столбцов матрицы ведётся с 0, а не с 1.
//
//Примеры данных
//Пример 1
//2 L
//0 0
//0 1
//
//1
//1 1 0 1
//Пример 2
//3 R
//0 1 0
//1 0 0
//4 3 0
//
//3
//1 0 1 2
//0 0 2 0
//1 0 2 1
//Пример 3
//1 L
//5
//
//0
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String direction = scanner.next();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int k = (n % 2 == 0) ? n / 2 : (n / 2) + 1;
        int operations = 0;
        for (int i = 0; i < k; i++) {
            for (int j = i; j < n - i - 1; j++) {
                if (direction.equals("R")) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - j - 1][i];
                    matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                    matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                    matrix[j][n - i - 1] = temp;
                } else {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][n - i - 1];
                    matrix[j][n - i - 1] = matrix[n - i - 1][n - j - 1];
                    matrix[n - i - 1][n - j - 1] = matrix[n - j - 1][i];
                    matrix[n - j - 1][i] = temp;
                }
                operations++;
            }
        }

        System.out.println(operations);
        for (int i = 0; i < operations; i++) {
            System.out.println((n - 1 - i % n) + " " + (n - 1 - i / n % n) + " " + (i / n % n) + " " + (n - 1 - i / n / n));
        }
    }
}

