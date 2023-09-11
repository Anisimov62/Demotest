package org.example;

public class Engine {
    private String name;
    private int power;




    public Engine(String name, int power){
        this.name=name;
        this.power=power;
    }
    public Engine(){
        this.name="V8";
        this.power=200;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
