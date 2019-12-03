package conductores;

import vehiculos.Taxi;

public class Taxista extends Conductor {

    private int id;
    private static int idContador = 1;
    private Taxi taxi;

    public Taxista(String nombre, String tipoLicencia, Taxi taxi) {
        super(nombre, tipoLicencia);
        this.taxi = taxi;
        this.id = idContador;
        idContador++;
    }

    /**
     * @return the taxi
     */
    public Taxi getTaxi() {
        return taxi;
    }

    /**
     * @param taxi the taxi to set
     */
    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    @Override
    public void mostrarVehiculo() {
        System.out.println("Datos del vehícul:" + getTaxi().getMarca() + " " + getTaxi().getModelo());
    }

}
