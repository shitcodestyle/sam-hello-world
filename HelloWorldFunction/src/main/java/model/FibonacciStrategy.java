package model;

public class FibonacciStrategy implements Strategy{

    @Override
    public String execute(int member) {
        calculateFibonacciMember(member);
        return Integer.toString(calculateFibonacciMember(member));
    }

    private int calculateFibonacciMember(int member) {
        return (member == 1 || member == 0) ? member : calculateFibonacciMember(member - 1) + calculateFibonacciMember(member - 2);
    }
}
