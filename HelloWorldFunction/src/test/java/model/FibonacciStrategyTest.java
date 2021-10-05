package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FibonacciStrategyTest {

    private FibonacciStrategy fibonacci;

    @BeforeEach
    public void setup() {
        this.fibonacci = new FibonacciStrategy();
    }

    @Test
    public void execute_TenthMember_ShouldBeFiftyFive() {
        assertEquals(55, Integer.parseInt(fibonacci.execute(10)));
    }

    @Test
    public void execute_FourthMember_ShouldBeThree() {
        assertEquals(3, Integer.parseInt(fibonacci.execute(4)));
    }

    @Test
    public void execute_FifteenthMember_ShouldBeSixHundredsTen() {
        assertEquals(610, Integer.parseInt(fibonacci.execute(15)));
    }

    @Test
    public void execute_ZerothMember_ShouldBeZero() {
        assertEquals(0, Integer.parseInt(fibonacci.execute(0)));
    }

    @Test
    public void execute_FirstMember_ShouldBeOne() {
        assertEquals(1, Integer.parseInt(fibonacci.execute(2)));
    }
}
