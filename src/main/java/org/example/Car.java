package org.example;

import jdk.nashorn.internal.ir.LiteralNode;

import java.time.Year;

public class Car {


    private String name;
    private int power;
    private Engine engine;
    private Transmission transmission;
    private Wheels wheels;
    private Body body;



    public Car(String name, int power) {
        this.name = name;
        this.power = power;

        this.engine = new Engine();
        this.transmission= new Transmission();
        this.wheels = new Wheels();
        this.body = new Body();

    }


    public Car(){
        this.name="OKA";
        this.power=100;
        this.engine=new Engine("V8",350);
        this.body=new Body("Freek",210);
        this.transmission=new Transmission(2,"Tresh");
        this.wheels=new Wheels(16,"R");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int i) {
        this.power=power;
    }


//
//    public int Score(){
//        int score = getPower() + getEngine() + getTransmission() + getBody() + getWheels();
//        return score;
//
//    }

    public void comparison(Car othercar){
        Integer car=new Integer(1);
        Integer car1=new Integer(2);
        assertThat(car.equals((car1))).isTrue();
    }

    private LiteralNode.PrimitiveLiteralNode<Object> assertThat(boolean equals) {
        return assertThat(true);
     }



    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", wheels=" + wheels +
                ", body=" + body +
                '}';
    }


}
