package Clases;

import java.awt.Color;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Cristoelateo
 */
public class DetProyecto extends Proyecto{
    private int idProyecto,noInvitados,presupuesto;
    private String nombre,ciudad,lugar,direccion,hora,tipoEvento;

    public DetProyecto(int idProyecto, int noInvitados, int presupuesto, 
            String nombre,String ciudad, String lugar, String direccion, String hora, String tipoEvento) {
        this.idProyecto = idProyecto;
        this.noInvitados = noInvitados;
        this.presupuesto = presupuesto;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.direccion = direccion;
        this.hora = hora;
        this.tipoEvento = tipoEvento;
    }
    
    public DetProyecto() {
    }

    @Override
    public String toString() {
        return "DetProyecto{" + "idProyecto=" + idProyecto + ", noInvitados=" + noInvitados + ", presupuesto=" + presupuesto + ", nombre=" + nombre + ", ciudad=" + ciudad + ", lugar=" + lugar + ", direccion=" + direccion + ", hora=" + hora + ", tipoEvento=" + tipoEvento + '}';
    }
    
    
    public void insertar() {
    

        int resultado;
        try {
            PreparedStatement enunciado;
            enunciado = bd.getConexion().prepareStatement("INSERT INTO DET_PROYECTOS(ID_PROYECTO,NOMBRE"
                    + ",CUIDAD,PRESUPUESTO,NUMERO_INVITADOS,ID_TIPOEVENTO,LUGAR,HORA_EVENTO,DIRECCION_SALON)"
                    + " values (?,?,?,?,?,?,?,?,?)");
            
            
            enunciado.setInt(1, idProyecto);
            enunciado.setString(2,nombre);
            enunciado.setString(3, ciudad);
            enunciado.setInt(4, presupuesto);
            enunciado.setInt(5, noInvitados);
            enunciado.setString(6,tipoEvento );
            enunciado.setString(7, lugar);
            enunciado.setString(8, hora);
            enunciado.setString(9,direccion);
            resultado = enunciado.executeUpdate();
            
            if (resultado > 0) {
                UIManager.put("OptionPane.background", Color.decode("#FBE5DA"));
                UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FBE5DA"));
                UIManager.put("Button.background", Color.decode("#FBE5DA"));
                Icon icono = new ImageIcon(getClass().getResource("/imagenes/insertado.png"));
                JOptionPane.showMessageDialog(null,"Usuario Insertado Correctamente ", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
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
    
}
