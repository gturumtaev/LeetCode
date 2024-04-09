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
        Scanner scanner = new Scanner(System.in);
        long suDifference = 0;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] temp = new long[n];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = scanner.nextInt();
        }
        for (int i = 0; i < k; i++) {
            suDifference += changeNumber(temp);

        }
        System.out.println(suDifference);
    }

    public static long changeDigitSum(long number) {
        long divisor = 1;
        while (divisor <= number) {
            divisor *= 10;
        }
        divisor /= 10;
        while (divisor > 0){
            if ((((number / divisor) % 10 ) != 9))
                return (9 - ( (number / divisor) % 10 )) * divisor;
            divisor /= 10;
        }
        return 0;
    }

    public static long changeNumber(long[] arr){
        int maxIndex = 0; // n <= 1000
        long max = 0; // max <= 9e10
        for (int i = 0; i < arr.length; i++) {
            long tmp = changeDigitSum(arr[i]); // tmp <= 9e10
            if (tmp > max ){
                max = tmp;
                maxIndex = i;
            }

        }
        arr[maxIndex] += max;
        return max;
    }
}
