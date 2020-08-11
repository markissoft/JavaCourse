package MyCalculator;

import second.Numerable;

public class MyCalculator implements Numerable {

    @Override
    public int divide(int i1, int i2) {
        return i1 / i2;
    }

    @Override
    public int minus(int i1, int i2) {
        return i1 - i2;
    }

    @Override
    public int multiply(int i1, int i2) {
        return i1 * i2;
    }

    @Override
    public int plus(int i1, int i2) {
        return i1 + i2;
    }
}
