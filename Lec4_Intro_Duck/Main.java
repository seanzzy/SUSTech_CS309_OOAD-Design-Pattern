import duck.Duck;
import duck.MallardDuck;
import duck.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        Duck rubber = new RubberDuck();
        rubber.performQuack();
        rubber.performFly();
        rubber.display();
    }
}
