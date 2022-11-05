package com.animalSay.dto;

import com.animalSay.utils.DialogUtils;

public class Pikachu extends Animal {

    private static final String IMAGE = "   \\ \n"
            + "    \\ \n"
            + "      `;-.          ___, \n"
            + "        `.`\\_...._/`.-\"` \n"
            +"          \\        /      , \n"
            +"          /()   () \\    .' `-._ \n"
            +"         |)  .    ()\\  /   _.' \n"
            +"         \\  -'-     ,; '. < \n"
            +"          ;.__     ,;|   > \\ \n"
            +"         / ,    / ,  |.-'.-' \n"
            +"        (_/    (_/ ,;|.<` \n"
            +"          \\    ,     ;-` \n"
            +"           >   \\    / \n"
            +"          (_,-'`> .' \n"
            +"               (_,'' \n";

    public Pikachu(String phrase) {
        super(phrase);
    }

    public String say() {
        return DialogUtils.createDialog(getPhrase()) + " \n"
                + IMAGE + "\n";
    }
}
