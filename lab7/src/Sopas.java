
import java.awt.*;

public class Sopas {

    private String tipo;
    private int minutos;
    private Color c;

    public Sopas(String tipo, int minutos, Color c) {
        this.tipo = tipo;
        this.minutos = minutos;
        this.c = c;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Sopas{" + "tipo=" + tipo + '}';
    }
    
}
