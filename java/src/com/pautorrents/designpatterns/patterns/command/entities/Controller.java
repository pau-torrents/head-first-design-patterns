package com.pautorrents.designpatterns.patterns.command.entities;

import com.pautorrents.designpatterns.patterns.command.commands.ICommand;

import java.util.Stack;

public class Controller {

    private ICommand firstButtonCommand;
    private ICommand secondButtonCommand;
    private ICommand thirdButtonCommand;
    private ICommand fourthButtonCommand;

    private Stack<ICommand> commandExecutionHistory;

    public Controller(ICommand firstButtonCommand,
                      ICommand secondButtonCommand,
                      ICommand thirdButtonCommand,
                      ICommand fourthButtonCommand
    ) {
        this.firstButtonCommand = firstButtonCommand;
        this.secondButtonCommand = secondButtonCommand;
        this.thirdButtonCommand = thirdButtonCommand;
        this.fourthButtonCommand = fourthButtonCommand;

        this.commandExecutionHistory = new Stack<>();
    }

    public void pressFirstButton() {
        this.firstButtonCommand.execute();
        this.commandExecutionHistory.push(this.firstButtonCommand);
    }

    public void pressSecondButton() {
        this.secondButtonCommand.execute();
        this.commandExecutionHistory.push(this.secondButtonCommand);
    }

    public void pressThirdButton() {
        this.thirdButtonCommand.execute();
        this.commandExecutionHistory.push(this.thirdButtonCommand);
    }

    public void pressFourthButton() {
        this.fourthButtonCommand.execute();
        this.commandExecutionHistory.push(this.fourthButtonCommand);
    }

    public void pressUndoButton() {
        if(!this.commandExecutionHistory.empty()) {
            ICommand command = this.commandExecutionHistory.pop();
            command.unexecute();
        }
    }
}