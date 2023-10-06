package Seminar3.HW.Task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntervalCheckerTest {

    @Test
    @DisplayName("Число внутри интервала")
    public void testNumberInsideInterval() {
        IntervalChecker intervalChecker = new IntervalChecker();

        // Проверяем числа, которые находятся внутри интервала (25;100)
        assertTrue(intervalChecker.numberInInterval(50)); // Ожидаемое значение: true
        assertTrue(intervalChecker.numberInInterval(75)); // Ожидаемое значение: true
    }

    @Test
    @DisplayName("Число вне интервала")
    public void testNumberOutsideInterval() {
        IntervalChecker intervalChecker = new IntervalChecker();

        // Проверяем числа, которые находятся вне интервала (25;100)
        assertFalse(intervalChecker.numberInInterval(10)); // Ожидаемое значение: false
        assertFalse(intervalChecker.numberInInterval(110)); // Ожидаемое значение: false
    }

    @Test
    @DisplayName("Число на границе интервала")
    public void testNumberOnIntervalBoundary() {
        IntervalChecker intervalChecker = new IntervalChecker();

        // Проверяем числа, которые находятся на границе интервала (25;100)
        assertFalse(intervalChecker.numberInInterval(25)); // Ожидаемое значение: false
        assertFalse(intervalChecker.numberInInterval(100)); // Ожидаемое значение: false
    }
}