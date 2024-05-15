package org.example.problema1.commands;

import org.example.problema1.Invoker;
import org.example.problema1.Task;

public class EditCommand implements Command {

    private final Task task;
    private final Invoker invoker;

    public EditCommand(Task task, Invoker invoker) {
        this.task = task;
        this.invoker = invoker;
    }

    @Override
    public void execute() {
        System.out.println("¡Edit Task!");
        invoker.addTask(task);
    }

    @Override
    public void undo() {
        System.out.println("¡Remove Edit Task!");
        invoker.removeTask(task);
    }
}
