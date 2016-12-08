package principal;

import java.util.ArrayList;

public class Grupo {
    private int numero;
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Grupo(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
        estudiantes = new ArrayList<>();
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
    
    public ArrayList<Estudiante> getEstudiantes(){
        for(Estudiante estudiante: estudiantes){
            System.out.println(estudiante.getNombre());
            System.out.println(estudiante.getApellido());
        }
        return estudiantes;
    }
    
    //Métodos operacionales
    
    public void annadirEstudiante(int cedula, String nombre, String apellido, String correo){
        estudiantes.add(new Estudiante(cedula, nombre, apellido, correo));
        for(Estudiante estudiante: estudiantes){
            System.out.println(estudiante.getNombre());
            System.out.println(estudiante.getApellido());
        }
        
    }
    
    public void obtenerEstudiante(int cedula){
        
        
    }
    
}
