import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car  = new Car("ВАЗ", "Жигули-2101", 1970);
        motorcycle = new Motorcycle("Jawa", "Jawa-250", 1970);
    }

    @Test
    public void testIsCarAVehicle() {
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    public void testHasCarFourWheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testHasMotorcycleTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testIsCarSpeed60() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testIsMotorcycleSpeed75() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testIsCarSpeed0() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testIsMotorcycleSpeed0() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}