package Calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCalculateDiscount() {
        Calculator calc = new Calculator();

        assertThat(calc.calculateDiscount(100, 20)).isEqualTo(80);
        assertThatThrownBy( () -> calc.calculateDiscount(100, -1)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy( () -> calc.calculateDiscount(100, 100)
        ).isInstanceOf(ArithmeticException.class);
    }
}