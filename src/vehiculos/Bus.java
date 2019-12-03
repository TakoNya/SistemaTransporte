package vehiculos;
import java.util.ArrayList;

public class Bus extends Vehiculo{
    private ArrayList estaciones;


    public Bus (String marca,String modelo, String matricula, int anio){
        super(marca,modelo,matricula,anio,tipo_bus);
    }
    public ArrayList getEstaciones(){
        return estaciones;
    }
    public void setEstaciones (ArrayList estaciones){
        this.estaciones = estaciones;
    }
    

    
}
