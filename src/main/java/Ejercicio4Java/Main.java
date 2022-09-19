package Ejercicio4Java;

public class Main {

    public static void main(String[] args) {

        SmartPhone samsung = new SmartPhone("Samsung", "A10","azul", 2, true, true,
                10.566, 5.5, false, "led", 4, 5);

        System.out.println(samsung.marca +" "+ samsung.modelo +" "+ samsung.color +" RAM de "+ samsung.RAM +"GB, bluthoo: "+
                samsung.bluthoo +", wifi: "+ samsung.wifi +", precio "+ samsung.precio +" $, camara "+ samsung.pixcamara+
                ", drone: "+ samsung.drone+", flash "+ samsung.flash+", ancho "
                +samsung.ancho+", alto "+samsung.alto);



        SmartWatch xioami = new SmartWatch("Xioami","small","negro",1,true,
                false,5.996,true);
        System.out.println("SmartWacht marca " +xioami.marca+", modelo "+xioami.modelo+", color " + xioami.color+
                ", RAM de "+xioami.RAM+"GB, bluthoo: "+xioami.bluthoo+", wifi: "+
                xioami.wifi+", precio: "+ xioami.precio+" $, resiste agua: "+xioami.agua);

    }
}
