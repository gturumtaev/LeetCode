package TinkoffExam;
//Ну и конечно же задача на блуждания коня по шахматной доске размера n×n.
//Чтобы блуждать не было скучно, на доске разбросаны специальные фишки.
//Есть два типа фишек — "K" и "G". При ходе в клетку, в которой лежит фишка "K",
//фигура превращается в коня. При ходе в клетку, в которой лежит фишка "G",
//фигура превращается в короля. Разумеется, после превращения фигура начинает ходить соответственно своему новому типу.
//Попадание короля в клетку с фишкой "G" или коня в клетку с фишкой "K" ничего не меняет.
//При этом трансформация является обязательной и фигура не может пройти такую клетку с фишкой без превращения в указанный тип.
//Ваша задача определить, за какое минимальное количество ходов фигура (возможно в образе коня/короля) доберется до заданной клетки.
//Заметьте, что количество трансформаций считать не нужно.
//
//Формат входных данных
//В первой строке задано одно натуральное число n — размер доски (2≤n≤100). В следующих n клетках
//задано описание шахматной доски — по n символов. Фишки обозначаются "K" и "G", а пустые клетки за ".".
//Начальная клетка обозначается "S", а конечная — "F".
//Гарантируется, что на начальной и конечной клетках нет фишки.
//
//Формат выходных данных
//Выведите единственное число — необходимое количество ходов. Если такого пути не существует, то выведите −1.
//
//Замечание
//Как и всегда, конь ходит буквой Г, т.е. на одну клетку в одну сторону и две клетки в другую, всего до 8 возможных ходов.
//Король может перейти из текущей клетки в соседнюю по стороне или углу, всего до 8 возможных ходов.
//
//Примеры данных
//Пример 1
//3
//S..
//F..
//...
//
//3
//Пример 2
//2
//SF
//..
//
//-1
//Пример 3
//4
//S..K
//..G.
//.GK.
//.K.F
//
//3
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main6 {
    static class State {
        int x, y, type;

        State(int x, int y, int type) {
            this.x = x;
            this.y = y;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        char[][] board = new char[n][n];
        int[][][] dist = new int[n][n][2];

        int[] dx = {1, 2, 2, 1, -1, -2, -2, -1, 1, 0, -1, 0, 1, -1, 0, 1};
        int[] dy = {2, 1, -1, -2, -2, -1, 1, 2, 1, 1, 0, -1, -1, 0, 1, 1};
        char[] types = {'K', 'G'};

        int xStart = -1, yStart = -1, xFinish = -1, yFinish = -1;

        for (int i = 0; i < n; i++) {
            String line = scanner.next();
            for (int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'S') {
                    xStart = i;
                    yStart = j;
                } else if (board[i][j] == 'F') {
                    xFinish = i;
                    yFinish = j;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j][0] = dist[i][j][1] = -1; // Initialize all distances to -1
            }
        }

        Queue<State> queue = new LinkedList<>();
        queue.add(new State(xStart, yStart, 0)); // 0 represents the type of figure, 0 for king, 1 for knight
        dist[xStart][yStart][0] = 0;

        while (!queue.isEmpty()) {
            State current = queue.poll();
            int x = current.x;
            int y = current.y;

            for (int k = 0; k < 2; k++) {
                int typeNext = (k == 0) ? 1 : 0; // Swap the type of figure
                if (board[x][y] == types[k]) { // If the cell has the figure type, change the type of the figure
                    typeNext = k;
                }

                for (int i = 0; i < 16; i++) {
                    int nextX = x + dx[i];
                    int nextY = y + dy[i];

                    if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && board[nextX][nextY] != 'K' && board[nextX][nextY] != 'G') {
                        if (dist[nextX][nextY][typeNext] == -1) { // If the cell is not yet visited
                            dist[nextX][nextY][typeNext] = dist[x][y][current.type] + 1;
                            queue.add(new State(nextX, nextY, typeNext));
                        }
                    }
                }
            }
        }

        if (dist[xFinish][yFinish][0] == -1 && dist[xFinish][yFinish][1] == -1) {
            System.out.println("-1"); // If it is not possible to reach the finish cell
        } else {
            System.out.println(Math.max((dist[xFinish][yFinish][0] == -1) ? Integer.MAX_VALUE : dist[xFinish][yFinish][0], (dist[xFinish][yFinish][1] == -1) ? Integer.MAX_VALUE : dist[xFinish][yFinish][1]));
        }
    }
}
