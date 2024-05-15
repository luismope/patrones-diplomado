package org.example.Problema1.commands;

import org.example.Problema1.Invoker;
import org.example.Problema1.Task;

public class DeleteCommand implements Command {

    private final Task task;
    private final Invoker invoker;

    public DeleteCommand(Task task, Invoker invoker) {
        this.task = task;
        this.invoker = invoker;
    }

    @Override
    public void execute() {
        System.out.println("¡Delete Task!");
        invoker.addTask(task);
    }

    @Override
    public void undo() {
        System.out.println("¡Remove Delete Task!");
        invoker.removeTask(task);
    }
}
