
package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ivanr
 */
public class BaseDatos {
    public static Connection conexion;
    
     public void conectar() {

        String URL = "jdbc:sqlserver://sql5107.site4now.net:1433;"
                    +"database=db_a84ab7_mmca;"
                    +"user=db_a84ab7_mmca_admin;"
                    +"password=MMCA2022;"
                    +"loginTimeout=30;";
            try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL);
            //System.out.println("conexion exitosa BD MMCA");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            //System.exit(0);
        }
    }
    
    public void cerrar(Connection con,ResultSet res ){
        try {
            if (con!=null) {
                con.close();
            }
            if (res!=null) {
                res.close();
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
    
    public void cerrar(Statement statement, ResultSet res ){
        try {
            if (statement!=null) {
                statement.close();
            }
            if (res!=null) {
                res.close();
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
     
     
    public static Connection getConexion() {
        return conexion;
    }
    
     
}
