package org.example.Problema1.commands;

import org.example.Problema1.Invoker;
import org.example.Problema1.Task;

public class CompleteCommand implements Command {

    private final Task task;
    private final Invoker invoker;

    public CompleteCommand(Task task, Invoker invoker) {
        this.task = task;
        this.invoker = invoker;
    }


    @Override
    public void execute() {
        System.out.println("¡Complete Task!");
        invoker.addTask(task);
    }

    @Override
    public void undo() {
        System.out.println("¡Remove Complete Task!");
        invoker.removeTask(task);
    }
}
