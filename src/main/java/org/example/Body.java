package org.example;

public class Body {
    private String name;
    private int size;

    public Body(String name, int size) {
        this.name = name;
        this.size = size;
    }



    public Body() {
        this.name = "KIA";
        this.size = 50;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Body{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
