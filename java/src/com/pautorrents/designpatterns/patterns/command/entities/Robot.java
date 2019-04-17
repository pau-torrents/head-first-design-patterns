package com.pautorrents.designpatterns.patterns.command.entities;

import com.pautorrents.designpatterns.helpers.OutputWriter;
import com.pautorrents.designpatterns.patterns.command.enums.MovementDirection;

public class Robot {

    private OutputWriter outputWriter = new OutputWriter();

    private boolean lightsOn = false;
    private int position = 0;

    public void turnLightsOn() {
        this.lightsOn = true;
    }

    public void turnLightsOff() {
        this.lightsOn = false;
    }

    public void move(MovementDirection direction) {
        int movementVariation = 0;
        switch(direction) {
            case Forward:
                movementVariation = 1;
                break;
            case Backward:
                movementVariation = -1;
                break;
        }

        this.position += movementVariation;
    }

    public void render() {
        StringBuilder sb = new StringBuilder();


        appendLine(sb, "                      ___..............._");
        appendLine(sb, "             __.. ' _'.\"\"\"\"\"\"\\\\\"\"\"\"\"\"\"\"- .`-._");
        appendLine(sb, " ______.-'         (_) |      \\\\           ` \\\\`-. _");
        appendLine(sb, "/_       --------------'-------\\\\---....______\\\\__`.`  -..___");
        appendLine(sb, "| T      _.----._           Xxx|x...           |          _.._`--. _");
        appendLine(sb, "| |    .' ..--.. `.         XXX|XXXXXXXXXxx==  |       .'.---..`.     -._");
        appendLine(sb, "\\_j   /  /  __  \\  \\        XXX|XXXXXXXXXXX==  |      / /  __  \\ \\        `-.");
        appendLine(sb, " _|  |  |  /  \\  |  |       XXX|\"\"'            |     / |  /  \\  | |          |" + this.getLights());
        appendLine(sb, "|__\\_j  |  \\__/  |  L__________|_______________|_____j |  \\__/  | L__________J");
        appendLine(sb, "     `'\\ \\      / ./__________________________________\\ \\      / /___________\\");
        appendLine(sb, "        `.`----'.'                                     `.`----'.'");
        appendLine(sb, "          `\"\"\"\"'                                         `\"\"\"\"'");

        this.outputWriter.printLn(sb.toString());
    }

    private void appendLine(StringBuilder sb, String s) {
        sb.append(this.getOpeningSpaces());sb.append(s);sb.append("\n");
    }

    private String getOpeningSpaces() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < this.position; i++) {
            sb.append("       ");
        }

        return sb.toString();
    }
    private String getLights() {
        if (this.lightsOn) {
            return "- - - - - - - - - - - - - - -";
        }

        return "";
    }
}
