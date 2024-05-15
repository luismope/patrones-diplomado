package org.example.Problema1;

import org.example.Problema1.commands.*;

public class Main {
    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Task task1 = new Task("task1");

        Command createTaskCommand = new CreateCommand(task1, invoker);
        invoker.executeCommand(createTaskCommand);

        Command editTaskCommand = new EditCommand(task1, invoker);
        invoker.executeCommand(editTaskCommand);

        Command completeTaskCommand = new CompleteCommand(task1, invoker);
        invoker.executeCommand(completeTaskCommand);

        Command deleteTaskCommand = new DeleteCommand(task1, invoker);
        invoker.executeCommand(deleteTaskCommand);


        invoker.undoLastCommand();

        invoker.undoLastCommand();

        invoker.undoLastCommand();

        invoker.undoLastCommand();



    }
}