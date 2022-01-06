public class Context {
    private int uniqueState;
    private FlyWeight flyWeight;
    private FlyWeightFactory factory = new FlyWeightFactory();

    public Context(int repeatingState, int uniqueState) {
        this.uniqueState = uniqueState;
        this.flyWeight = factory.getFlyWeight(repeatingState);
    }

    public void op() {
        flyWeight.operation(uniqueState);
    }
}
