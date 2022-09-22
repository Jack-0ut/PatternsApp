package org.example;

import org.example.Interfaces.Item;
import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items = new ArrayList<>();
    private float getCost;

    public void addItem(Item item){
        items.add(item);
        getCost+= item.price();
    }
    public float getCost(){
        return getCost;
    }
    public void showItems(){
        for (Item item: items) {
            System.out.println(item.name() + " in " + item.packing() + " for " + item.price() + " UAH");
        }
    }
}
