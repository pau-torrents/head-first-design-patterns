package com.pautorrents.designpatterns.patterns.strategy.display;

public class FlamingoDisplayingBehaviour implements IDisplayBehaviour {
    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();

        sb.append("                     __"); sb.append("\n");
        sb.append("`       `          .^o ~\\  `        `   `                `"); sb.append("\n");
        sb.append("         ``  `    Y /'~) }      _____          `        `` `"); sb.append("\n");
        sb.append("          `       l/  / /    ,-~     ~~--.,_    `         `    ``"); sb.append("\n");
        sb.append("     `           `   ( (    /  ~-._         ^."); sb.append("\n");
        sb.append("     ``      `        \\ \"--'--.    \"-._       \\       `    `"); sb.append("\n");
        sb.append("       `           `   \"-.________     ~--.,__ ^.             `"); sb.append("\n");
        sb.append("               `    `            \\\"~r-.,___.-'-. ^."); sb.append("\n");
        sb.append("      `    `                 `    YI    \\\\      ~-.\\     `      `"); sb.append("\n");
        sb.append("            `             `       ||     \\\\        `\\"); sb.append("\n");
        sb.append("        `                  `      ||     //"); sb.append("\n");
        sb.append("  `           `                   ||    //"); sb.append("\n");
        sb.append("   `           `          `       ()   //"); sb.append("\n");
        sb.append("                `          `      ||  //     `   `"); sb.append("\n");
        sb.append("           `                      || ( c      `"); sb.append("\n");
        sb.append("            `        ___._ __  ___I|__`--__._ __  _"); sb.append("\n");
        sb.append("                   \"~     ~  \"~  \"\"   ~~\"    ~  ~~"); sb.append("\n");

        System.out.println(sb.toString());
    }
}
