package sistematransporte;

import java.sql.SQLException;
import vehiculos.Taxi;
import vehiculos.Bus;
import vehiculos.VehiculoCRUD;
import conductores.ConductorCRUD;
import conductores.Taxista;
import conductores.ChoferBus;
        
public class Principal {
  
    public static void main(String[] args) throws SQLException {
        VehiculoCRUD gestor = new VehiculoCRUD();
        Taxi taxi1 = new Taxi("CHEVROLET", "SPARK", "TQR876", 2016);
        gestor.create(taxi1);
        Taxi taxi2 = new Taxi("RENAULT", "CLIO", "AB869UK", 2018);
        gestor.create(taxi2);
        Bus bus1 = new Bus("MERCEDES-BENZ", "345 CONECTO", "AF123CD", 2019);
        gestor.create(bus1);
        Bus bus2 = new Bus("SCANIA", "HIGERA 30", "MRU764", 2017);
        gestor.create(bus2);
        gestor.read(taxi1);
        gestor.read(bus2);
        
       ConductorCRUD gestor2 = new ConductorCRUD();
       Taxista taxista1= new Taxista ("Hidenori", " Taxi", taxi1);
       gestor2.create(taxista1);
       Taxista taxista2= new Taxista ("Yoshitake", "taxi", taxi2);
       gestor2.create(taxista2);
       ChoferBus chofer1=new ChoferBus("Tadakuni", "bus", bus1);
       gestor2.create(chofer1);
       ChoferBus chofer2=new ChoferBus("Imouto", "bus", bus2);
       gestor2.create(chofer2);
       //gestor2.delete(taxista1);
       //gestor2.read(taxista2);
       //gestor2.update(taxista2, "Ringo-Chan");
       //gestor2.read(taxista2);
       
        
    }
    
}
