package task7;

public class MyTest {
    public static int sum(int a, int b) {
        long result = (long) a+b;
        assert result < Integer.MAX_VALUE : "Слишком большое число";
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, Integer.MAX_VALUE));
    }
}
