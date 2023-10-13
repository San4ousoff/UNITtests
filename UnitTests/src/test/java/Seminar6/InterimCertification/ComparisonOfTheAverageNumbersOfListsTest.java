package Seminar6.InterimCertification;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ComparisonOfTheAverageNumbersOfListsTest {

    private ComparisonOfTheAverageNumbersOfLists comparison;
    private List<Integer> list1;
    private List<Integer> list2;

    @BeforeEach
    public void setUp() {
        comparison = new ComparisonOfTheAverageNumbersOfLists();
        list1 = Arrays.asList(1, 2, 3, 4, 5);
        list2 = Arrays.asList(1, 2, 3);
    }

    @AfterEach
    public void tearDown() {
        comparison = null;
        list1 = null;
        list2 = null;
    }

    @Test
    @DisplayName("Тест для метода calculateAverage(): список не может быть null")
    public void testCalculateAverageNullList() {
        assertThrows(IllegalArgumentException.class, () -> comparison.calculateAverage(null));
    }

    @Test
    @DisplayName("Тест для метода calculateAverage(): расчет среднего числа")
    public void testCalculateAverage() {
        double result = comparison.calculateAverage(list1);
        assertEquals(3.0, result);
    }

    @Test
    @DisplayName("Тест для метода compareLists(): первый список имеет большее среднее значение")
    public void testCompareListsFirstGreaterThanSecond() {
        String result = comparison.compareLists(list1, list2);
        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    @DisplayName("Тест для метода compareLists(): второй список имеет большее среднее значение")
    public void testCompareListsSecondGreaterThanFirst() {
        String result = comparison.compareLists(list2, list1);
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    @DisplayName("Тест для метода compareLists(): средние значения равны")
    public void testCompareListsAverageEqual() {
        String result = comparison.compareLists(list1, list1);
        assertEquals("Средние значения равны", result);
    }
}
