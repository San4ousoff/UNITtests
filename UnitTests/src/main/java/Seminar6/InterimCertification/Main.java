package Seminar6.InterimCertification;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComparisonOfTheAverageNumbersOfLists comparator = new ComparisonOfTheAverageNumbersOfLists();

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        String comparisonResult = comparator.compareLists(list1, list2);
        System.out.println(comparisonResult);
    }
}
