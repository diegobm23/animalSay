package com.animalsay.interfaces;

import com.animalsay.enums.AnimalType;

public class AnimalFactory {

    public static AnimalInterface getAnimal(AnimalType type) {
        return type.getConstructor().get();
    }

}
