public class FlyWeight {
    private int state;

    public FlyWeight(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void operation(int uniqueState) {
        System.out.println("I'm in state " + state + ", param is " + uniqueState);
    }

}
