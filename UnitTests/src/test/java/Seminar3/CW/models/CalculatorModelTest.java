package Seminar3.CW.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorModelTest {
    private static CalculatorModel calculator;
    @BeforeAll
    public static void createCalculator() {
        calculator = new CalculatorModel(); //создали модель калькулятора
    }

    @DisplayName("Проверка работы геттера для первого числа")
    @Test
    void getFirstNumber() {
        int expectedNum = 3; //создаем ожидаемую переменную
        calculator.setFirstNumber(expectedNum); //присваиваем значение через сеттер модели
        int actualNum = calculator.getFirstNumber(); //присваиваем переменной значение из проверяемого метода
        assertEquals(expectedNum, actualNum, "Метод getFirstNumber некорректен");
    }

    @DisplayName("Проверка работы сеттера для первого числа")
    @Test
    void setFirstNumber() {
        int expectedNum = 3; //создаем ожидаемую переменную
        calculator.setFirstNumber(expectedNum); //присваиваем значение через сеттер модели
        int actualNum = calculator.getFirstNumber(); //присваиваем переменной значение из проверяемого метода
        assertEquals(expectedNum, actualNum, "Метод setFirstNumber некорректен");
    }

    @DisplayName("Проверка работы геттера для второго числа")
    @Test
    void getSecondNumber() {
        int expectedNum = 3; //создаем ожидаемую переменную
        calculator.setSecondNumber(expectedNum); //присваиваем значение через сеттер модели
        int actualNum = calculator.getSecondNumber(); //присваиваем переменной значение из проверяемого метода
        assertEquals(expectedNum, actualNum, "Метод getSecondNumber некорректен");
    }

    @DisplayName("Проверка работы сеттера для второго числа")
    @Test
    void setSecondNumber() {
        int expectedNum = 3; //создаем ожидаемую переменную
        calculator.setSecondNumber(expectedNum); //присваиваем значение через сеттер модели
        int actualNum = calculator.getSecondNumber(); //присваиваем переменной значение из проверяемого метода
        assertEquals(expectedNum, actualNum, "Метод setSecondNumber некорректен");
    }

    @DisplayName("Проверка сложения двух чисел")
    @Test
    void add() {
        int expectedNum = 14;
        calculator.setFirstNumber(6);
        calculator.setSecondNumber(8);
        int actualNum = calculator.add();
        assertEquals(expectedNum, actualNum, "Метод add некорректен");
    }

    @DisplayName("Проверка вычитания двух чисел")
    @Test
    void subtract() {
        int expectedNum = 14;
        calculator.setFirstNumber(22);
        calculator.setSecondNumber(8);
        int actualNum = calculator.subtract();
        assertEquals(expectedNum, actualNum, "Метод subtract некорректен");
    }

    @DisplayName("Проверка умножения двух чисел")
    @Test
    void multiply() {
        int expectedNum = 14;
        calculator.setFirstNumber(2);
        calculator.setSecondNumber(7);
        int actualNum = calculator.multiply();
        assertEquals(expectedNum, actualNum, "Метод multiply некорректен");
    }

    @DisplayName("Проверка деления двух чисел")
    @Test
    void divide() {
        int expectedNum = 2;
        calculator.setFirstNumber(14);
        calculator.setSecondNumber(7);
        int actualNum = calculator.divide();
        assertEquals(expectedNum, actualNum, "Метод divide некорректен");
    }

    @DisplayName("Проверка деления на ноль")
    @Test
    public void DivideByZero() {
        String expectedExeption = "Деление на ноль недопустимо";
        calculator.setFirstNumber(14);
        calculator.setSecondNumber(0);
        Exception actualExeption = assertThrows(IllegalArgumentException.class, () -> calculator.divide());
        assertEquals(expectedExeption, actualExeption.getMessage(), "Метод DivideByZero некорректен");
    }

}