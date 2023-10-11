package Seminar5.CW;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    @DisplayName("Тесты метода на количество элементов в списке и на размер элементов")
    @Test
    void testGetRandomNumbers() {
        // проверка на правильное количество чисел
        RandomNumberGenerator generator = new RandomNumberGenerator();
        List<Integer> randomNumbers = generator.getRandomNumbers(5);
        assertEquals(5, randomNumbers.size());
        // проверка на диапазон чисел
        for (int num : randomNumbers){
            assertTrue(num >=1 && num <= 100);
        }
    }
}