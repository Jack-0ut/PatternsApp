package org.example.ColdDrinks;

import org.example.Packings.Bottle;
import org.example.Interfaces.Item;
import org.example.Interfaces.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
