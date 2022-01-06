package ops;

public abstract class AbstractClass {
    abstract void op1();

    abstract void op2();

    protected final void doSth() {
        System.out.println("Do something");
    }

    public final void templateMethod() {
        doSth();
        op1();
        op2();
    }
}
