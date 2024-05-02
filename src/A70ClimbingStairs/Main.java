package A70ClimbingStairs;
//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//Вы поднимаетесь по лестнице. Чтобы достичь вершины, нужно n шагов.
//Каждый раз вы можете подняться на 1 или 2 ступеньки. Сколькими различными способами вы можете подняться на вершину?
//
//Example 1:
//
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//Example 2:
//
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
//
public class Main {
    public static void main(String[] args) {
        int n1 = 2;
        System.out.println(climbStairs(n1));
        int n2 = 3;
        System.out.println(climbStairs(n2));
    }

    public static int climbStairs(int n) {
        if (n == 1 || n == 2) return n;
        int[] array = new int[n + 1];

        array[1] = 1;
        array[2] = 2;

        for (int i = 3; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];

    }
}
