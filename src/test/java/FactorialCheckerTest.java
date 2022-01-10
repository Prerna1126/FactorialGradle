import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FactorialCheckerTest {
    @Test
    void factorialZero() {
        FactorialChecker factorialChecker = new FactorialChecker(0);
        int actual = factorialChecker.check();
        int expected=1;

        assertEquals(expected,actual);
    }

    @Test
    void factorialOne() {
        FactorialChecker factorialChecker = new FactorialChecker(1);
        int actual=factorialChecker.check();
        int expected=1;

        assertEquals(expected,actual);

    }

    @Test
    void factorialTwo() {
        FactorialChecker factorialChecker = new FactorialChecker(2);
        int actual=factorialChecker.check();
        int expected=2;

        assertEquals(expected,actual);
    }

    @Test
    void factorialSix() {
        FactorialChecker factorialChecker = new FactorialChecker(6);
        int expected=720;
        int actual=factorialChecker.check();

        assertEquals(expected,actual);

    }
}
