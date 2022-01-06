package command;

public class PasteCommand implements Command{
    @Override
    public void execute() {
        System.out.println("I am paste command");
    }

    @Override
    public void undo() {
        System.out.println("undo paste command");
    }
}
