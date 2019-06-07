
import java.util.*;


public class Chefs {

    private String nombre;
    private int edad;
    private String genero;
    private ArrayList<Menu> platillos = new ArrayList();

    public Chefs(String nombre, int edad, String genero) {
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

    public ArrayList<Menu> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(ArrayList<Menu> platillos) {
        this.platillos = platillos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
