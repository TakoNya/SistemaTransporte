package basedatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private final String url = "jdbc:mysql://localhost:3306/";
    private final String bd="transporte";
    private final String user="root";
    private final String password="1234";
    public Connection conexion= null;
    
    @SuppressWarnings("finally")
    public Connection conectar() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url + bd, user, password);
            if (conexion != null){
            System.out.println("¡Conexion Exitosa!");
        }
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            return conexion;
        }
    }
    
}
