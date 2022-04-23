
package Clases;
import Principal.BaseDatos;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Proyecto {
    private int id,idCliente,estado;
    private Date start,end;
    public  Connection conexion;
    BaseDatos bd= new BaseDatos();
    

    public Proyecto() {
    }

    public Proyecto(int id, int idCliente, int estado, Date start, Date end) {
        this.id = id;
        this.idCliente = idCliente;
        this.estado = estado;
        this.start = start;
        this.end = end;
    }

    public Proyecto(int idCliente, Date start) {
        this.idCliente = idCliente;
        this.start = start;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id=" + id + ", idCliente=" + idCliente + ", estado=" + estado + ", start=" + start + ", end=" + end + '}';
    }
    public void imp(){
        System.out.println(this.start);
    }
    
    public void insertar() {
    java.sql.Date sqlDate = new java.sql.Date(start.getTime());

        int resultado;
        try {
            PreparedStatement enunciado;
            enunciado = bd.getConexion().prepareStatement("INSERT INTO PROYECTO(ID_CLIENTE,FECHA_INICIO"
                    + ",ESTADO) values (?,?,0)");
            
            
            enunciado.setInt(1, idCliente);
            enunciado.setDate(2,sqlDate );
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
    
}