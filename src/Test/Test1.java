package Test;

public class Test1 {
    public static void main(String[] args) {
        aaa(false);
    }

    public static void aaa(boolean bu) {
        while (bu) {
            System.out.println("bu = " + bu);
            bu = false;
        }
    }
}
