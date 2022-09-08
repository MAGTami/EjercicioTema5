package poo.herenciatema4;

import poo.ejerciciotema4.SmartDevice;

public class SmartPhone extends SmartDevice {

    boolean wristBelt;

    public SmartPhone(){
    }

    public SmartPhone(String sistemaOperativo, String fabricante, String modelo, int ram, int capacidad, boolean
            frontCamera, boolean backCamera, int bateryCharge, boolean gps, boolean frontLigth, boolean bluetooth) {
        super("Android", "Samsung", "Galaxy100", 64, 500, true, true, 50000,
                true, false, true);
        this.wristBelt = wristBelt;
    }
}
