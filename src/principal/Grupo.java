package principal;

import java.util.ArrayList;

public class Grupo {
    private int numero;
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Grupo(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    //Métodos Get/Set
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Métodos operacionales
    
    public void annadirEstudiante(int cedula, String nombre, String apellido, String correo){
        estudiantes.add(new Estudiante(cedula, nombre, apellido, correo));
        
    }
    
    public void obtenerEstudiante(int cedula){
        
        
    }
    
}
