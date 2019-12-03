package conductores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import basedatos.Conexion;

public class ConductorCRUD {
    
    public void create(Conductor conductor) throws SQLException {
        String query;
        Conexion bd = new Conexion();
        Statement sentencia = bd.conectar().createStatement();
        query = "insert into conductor(nombre, tipo_licencia) values(" + 
                "'" + conductor.getNombre() + "', " + 
                "'" + conductor.getTipoLicencia() + "'" + ");";
        if (sentencia.executeUpdate(query) > 0) {
            System.out.println("El registro se insertó exitosamente.");
        } else {
            System.out.println("No se pudo insertar el registro.");
        }
        System.out.println(query);
        sentencia.close();
        bd.conexion.close();
    }
    
}
