import duck.Duck;
import adaptee.Turkey;
import adaptee.WildTurkey;

public class Main {
    public static void main(String[] args) {
        Turkey wild = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wild);

        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
