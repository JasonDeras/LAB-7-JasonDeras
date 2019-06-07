
import java.awt.Color;

public class Menu {

    private int tiempo;
    private String id;
    private String fecha;
    private Color c;
    private String tipo;

    public Menu(int tiempo, String id, String fecha, Color c, String tipo) {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
        return "Menu{" + "tipo=" + tipo + '}';
    }

}
