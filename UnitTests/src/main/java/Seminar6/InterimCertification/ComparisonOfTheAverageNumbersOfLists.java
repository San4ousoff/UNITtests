package Seminar6.InterimCertification;

import java.util.List;

public class ComparisonOfTheAverageNumbersOfLists {
    /**
     * Метод расчета среднего числа
     * @param list
     * @return значение типа double
     */
    public double calculateAverage(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не может быть пустым или равным null");
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

    /**
     * Метод сравнения средних чисел, расчитанных методом calculateAverage
     * @param list1
     * @param list2
     * @return сообщение с решением
     */
    public String compareLists(List<Integer> list1, List<Integer> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
