package TinkoffExam;
//Понятная файловая система — залог успеха любой операционной системы.
//К сожалению, не каждая файловая система может похвастаться таким свойством.
//Но, как говорится, если что-то хочешь сделать хорошо — сделай это сам!
//Хочется иметь удобное для просмотра представление директорий, чтобы можно было видеть, какие директории в какие вложены.
//Для этого требуется по списку директорий вывести их перечисление в алфавитном порядке.
//При этом вложенные директории должны быть выведены с отступом на два пробела больше, чем у родительской.
//
//Формат входных данных
//В первой строке дано число n — количество директорий (1≤n≤10^5).
//В следующих n строках по одному в строке заданы абсолютные пути ко всем директориям,
//каждый абсолютный путь — это последовательность вложенных папок, начиная с корневой, разделенная символами "/".
//Гарантируется, что первая директория во всех путях одинаковая и имеет непустое имя.
//Имена всех директорий состоят из маленьких латинских букв и имеют длину не более 10.
//Гарантируется, что если директория выведена, то выведены и все, в которые она вложена.
//
//Формат выходных данных
//Выведите перечисление всех директорий, в котором все директории внутри одной упорядочены по алфавиту, вложенные идут сразу после родительской и имеют отступ на два пробела больше, чем у нее.
//
//Примеры данных
//Пример 1
//6
//root/a
//root/a/b
//root/c/x
//root/a/b/c
//root
//root/c
//
//root
//  a
//    b
//      c
//  c
//    x
//Пример 2
//4
//a/b/c/d
//a/b
//a/b/c
//a
//
//a
//  b
//    c
//      d
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(scanner.nextLine());
        }
        directory(list);

    }

    public static void directory(List<String> list) {
        Collections.sort(list);
        int count = 0;
        for (String s : list) {
            int depth = s.lastIndexOf('/') + 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '/') {
                    count++;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count; i++) {
                sb.append("  ");
            }

            System.out.println(sb.toString() + s.substring(depth));
            count = 0;
        }
    }
}
