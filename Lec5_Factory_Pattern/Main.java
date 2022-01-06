import factory.ChairFactory;
import factory.ModernChairFactory;
import factory.VictorianChairFactory;
import product.Chair;

public class Main {
    private static ChairFactory factory;

    public static void main(String[] args) {
        Chair chair;
        factory = new ModernChairFactory();
        chair = factory.createChair();
        chair.display();

        factory = new VictorianChairFactory();
        chair = factory.createChair();
        chair.display();

    }
}