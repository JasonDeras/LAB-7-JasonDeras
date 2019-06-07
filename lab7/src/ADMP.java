import java.io.*;
import java.util.*;

public class ADMP {

    private ArrayList listap = new ArrayList();
    private File archivo = null;

    public ADMP(String path) {
        archivo = new File(path);
    }

    public ArrayList getListap() {
        return listap;
    }

    public void setListap(ArrayList listap) {
        this.listap = listap;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "ADMP{" + "listap=" + listap + '}';
    }

    public void setListap(Object p) {
        listap.add(p);
    }

    public void cargarArchivo() {
        try {
            listap = new ArrayList();
            Object temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Menu) objeto.readObject()) != null
                            ||(temp = (Cliente) objeto.readObject()) != null
                            ||(temp = (Chefs) objeto.readObject()) != null) {
                        listap.add(temp);
                    }
                } catch (EOFException e) {
                    //Encontr el final del archivo
                }
                objeto.close();
                entrada.close();
            }//Fin del if
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Object t : listap) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
