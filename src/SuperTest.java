import java.util.Arrays;
import java.util.Stack;

public class SuperTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(1 + 2 + "3");
        a = new int[a.length + 1];
        System.out.println(Arrays.toString(a));
        a[0] = 1;
        System.out.println(Arrays.toString(a));
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());System.out.println(stack.pop());System.out.println(stack.pop());
        int[] array = new int[10];
        for (int i = 1; i < array.length; i++) {
            array[i] *= 2;
        }
        System.out.println(array[0]);
    }
}
