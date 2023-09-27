package task5;

public class MyTest {
    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 3 : "Текст объясняющий ошибку, например Должно быть 2 дня";
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }
    public static void main(String[] args) {
        assertConditionA();
    }
}
