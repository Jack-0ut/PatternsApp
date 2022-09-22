package org.example.Burgers;

import org.example.Interfaces.Packing;

public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Vegan Burger";
    }

    @Override
    public float price() {
        return 80;
    }
}
