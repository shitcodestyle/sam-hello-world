package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PrimeNumberStrategyTest {

    private PrimeNumberStrategy prime;

    @BeforeEach
    public void setup() {
        this.prime = new PrimeNumberStrategy();
    }

    @Test
    public void execute_Ten_ShouldNotBePrime() {
        assertFalse(Boolean.valueOf(prime.execute(10)));
    }

    @Test
    public void execute_Eight_ShouldNotBePrime() {
        assertFalse(Boolean.valueOf(prime.execute(8)));
    }

    @Test
    public void execute_One_ShouldNotBePrime() {
        assertFalse(Boolean.valueOf(prime.execute(1)));
    }

}
