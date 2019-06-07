
import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private int edad;
    private String genero;
    private ArrayList<Menu> platilos = new ArrayList();

    public Cliente(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Menu> getPlatilos() {
        return platilos;
    }

    public void setPlatilos(ArrayList<Menu> platilos) {
        this.platilos = platilos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", platilos=" + platilos + '}';
    }

}
