package TinkoffExam;
//В любом сколько-нибудь приличном редакторе изображений есть функция поворота изображения наb90 градусов.
//Что уж тут говорить, такая функция есть и в современных мессенджерах! Вот и вам предстоит реализовать эту функцию.
//Полноценный фоторедактор не потребуется, остановимся только на функции поворота изображения на 90 градусов.
//Для простоты будем считать, что изображение представляет из себя матрицу из целых чисел. Вам дана матрица
//n×m. Необходимо вывести матрицу, которая будет являться поворотом исходной на 90 градусов по часовой стрелке.
//
//Формат входных данных
//Первая строка содержит два натуральных числа n и m (1≤n,m≤10^3). Следующие n строк содержат описание матрицы, по
//m целых неотрицательных чисел, не превосходящих 10^18.
//
//Формат выходных данных
//Выведите m строк по n элементов каждую — повернутую на 90 градусов матрицу.
//
//Примеры данных
//Пример 1
//2 2
//1 1
//2 3
//
//2 1
//3 1
//Пример 2
//2 3
//1 2 3
//4 5 6
//
//4 1
//5 2
//6 3
//Пример 3
//1 1
//69
//
//69
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        turnOver(matrix, m, n);
    }

    public static void turnOver (int[][] matrix, int m, int n) {
        for (int j = 0; j < m; j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
