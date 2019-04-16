package com.pautorrents.designpatterns.patterns.strategy.display;

public class SwanDisplayingBehaviour implements IDisplayBehaviour {
    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();

    sb.append("      _ __/\\"); sb.append("\n");
    sb.append("  /\\_\\      \\"); sb.append("\n");
    sb.append(" |           \\"); sb.append("\n");
    sb.append(" |             \\           ___"); sb.append("\n");
    sb.append("  \\             \\        /  _ \\"); sb.append("\n");
    sb.append(" _|              \\      {  ( \\^)"); sb.append("\n");
    sb.append(" \\                \\     \\  \\  \\|"); sb.append("\n");
    sb.append("  \\                \\     \\  \\"); sb.append("\n");
    sb.append("  --                \\ ____)  \\"); sb.append("\n");
    sb.append(" \\                            \\"); sb.append("\n");
    sb.append("  |                           )"); sb.append("\n");
    sb.append("___\\_________________________/____________"); sb.append("\n");
    sb.append("   ..........................             ~~~~"); sb.append("\n");
    sb.append("  ............................"); sb.append("\n");
    sb.append("  ............................."); sb.append("\n");
    sb.append(" ..............................."); sb.append("\n");
    sb.append("..............................."); sb.append("\n");
    sb.append(".............................."); sb.append("\n");

        System.out.println(sb.toString());
    }
}
