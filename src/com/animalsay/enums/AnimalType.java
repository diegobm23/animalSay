package com.animalsay.enums;

import com.animalsay.dto.*;
import com.animalsay.interfaces.AnimalInterface;

import java.util.function.Supplier;

public enum AnimalType {

    CAT("cat", Cat::new),
    COW("cow", Cow::new),
    PIKACHU("pikachu", Pikachu::new);

    private final String name;
    private final Supplier<AnimalInterface> constructor;

    AnimalType(String name, Supplier<AnimalInterface> constructor) {
        this.name = name;
        this.constructor = constructor;
    }

    public Supplier<AnimalInterface> getConstructor() {
        return this.constructor;
    }

    public static AnimalType getAnimalTypeByName(String name) {
        for (AnimalType animalType : AnimalType.values()) {
            if (animalType.name.equalsIgnoreCase(name)) {
                return animalType;
            }
        }

        return null;
    }
}
