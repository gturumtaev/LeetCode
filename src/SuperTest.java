import java.util.Arrays;

public class SuperTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(a));
        a = new int[a.length + 1];
        System.out.println(Arrays.toString(a));
        a[0] = 1;
        System.out.println(Arrays.toString(a));

    }
}
