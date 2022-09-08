package poo.herenciatema4;

import poo.ejerciciotema4.SmartDevice;

public class SmartWatch extends SmartDevice {

    Boolean waterResistant;


    public SmartWatch(){}

    public SmartWatch(String sistemaOperativo, String fabricante, String modelo, int ram, int capacidad, boolean
            frontCamera, boolean backCamera, int bateryCharge, boolean gps, boolean frontLigth, boolean bluetooth){
        super("ios", "apple", "jogger", 8, 64, false, false, 2000,
                true, false, true );
        this.waterResistant = waterResistant;
    }
}
