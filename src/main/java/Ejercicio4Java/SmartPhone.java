package Ejercicio4Java;

public class SmartPhone extends SmartDevice {

    //Atributos
public double pixcamara;
public boolean drone;
public String flash;
public int ancho;
public int alto;

public SmartPhone(){

}
//Constructor
    public SmartPhone(String marca, String modelo, String color, int RAM, boolean bluthoo, boolean wifi, double precio,
                      double pixcamara, boolean drone, String flash, int ancho, int alto) {
        super(marca, modelo, color, RAM, bluthoo, wifi, precio);
        this.pixcamara = pixcamara;
        this.drone = drone;
        this.flash = flash;
        this.ancho = ancho;
        this.alto = alto;
    }
}
