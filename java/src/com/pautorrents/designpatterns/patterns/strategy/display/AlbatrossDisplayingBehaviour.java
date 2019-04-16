package com.pautorrents.designpatterns.patterns.strategy.display;

public class AlbatrossDisplayingBehaviour implements IDisplayBehaviour {
    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();

        sb.append("                                                            ___"); sb.append("\n");
        sb.append("                                             ________.-----''"); sb.append("\n");
        sb.append("                                    ___.--'\"\"___.----''"); sb.append("\n");
        sb.append("                                 .-'    _.-'\""); sb.append("\n");
        sb.append("                      _ .-.__.--'    .-'"); sb.append("\n");
        sb.append("                    .' `  / ' __ _.-'"); sb.append("\n");
        sb.append("                    ) '  '   )   /`-._."); sb.append("\n");
        sb.append("                   (.'\\          )/))-)\\"); sb.append("\n");
        sb.append("                 .'    >.________.--'"); sb.append("\n");
        sb.append("              .-'   .-'"); sb.append("\n");
        sb.append("            .'    .'"); sb.append("\n");
        sb.append("         .-'   .-'"); sb.append("\n");
        sb.append("       .'    .'"); sb.append("\n");
        sb.append("      /    .'"); sb.append("\n");
        sb.append("    .'   .'"); sb.append("\n");
        sb.append("   /  ,,/"); sb.append("\n");
        sb.append("  /'''/"); sb.append("\n");
        sb.append(" / ,''"); sb.append("\n");
        sb.append("/''"); sb.append("\n");

        System.out.println(sb.toString());
    }
}
