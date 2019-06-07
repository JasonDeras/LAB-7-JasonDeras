
import java.util.*;
import javax.swing.*;

public class adminbarra extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private ArrayList<Menu> platillos = new ArrayList();

    public adminbarra(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public ArrayList<Menu> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(ArrayList<Menu> platillos) {
        this.platillos = platillos;
    }

    public void run() {
        if (platillos.size() > 0) {
            while (vive) {
                if (avanzar) {
                    for (int i = 0; i < platillos.size(); i++) {
                        int temp = platillos.get(i).getTiempo();
                        barra.setValue(barra.getValue() + 1);
                        if (barra.getValue() == temp) {
                            barra.setMinimum(0);
                            barra.setMaximum(0);
                        }
                    }
                }
            }
        }
    }
}
