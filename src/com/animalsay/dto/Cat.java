package com.animalsay.dto;

import com.animalsay.interfaces.AnimalInterface;
import com.animalsay.utils.DialogUtils;

public class Cat extends Animal implements AnimalInterface {

    private static final String IMAGE = "   \\\n"
            +"    \\\n"
            +"      ,_     _,\n"
            +"      |\\\\___//|\n"
            +"      |=6   6=|\n"
            +"      \\=._Y_.=/\n"
            +"       )  `  (    ,\n"
            +"      /       \\  ((\n"
            +"      |       |   ))\n"
            +"     /| |   | |\\_//\n"
            +"     \\| |._.| |/-`\n"
            +"      '\"'   '\"'\n";

    public Cat() {
    }

    public Cat(String phrase) {
        super(phrase);
    }

    public String say() {
        return DialogUtils.createDialog(getPhrase()) + " \n"
                + IMAGE + "\n";
    }
}
