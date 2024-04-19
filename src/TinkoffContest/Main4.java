package TinkoffContest;
//У Кости есть бумажка, на которой написано n чисел. Также у него есть возможность не больше, чем
//k раз, взять любое число с бумажки, после чего закрасить одну из старых цифр, а на ее месте написать новую произвольную цифру.
//На какое максимальное значение Костя сможет увеличить сумму всех чисел на листочке?

//Формат входных данных:
//В первой строке входного файла даны два целых числа n,k — количество чисел на бумажке и ограничение на число операций.
//(1≤n≤1000,1≤k≤10^4).
//Во второй строке записано n чисел ai — числа на бумажке (1≤a≤10^9)
//
//Формат выходных данных:
//В выходной файл выведите одно число — максимальную разность между конечной и начальной суммой.
//
//Замечание:
//В первом примере Костя может изменить две единицы на две девятки, в результате чего сумма чисел увеличится на 16.
//Во втором примере Костя меняет число 85 на 95.
//
//В третьем примере можно ничего не менять.
//Обратите внимание, что ответ может превышать вместимость 32-битного типа данных.
//Примеры данных
//Пример 1
//5  2
//1  2  1  3  5
//
//16
//Пример 2
//3  1
//99  5  85
//
//10
//Пример 3
//1  10
//9999
//
//0
import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        long sumDifference = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < k; i++) {
            sumDifference += changeNumber(array);
        }
        System.out.println(sumDifference);
    }

    public static long changeDigitSum (long digit) {
        long divisor = 1;
        while (divisor < digit) {
            divisor *= 10;
        }
        divisor /= 10;
        while (divisor > 0) {
            if (digit / divisor % 10 != 9) {
                return (((9 - digit / divisor % 10) * divisor));
            }
            divisor /= 10;
        }
        return 0;
    }

    public static long changeNumber (long[] array) {
        int maxIndex = 0;
        long max = 0;
        for (int i = 0; i < array.length; i++) {
            long temp = changeDigitSum(array[i]);
            if (temp > max) {
                max = temp;
                maxIndex = i;
            }
        }
        array[maxIndex] += max;
        return max;
    }


}
