package command;

import java.util.*;

public class Move {
    private final HashMap<String, Command> commands = new HashMap<>();
    private final List<Command> undoCommands = new LinkedList<>();

    public void register(String commandName, Command command){
        commands.put(commandName, command);
    }

    public void execute(String commandName){
        Command command = commands.get(commandName);
        command.execute();
        undoCommands.add(command);
    }

    public void undo(){
        if (undoCommands.size() > 0){
            undoCommands.remove(undoCommands.size() - 1).undo();
        }
    }
}
