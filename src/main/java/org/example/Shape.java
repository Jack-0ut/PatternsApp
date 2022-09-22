package org.example;

public abstract class Shape implements Cloneable{
    private String id;
    private String type;

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String  getId() {
        return id;
    }

    public String getType() {
        return type;
    }
    public abstract void drawShape();

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
        return  clone;
    }
}
