public class FlyWeightFactory {
    private FlyWeight[] cache = new FlyWeight[100];

    public FlyWeight getFlyWeight(int state) {
        if (cache[state] == null) {
            cache[state] = new FlyWeight(state);
        }
        return cache[state];
    }
}
