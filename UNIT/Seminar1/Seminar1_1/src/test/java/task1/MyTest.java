package task1;

public class MyTest {
    public static void main(String[] args) {
        int x = -1;
        // проверяем, что х неотрицательно с использованием оператора assert
        assert x >= 0 : "x должно быть неотрицательным";
        System.out.println("Программа продолжает выполнение");
    }
}
