import factory.Factory;
import factory.ModernFactory;
import factory.VictorianFactory;
import product.Chair;
import product.Table;

public class Main {
    private static Factory factory;

    public static void main(String[] args) {
        factory = new ModernFactory();
        create();

        factory = new VictorianFactory();
        create();
    }

    private static void create() {
        Chair chair;
        Table table;
        chair = factory.createChair();
        table = factory.createTable();
        chair.display();
        table.display();
    }
}