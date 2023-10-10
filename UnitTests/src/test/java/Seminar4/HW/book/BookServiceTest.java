package Seminar4.HW.book;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BookServiceTest {

    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        // Создание мок-объекта для BookRepository
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @DisplayName("Тест метода FindBookById")
    @Test
    public void testFindBookById() {
        // Задаем ожидаемый результат
        Book expectedBook = new Book("1", "Основы Java", "Джавист");
        when(bookRepository.findById("1")).thenReturn(expectedBook);

        // Вызываем метод и проверяем результат
        Book actualBook = bookService.findBookById("1");
        assertEquals(expectedBook, actualBook);

        // Проверяем, что метод findById был вызван с правильным аргументом (id = "1")
        verify(bookRepository).findById("1");
    }

    @DisplayName("Тест метода FindAllBooks")
    @Test
    public void testFindAllBooks() {
        // Задаем ожидаемый результат
        List<Book> expectedBooks = new ArrayList<>();
        expectedBooks.add(new Book("1", "Основы Java", "Джавист"));
        expectedBooks.add(new Book("2", "UNIT-тесты", "Л.Бадеев"));
        when(bookRepository.findAll()).thenReturn(expectedBooks);

        // Вызываем метод и проверяем результат
        List<Book> actualBooks = bookService.findAllBooks();
        assertEquals(expectedBooks, actualBooks);

        // Проверяем, что метод findAll был вызван
        verify(bookRepository).findAll();
    }
}