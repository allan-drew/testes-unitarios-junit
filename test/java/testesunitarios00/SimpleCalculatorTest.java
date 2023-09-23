package testesunitarios00;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwo_ShouldEqualsFour() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int result = simpleCalculator.addTwoNumbers(2, 2);
        assertEquals(4, result);
    }

    @Test
    void twoPlusFour_ShouldEqualsSix() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int result = simpleCalculator.addTwoNumbers(2, 4);
        assertEquals(6, result);
    }


}

