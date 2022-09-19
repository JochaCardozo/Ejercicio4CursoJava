package Ejercicio4Java;

import Ejercicio4Java.SmartDevice;

public class SmartWatch extends SmartDevice {

    //Atributos
    boolean agua;

    //Constructor
    public SmartWatch(String marca, String modelo, String color, int RAM, boolean bluthoo,
                      boolean wifi, double precio, boolean agua) {
        super(marca, modelo, color, RAM, bluthoo, wifi, precio);
        this.agua = agua;
    }
}
