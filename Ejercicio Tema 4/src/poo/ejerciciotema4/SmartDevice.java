package poo.ejerciciotema4;

public class SmartDevice {

        protected String sistemaOperativo;
        protected String fabricante;
        protected String modelo;
        protected int ram;
        protected int capacidad;
        protected boolean frontCamera;
        protected boolean backCamera;
        protected int bateryCharge;
        protected boolean gps;
        protected boolean frontLigth;
        protected boolean bluetooth;

        public SmartDevice(){
        }

        public SmartDevice(String sistemaOperativo, String fabricante, String modelo, int ram, int capacidad, boolean
                frontCamera, boolean backCamera, int bateryCharge, boolean gps, boolean frontLigth, boolean bluetooth){
            this.sistemaOperativo = sistemaOperativo;
            this.fabricante = fabricante;
            this.modelo = modelo;
            this.ram = ram;
            this.capacidad = capacidad;
            this.frontCamera = frontCamera;
            this.backCamera = backCamera;
            this.bateryCharge = bateryCharge;
            this.gps = gps;
            this.frontLigth = frontLigth;
            this.bluetooth = bluetooth;
        }
}
