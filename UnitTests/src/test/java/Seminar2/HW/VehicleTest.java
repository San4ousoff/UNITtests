package Seminar2.HW;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Lada", "Priora", 2015);
        motorcycle = new Motorcycle("Ural", "CiTi", 2000);
    }

    /**
     * Проверка, что объект типа Car является экземпляром класса Vehicle.
     */
    @DisplayName("Car является экземпляром Vehicle")
    @Test
    void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    /**
     * Проверка, что объект типа Car создается с 4 колесами.
     */
    @DisplayName("Car создается с 4 колесами")
    @Test
    void testCarNumberOfWheels() {
        assertEquals(4, car.getNumWheels());
    }

    /**
     * Проверка, что объект типа Motorcycle создается с 2 колесами.
     */
    @DisplayName("Motorcycle создается с 2 колесами")
    @Test
    void testMotorcycleNumberOfWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    /**
     * Проверка, что объект типа Car достигает скорости 60 в режиме тестового вождения.
     */
    @DisplayName("Car достигает скорости 60 в режиме тестового вождения")
    @Test
    void testCarSpeedDuringTestDrive() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    /**
     * Проверка, что объект типа Motorcycle достигает скорости 75 в режиме тестового вождения.
     */
    @DisplayName("Motorcycle достигает скорости 75 в режиме тестового вождения")
    @Test
    void testMotorcycleSpeedDuringTestDrive() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    /**
     * Проверка, что объект типа Car останавливается при парковке (после режима тестового вождения).
     */
    @DisplayName("Car останавливается при парковке")
    @Test
    void testCarCanStopWhenParking() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    /**
     * Проверка, что объект типа Motorcycle останавливается при парковке (после режима тестового вождения).
     */
    @DisplayName("Motorcycle останавливается при парковке")
    @Test
    void testMotorcycleCanStopWhenParking() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}