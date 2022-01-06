package product;

public abstract class Table {
    abstract boolean isFlat();
    public void display() {
        System.out.println("I am a " + getClass().getName() + ", I am " + (isFlat() ? "" : "not ") + "flat.");
    }
}
