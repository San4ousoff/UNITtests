package Seminar3.HW.Task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddNumberTest {

    @Test
    @DisplayName("Тест для проверки четного числа")
    public void testEvenNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();

        // Проверяем четные числа
        assertTrue(evenOddNumber.evenOddNumber(2)); // Ожидаемое значение: true
        assertTrue(evenOddNumber.evenOddNumber(50)); // Ожидаемое значение: true
        assertTrue(evenOddNumber.evenOddNumber(-10)); // Ожидаемое значение: true
    }

    @Test
    @DisplayName("Тест для проверки нечетного числа")
    public void testOddNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();

        // Проверяем нечетные числа
        assertFalse(evenOddNumber.evenOddNumber(3)); // Ожидаемое значение: false
        assertFalse(evenOddNumber.evenOddNumber(777)); // Ожидаемое значение: false
        assertFalse(evenOddNumber.evenOddNumber(-101)); // Ожидаемое значение: false
    }

    @Test
    @DisplayName("Тест для проверки числа 0")
    public void testZero() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();

        // Проверяем число 0
        assertTrue(evenOddNumber.evenOddNumber(0)); // Ожидаемое значение: true
    }
}