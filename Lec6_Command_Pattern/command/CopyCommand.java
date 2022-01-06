package command;

public class CopyCommand implements Command{
    @Override
    public void execute() {
        System.out.println("I am copy command");
    }

    @Override
    public void undo() {
        System.out.println("undo copy command");
    }
}
