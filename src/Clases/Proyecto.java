
package Clases;
import java.util.Date;

public class Proyecto {
    private int id,idCliente,estado;
    private Date start,end;

    public Proyecto() {
    }

    public Proyecto(int id, int idCliente, int estado, Date start, Date end) {
        this.id = id;
        this.idCliente = idCliente;
        this.estado = estado;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id=" + id + ", idCliente=" + idCliente + ", estado=" + estado + ", start=" + start + ", end=" + end + '}';
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