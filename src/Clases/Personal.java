
package Clases;

import Principal.BaseDatos;
import java.awt.Color;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Cristoelateo
 */
public class Personal {
    private String nombre;
    private String pass;
    private int rango;
    public  Connection conexion;
    BaseDatos bd= new BaseDatos();

    public Personal(String nombre, String pass, int rango) {
        this.nombre = nombre;
        this.pass = pass;
        this.rango = rango;
    }

    public Personal() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(char rango) {
        this.rango = rango;
    }

      public void insertar() {

        int resultado;
        try {
            PreparedStatement enunciado;
            enunciado = bd.getConexion().prepareStatement("INSERT INTO PERSONAL(NOMBRE_USUARIO,CONTRASEÑA,"
                    + "RANGO,ESTADO) values (?,?,?,0)");
            
            
            enunciado.setString(1, nombre);
            enunciado.setString(2,pass);
            enunciado.setInt(3,rango);
            resultado = enunciado.executeUpdate();
            if (resultado > 0) {
                UIManager.put("OptionPane.background", Color.decode("#FBE5DA"));
                UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FBE5DA"));
                UIManager.put("Button.background", Color.decode("#FBE5DA"));
                Icon icono = new ImageIcon(getClass().getResource("/imagenes/insertado.png"));
                JOptionPane.showMessageDialog(null,"Cliente Insertado Correctamente ", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
            } else {
                UIManager.put("OptionPane.background", Color.decode("#FBE5DA"));
                UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FBE5DA"));
                UIManager.put("Button.background", Color.decode("#FBE5DA"));
                Icon icono = new ImageIcon(getClass().getResource("/imagenes/error.png"));
                JOptionPane.showMessageDialog(null,"Error ", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    @Override
    public String toString() {
        return "Personal{" + "nombre=" + nombre + ", pass=" + pass + ", rango=" + rango + '}';
    }
    
}
