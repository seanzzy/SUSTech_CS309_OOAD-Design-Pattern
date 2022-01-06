package command;

public class CutCommand implements Command{
    @Override
    public void execute() {
        System.out.println("I am cut command");
    }

    @Override
    public void undo() {
        System.out.println("undo cut command");
    }
}
