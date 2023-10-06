package Seminar3.CW.view;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorViewTest {
    private static CalculatorView view;

    @BeforeAll
    public static void createView() {
        view = new CalculatorView();
    }


    @DisplayName("Проверка вывода меню на экран")
    @Test
    void printMenu() {
        // Проверяем, что метод printMenu() выводит текст меню
// Создаем объект ByteArrayOutputStream, чтобы перехватить вывод
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printMenu(); // сам вывод, который перехватываем

// Проверяем, что вывод соответствует ожидаемому тексту меню
        assertEquals("Выберите операцию:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление\n5. Выход\n", outContent.toString());

// Восстанавливаем стандартный поток вывода
        System.setOut(System.out);
    }

    @DisplayName("Проверка вывода результата на экран")
    @Test
    void printResult() {
        String expectedMessage = "Результат: 10\r\n";
        // Создаем объект ByteArrayOutputStream, чтобы перехватить вывод
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printResult(10); // сам вывод, который перехватываем

// Проверяем, что вывод соответствует ожидаемому тексту меню
        assertEquals(expectedMessage, outContent.toString());

// Восстанавливаем стандартный поток вывода
        System.setOut(System.out);
    }

    @DisplayName("Проверка ввода с клавиатуры")
    @Test
    void getInput() {
//        String expectedNum = "9"; // Значение для тестов
        ByteArrayInputStream in = new
                ByteArrayInputStream("42\n".getBytes());
//        InputStream inputStream = System.in; // Сохраняем ссылку на ввод с клавиатуры
        System.setIn(in); // Подменяем ввод
//        String actualNum = String.valueOf(view.getInput()); // Вызываем метод
//        System.out.println(testedValue); // Для наглядности вывода
        assertEquals(42,view.getInput(), "метод не работает");
        System.setIn(System.in); // Подменяем обратно
    }

    @DisplayName("Проверка вывода сообщения об ошибке")
    @Test
    void printErrorMessage() {
        String expectedMessage = "Ошибка\r\n";
        // Создаем объект ByteArrayOutputStream, чтобы перехватить вывод
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printErrorMessage("Ошибка"); // сам вывод, который перехватываем

// Проверяем, что вывод соответствует ожидаемому тексту меню
        assertEquals(expectedMessage, outContent.toString());

// Восстанавливаем стандартный поток вывода
        System.setOut(System.out);
    }
}