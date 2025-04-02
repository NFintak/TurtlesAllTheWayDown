package turtlesAllTheWayDown;

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
}
