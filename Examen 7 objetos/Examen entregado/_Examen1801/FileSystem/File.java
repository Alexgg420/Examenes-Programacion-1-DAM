package FileSystem;

import java.util.Date;

/**
 * clase File
 * Implementa la interfaz FileEntry
 * Tiene que almacenar el nombre del archivo (fileName de tipo String)
 * Tiene que almacenar la fecha de creación (createdAt de tipo Date)
 * Date es una clase que hay que crear con new. Ej. this.createdAt = new Date()
 * Si quieres imprimir la fecha que ha almacenado en la variabel createdAt
 * simplemente haz:
 * System.out.print(this.createdAt)
 * Tiene que almacenar el nivel en el que se encuentra el archivo
 * Ej: Si el archivo está en la raiz del sistema de archivos está en el nivel 0
 * Si está dentro de una carpeta que está en la raiz del disco está en el nivel
 * 1
 * y así sucesivamente
 * Tiene que haber un constructor que recibe solo el nombre del archivo
 * En este caso el nivel se configurar a 0
 * Tiene que haber un constructor que recibe el nombre del archivo y el nivel
 * En ambos constructores se inicializa la fecha de creación con new Date()
 */

public class File implements FileEntry {
    private String name;
    private Date createdAt;
    private int level;

    public File(String name) {
        this.name = name;
        this.level = 0;
        this.createdAt = new Date();
    }

    public File(String name, int level) {
        this(name);
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public int getLevel() {
        return level;
    }

    public boolean isDirectory() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        String spaces = "";
        for (int i = 0; i <= this.level; i++) {
            spaces += "_";
        }
        String ret = "|" + spaces + this.name +
                " " + this.getCreatedAt();
        return ret;
    }
}