package org.example.Burgers;


import org.example.Interfaces.Item;
import org.example.Interfaces.Packing;
import org.example.Packings.Wrapper;

public abstract class Burger implements Item  {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
