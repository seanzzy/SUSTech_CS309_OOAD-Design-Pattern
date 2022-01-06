package duck;

public class RubberDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
