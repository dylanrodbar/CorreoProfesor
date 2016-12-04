package principal;

import java.util.ArrayList;

public class Profesor {
    private int cedula;
    private String nombre;
    private String apellido;
    private String contrasenna;
    private ArrayList<Grupo> grupos;

    public Profesor(int cedula, String nombre, String apellido, String contrasenna) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenna = contrasenna;
    }

    //Métodos Get/Set
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    
    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }
    
    //Métodos operacionales
    
    
}
