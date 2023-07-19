package com.animalsay.dto;

import com.animalsay.interfaces.AnimalInterface;
import com.animalsay.utils.DialogUtils;

public class Cow extends Animal implements AnimalInterface {

    private static final String IMAGE = "        \\   ^__^              \n"
            + "         \\  (oo)\\_______     \n"
            + "            (__)\\       )\\/\\\n"
            + "                ||----w |      \n"
            + "                ||     ||      \n";

    public Cow() {
    }

    public Cow(String phrase) {
        super(phrase);
    }

    public String say() {
        return DialogUtils.createDialog(getPhrase()) + " \n"
                + IMAGE + "\n";
    }
}
