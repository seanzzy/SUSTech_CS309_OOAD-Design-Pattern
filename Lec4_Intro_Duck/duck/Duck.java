package duck;

import fly.FlyBehavior;
import quack.QuackBehavior;

public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    void swim(){}
    public void display(){}

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
