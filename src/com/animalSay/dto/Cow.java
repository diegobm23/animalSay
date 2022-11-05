package com.animalSay.dto;

import com.animalSay.utils.DialogUtils;

public class Cow extends Animal {

    private static final String IMAGE = "        \\   ^__^              \n"
            + "         \\  (oo)\\_______     \n"
            + "            (__)\\       )\\/\\\n"
            + "                ||----w |      \n"
            + "                ||     ||      \n";

    public Cow(String phrase) {
        super(phrase);
    }

    public String say() {
        return DialogUtils.createDialog(getPhrase()) + " \n"
                + IMAGE + "\n";
    }
}
