import strategy.Strategy;

public class Context {
    Strategy strategy;

    public Context(Strategy operation) {
        this.strategy = operation;
    }

    public int executeStrategy(int a, int b) {
        return strategy.doOperation(a,b);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}
