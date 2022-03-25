package Clases;



/**
 *
 * @author Ivanr
 */
public class Clientes {
    private int idCliente;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private String Telefono;
    private String correo;
    private String Descripcion;

    public Clientes(int idCliente, String Nombre, String Apellidos, String Direccion, String Telefono, String correo, String Descripcion) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.correo = correo;
        this.Descripcion = Descripcion;
    }

        
    
    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    
    
    
    
}
