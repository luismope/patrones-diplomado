package org.example.problemauno;

import org.example.problemauno.commands.Command;

import java.util.*;

public class Invoker {

    private List<Task> tasks = new ArrayList<>();
    private Deque<Command> commandHistory = new ArrayDeque<>();


    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
        }
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
}
