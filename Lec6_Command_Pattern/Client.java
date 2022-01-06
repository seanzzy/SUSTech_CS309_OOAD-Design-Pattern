import command.Command;
import command.CopyCommand;
import command.PasteCommand;

public class Client {
    private static Invoker invoker = new Invoker();

    public static void main(String[] args) {
        Command copy = new CopyCommand();
        Command paste = new PasteCommand();

        invoker.undoCommand();

        invoker.setCommand(copy);
        invoker.executeCommand();

        invoker.setCommand(paste);
        invoker.executeCommand();

        invoker.undoCommand();

    }
}
