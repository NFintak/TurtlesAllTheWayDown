package turtlesAllTheWayDown;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    public Turtles() {
    }

    public int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public int gcd(int x, int y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

    public int gcd2(int x, int y) {
        if (x == 0) return y;
        if (y == 0) return x;
        if (x % 2 == 0 && y % 2 == 0) {
            return 2 * gcd2(x/2, y/2);
        }
        if (x % 2 == 0 && y % 2 == 1) {
            return gcd2(x/2, y);
        }
        if (x % 2 == 1 && y % 2 == 0) {
            return gcd2(x, y/2);
        }
        if (x % 2 == 1 && y % 2 == 1 && x >= y) {
            return gcd2((x - y)/2, y);
        }
        if (x % 2 == 1 && y % 2 == 1 && x < y) {
            return gcd2(x, (y - x)/2);
        }
        return -1;
    }

    public void gcdDuration() {
        Instant start = Instant.now();
        gcd(2854, 1572);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        System.out.println(timeElapsed);
    }

    public void gcd2Duration() {
        Instant start = Instant.now();
        gcd2(2854, 1572);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(timeElapsed);
    }

}
