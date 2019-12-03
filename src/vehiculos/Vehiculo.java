package vehiculos;

public class Vehiculo {
    public static final int tipo_taxi = 1;
    public static final int tipo_bus = 2;
    private int id;
    private String marca;
    private String modelo;
    private String matricula;
    private int anio;
    private int tipo;
    
    public Vehiculo(String marca, String modelo, String matricula, int anio, int tipo) {
        super();
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;
        this.anio=anio;
        this.tipo=tipo;
    }

    /**
     * @return the tipo_taxi
     */
    public static int getTipo_taxi() {
        return tipo_taxi;
    }

    /**
     * @return the tipo_bus
     */
    public static int getTipo_bus() {
        return tipo_bus;
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
}
