package Seminar4.CW.task1;

import Seminar4.CW.task1.Customer;
import Seminar4.CW.task1.OrderProcessor;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyZeroInteractions;

public class OrderProcessorTest {
    @Test
    void testProcessOrderWithDummy() {
// Создаем фиктивный объект Customer
        Customer dummyCustomer = mock(Customer.class);

// Создаем экземпляр OrderProcessor
        OrderProcessor orderProcessor = new OrderProcessor();

// Вызываем метод processOrder с фиктивным объектом Customer
        orderProcessor.processOrder(dummyCustomer);

// Проверяем, что с фиктивным объектом Customer не было взаимодействий
        verifyZeroInteractions(dummyCustomer);
    }
}