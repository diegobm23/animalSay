package com.animalsay;

import com.animalsay.enums.AnimalType;
import com.animalsay.interfaces.AnimalFactory;
import com.animalsay.interfaces.AnimalInterface;

public class App {

    public static void print(String message) {
        System.out.print(message);
    }

    public static void printHelp() {
        String help = "You need to pass two arguments: \n" +
                "animalSay [animal] [message] \n\n" +
                "Example: \n" +
                "animalSay \"cow\" \"Hello World!\"\n" +
                "animalSay \"cat\" \"Meow meow, pet me now human slave... meow meow\"";

        print(help);
        System.exit(1);
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            printHelp();
        }

        String animalName = args[0];
        String phrase = args[1];

        AnimalType animalType = AnimalType.getAnimalTypeByName(animalName);

        if (animalType == null) {
            print("Sorry, Animal not implemented yet.\n\n");
            printHelp();
        }

        AnimalInterface animal = AnimalFactory.getAnimal(animalType);
        animal.setPhrase(phrase);
        print(animal.say());

        System.exit(0);
    }

}
