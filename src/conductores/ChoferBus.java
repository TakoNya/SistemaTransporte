package conductores;
import vehiculos.Bus;

public class ChoferBus extends Conductor{
    private Bus bus;
    public ChoferBus(String nombre, String tipoLicencia, Bus bus){
        super(nombre, tipoLicencia);
        this.bus=bus;
    }

    /**
     * @return the bus
     */
    public Bus getBus() {
        return bus;
    }

    /**
     * @param bus the bus to set
     */
    public void setBus(Bus bus) {
        this.bus = bus;
    }
    @Override 
    public void mostrarVehiculo(){
        super.mostrarVehiculo();
        System.out.println("Datos del Bus: " + getBus().getMarca() + " " + getBus().getModelo());
    }
}
