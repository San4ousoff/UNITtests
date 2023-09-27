package Seminar1.HW.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Задача: проверить метод CalculateDiscount с использованием библиотеки AssertJ
public class CalculatorTest {

    @Test
    public void сalculateDiscountShouldBeCorrect() {
        double purchaseAmount = 100.0;
        int discountPercentage = 10;
        double discountedPrice = 90.0;
        double discountedPriceTest = Calculator.calculateDiscount(purchaseAmount, discountPercentage);
        assertEquals(discountedPrice, discountedPriceTest, "Неверный расчет цены с дисконтом");
    }

}