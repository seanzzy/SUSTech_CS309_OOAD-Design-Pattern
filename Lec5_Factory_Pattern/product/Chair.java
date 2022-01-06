package product;

public abstract class Chair {
    abstract boolean hasLegs();
    public void display() {
        System.out.println("I am a " + getClass().getName() + ", I have " + (hasLegs() ? "" : "no ") + "legs.");
    }
}
