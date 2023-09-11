package org.example;

public class Wheels {
    private String name;
    private int size;
    private int friction_force;
    public Wheels(){

    }

    public Wheels(String name, int size, int friction_force) {
        this.name = name;
        this.size = size;
        this.friction_force = friction_force;
    }
    public Wheels(int i, String kumho){
        this.name = "KAMA";
        this.size = 16;
        this.friction_force = 92;
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

    public int getFriction_force() {
        return friction_force;
    }

    public void setFriction_force() {
        this.friction_force = friction_force;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", friction_force=" + friction_force +
                '}';
    }
}
