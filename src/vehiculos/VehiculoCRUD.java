package vehiculos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import basedatos.Conexion;

public class VehiculoCRUD {

    public void create(Vehiculo vehiculo) throws SQLException {
        String query;
        Conexion bd = new Conexion();
        Statement sentencia = bd.conectar().createStatement();
        query = "insert into vehiculo(marca, modelo, matricula, anio, id_tipo_vehiculo) values("
                + "'" + vehiculo.getMarca() + "', '" + vehiculo.getModelo()
                + "', '" + vehiculo.getMatricula() + "', " + vehiculo.getAnio()
                + ", " + vehiculo.getTipo()
                + ");";
        if (sentencia.executeUpdate(query) > 0) {
            System.out.println("El registro se insertó exitosamente.");
        } else {
            System.out.println("No se pudo insertar el registro.");
        }
        System.out.println(query);
        sentencia.close();
        bd.conexion.close();
    }

    public void read(Vehiculo vehiculo) {
        String query;
        Conexion bd = new Conexion();
        try {
            query = "select * from vehiculo where matricula = '" + vehiculo.getMatricula() + "'";
            Statement sentencia = bd.conectar().createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String marca = resultado.getString("marca");
                String modelo = resultado.getString("modelo");
                String matricula = resultado.getString("matricula");
                int anio = resultado.getInt("anio");
                int tipoVehiculo = resultado.getInt("id_tipo_vehiculo");

                System.out.format("%d,%s, %s, %s,%d, %d\n", id, marca, modelo, matricula, anio, tipoVehiculo);
            }
            sentencia.close();
            bd.conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
  
    }

    public void update(Vehiculo vehiculo, String modelo) {
        String query;
        Conexion bd = new Conexion();
        try {
            query = "update vehiculo set modelo = ? where matricula = ?;";
            PreparedStatement sentenciaP = bd.conectar().prepareStatement(query);
            sentenciaP.setString(1, modelo);
            sentenciaP.setString(2, vehiculo.getMatricula());
            sentenciaP.executeUpdate();
            System.out.println("El registro se actualizó exitosamente.");
            sentenciaP.close();
            bd.conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Vehiculo vehiculo) {
        String query;
        Conexion bd = new Conexion();
        try {
            query = "DELETE FROM vehiculo WHERE matricula =?;";
            PreparedStatement sentenciaP = bd.conectar().prepareStatement(query);
            sentenciaP.setString(1, vehiculo.getMatricula());
            sentenciaP.execute();
            System.out.println("El registro se elimino exitosamente.");
            sentenciaP.close();
            bd.conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
