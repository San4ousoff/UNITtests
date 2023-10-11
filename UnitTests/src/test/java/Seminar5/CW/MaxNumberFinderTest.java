package Seminar5.CW;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MaxNumberFinderTest {

    @DisplayName("Тесты метода на пустой список и на нахождение макс. числа")
    @Test
    void testFindMaxNumber() {
        MaxNumberFinder finder = new MaxNumberFinder();

// Проверка на пустой список
        assertNull(finder.findMaxNumber(Collections.emptyList()));

// Проверка на нахождение максимального числа
        List<Integer> numbers = Arrays.asList(5, 10, 2, 8, 15);
        assertEquals(15, finder.findMaxNumber(numbers));
    }
}