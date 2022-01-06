import command.Command;

import java.util.Optional;

public class Invoker {
    private Command command;
    private CommandHistory history = new CommandHistory();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
        history.push(command);
    }

    public void undoCommand() {
        Optional<Command> command = history.pop();
        if (command.isPresent()) {
            command.get().undo();
        } else {
            System.out.println("No command to undo");
        }
    }

}
