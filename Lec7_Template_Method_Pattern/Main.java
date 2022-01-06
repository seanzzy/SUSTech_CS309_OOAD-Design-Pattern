import ops.AbstractClass;
import ops.ConcreteClassA;
import ops.ConcreteClassB;

public class Main {
    public static void main(String[] args) {
        AbstractClass op;

        op = new ConcreteClassA();
        op.templateMethod();

        op = new ConcreteClassB();
        op.templateMethod();
    }
}
