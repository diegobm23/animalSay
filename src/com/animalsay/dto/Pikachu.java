package com.animalsay.dto;

import com.animalsay.interfaces.AnimalInterface;
import com.animalsay.utils.DialogUtils;

public class Pikachu extends Animal implements AnimalInterface {

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

    public Pikachu() {
    }

    public Pikachu(String phrase) {
        super(phrase);
    }

    public String say() {
        return DialogUtils.createDialog(getPhrase()) + " \n"
                + IMAGE + "\n";
    }
}
