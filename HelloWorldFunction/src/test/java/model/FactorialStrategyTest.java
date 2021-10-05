package model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialStrategyTest {

    private FactorialStrategy factorial;

    @BeforeEach
    public void setup() {
        this.factorial = new FactorialStrategy();
    }

    @Test
    public void execute_FiveGiven_ShouldBeOneHundredTwenty() {
        assertEquals(120, Integer.parseInt(factorial.execute(5)));
    }

    @Test
    public void execute_SixGiven_ShouldBeSevenHundredsTwenty() {
        assertEquals(720, Integer.parseInt(factorial.execute(6)));
    }

    @Test
    public void execute_FourGiven_ShouldBeTwentyFour() {
        assertEquals(24, Integer.parseInt(factorial.execute(4)));
    }

    @Test
    public void execute_SevenGiven_ShouldBeFiveThousandsForty() {
        assertEquals(5040, Integer.parseInt(factorial.execute(7)));
    }

}
