package model;

import java.util.stream.LongStream;

public class FactorialStrategy implements Strategy{
    @Override
    public String execute(int n) {
        long factorial = LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
        return Long.toString(factorial);
    }
}
