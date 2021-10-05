package model;

import java.util.stream.IntStream;

public class PrimeNumberStrategy implements Strategy{
    @Override
    public String execute(int n) {
        boolean isComposite = IntStream.range(1, (int) Math.sqrt(n)).anyMatch(i -> n % i == 0);
        return Boolean.toString(!isComposite);
    }
}
