package com.animalsay.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;

public class DialogUtils {

    private DialogUtils() {}

    public static String createDialog(String phrase) {
        StringBuilder dialog = new StringBuilder();
        String phraseWrap = WordUtils.wrap(phrase, 40);
        String[] phraseLines = phraseWrap.split("\n");

        int lineLenght = searchLongerLine(phraseLines);
        String lineTop = createLine("_", lineLenght);
        String lineBotton = createLine("-", lineLenght);

        if (phraseLines.length == 1) {
            return " " + lineTop + "\n"
                    + "< " + phraseWrap + " >\n"
                    + " " + lineBotton;
        }

        for (int i = 0; i < phraseLines.length; i++) {

            if (i == 0) {
                dialog.append(lineTop).append("\n");
                dialog.append("/ ").append(phraseLines[i]).append(" \\\n");
            }

            if (i > 0 && i < phraseLines.length - 1) {
                dialog.append("| ").append(StringUtils.rightPad(phraseLines[i], lineLenght)).append(" |\n");
            }

            if (i == phraseLines.length - 1) {
                dialog.append("\\ ").append(StringUtils.rightPad(phraseLines[i], lineLenght)).append(" /\n");
                dialog.append(lineBotton);
            }
        }

        return dialog.toString();
    }

    private static String createLine(String simbol, int lenght) {
        return " " + new String(new char[lenght]).replace("\0", simbol);
    }

    private static int searchLongerLine(String[] phraseLines) {
        int lineLength = 0;

        for (String phraseLine : phraseLines) {
            if (phraseLine.length() > lineLength) {
                lineLength = phraseLine.length();
            }
        }

        return lineLength;
    }
}
