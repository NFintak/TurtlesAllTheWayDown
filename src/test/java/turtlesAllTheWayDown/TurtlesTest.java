package turtlesAllTheWayDown;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {
    Turtles test = new Turtles();

    @Test
    public void test1factorial() {
        int expected = 24;
        int actual = test.factorial(4);
        assertEquals(expected, actual);
    }

    @Test
    public void test2factorial() {
        int expected = 720;
        int actual = test.factorial(6);
        assertEquals(expected, actual);
    }

    @Test
    public void test3factorial() {
        int expected = 40320;
        int actual = test.factorial(8);
        assertEquals(expected, actual);
    }

    @Test
    public void test1gcd() {
        int expected = 24;
        int actual = test.gcd(1440, 408);
        assertEquals(expected, actual);
    }

    @Test
    public void test2gcd() {
        int expected = 2;
        int actual = test.gcd(2854, 1572);
        assertEquals(expected, actual);
    }

    @Test
    public void test3gcd() {
        int expected = 2;
        int actual = test.gcd(3840, 2482);
        assertEquals(expected, actual);
    }

    @Test
    public void test1lcs() {
        String expected = "GGCAACG";
        String actual = test.lcs("GGCACCACG", "ACGGCGGATACG");
        assertEquals(expected, actual);
    }

    @Test
    public void test2lcs() {
        String expected = "GCGCG";
        String actual = test.lcs("GCCCTAGCG", "GCGCAATG");
        assertEquals(expected, actual);
    }

    @Test
    public void test3lcs() {
        String expected = "beans";
        String actual = test.lcs("xlboiebapqrndls", "dbrqpemwaionxs");
        assertEquals(expected, actual);
    }

}