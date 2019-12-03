package conductores;

public class Conductor {
    private int id;
    private String nombre;
    private String tipoLicencia;
    
    public Conductor(String nombre, String tipoLicencia){
        super();
        this.nombre=nombre;
        this.tipoLicencia=tipoLicencia;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipoLicencia
     */
    public String getTipoLicencia() {
        return tipoLicencia;
    }

    /**
     * @param tipoLicencia the tipoLicencia to set
     */
    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    public void mostrarVehiculo(){
        System.out.println("Datos Vehiculo:");
    }
    
    
}
