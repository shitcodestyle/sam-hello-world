package model;

public class FibonacciStrategy implements Strategy{
    @Override
    public String execute(int n) {
        if(n == 0 || n == 1) {
            return Integer.toString(n);
        }
        int n0 = 0, n1 = 1;
        int tempNthTerm;
        for (int i = 2; i <= n; i++) {
            tempNthTerm = n0 + n1;
            n0 = n1;
            n1 = tempNthTerm;
        }
        return Integer.toString(n1);
    }
}
