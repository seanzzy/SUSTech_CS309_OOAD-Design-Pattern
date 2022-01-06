import command.Command;
import java.util.Optional;
import java.util.Stack;

public class CommandHistory {
    Stack<Command> history = new Stack<>();

    void push(Command c) {
        history.add(c);
    }

    Optional<Command> pop() {
        Command c = null;
        if (!history.isEmpty()) {
            c = history.pop();
        }
        return Optional.ofNullable(c);
    }
}
