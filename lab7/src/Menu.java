
import java.awt.*;
import java.util.*;

public class Menu {

    private int tiempo;
    private String id;
    private Color c;
    private Date fecha;

    public Menu(int tiempo, String id, Color c, Date fecha) {
        this.tiempo = tiempo;
        this.id = id;
        this.c = c;
        this.fecha = fecha;
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

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Menu{" + "id=" + id + '}';
    }

}
