package model;

public class Context {

    private Strategy strategy;

    public String execute(int a) {
        return strategy.execute(a);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
