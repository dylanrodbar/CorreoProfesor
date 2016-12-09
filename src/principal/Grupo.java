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
        return estudiantes;
    }
    
    //Métodos operacionales
    
    //annadirEstudiante: método encargado de añadir un nuevo estudiante al sistema
    //Entradas: cedula, nombre, apellido y correo
    //Salidas: ninguna
    public void annadirEstudiante(int cedula, String nombre, String apellido, String correo){
        estudiantes.add(new Estudiante(cedula, nombre, apellido, correo));
    }
    
    //getEstudianteCedula: método encargado de obtener un estudiante por su número de cédula
    //Entradas: cedula
    //Salidas: ninguna
    public Estudiante getEstudianteCedula(int cedula){
        for(Estudiante estudiante: estudiantes){
            if(cedula == estudiante.getCedula())
                return estudiante;
        }
        
        
        return null;
    }
    
    
    
}
