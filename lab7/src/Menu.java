
import java.awt.Color;
import java.util.Date;

public class Menu {

    private int tiempo;
    private String id;
    private Date fecha;
    private Color c;
    private String tipo;

    public Menu(int tiempo, String id, Date fecha, Color c, String tipo) {
        this.tiempo = tiempo;
        this.id = id;
        this.fecha = fecha;
        this.c = c;
        this.tipo = tipo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Menu{" + "tiempo=" + tiempo + ", id=" + id + ", fecha=" + fecha + ", c=" + c + ", tipo=" + tipo + '}';
    }

    
}
