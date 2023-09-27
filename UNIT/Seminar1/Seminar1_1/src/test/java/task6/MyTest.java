package task6;

public class MyTest {
    public static void assertConditionB() {
        int x = 1;
        assert x >= 0 : "х должен быть больше или равен 0";
    }

    public static void main(String[] args) {
        assertConditionB();
    }
}
