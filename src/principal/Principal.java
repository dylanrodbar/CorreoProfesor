package principal;
import java.util.ArrayList;


//En esta clase se manejan las principales operaciones del programa
public class Principal {
    private int profesorActual;
    private ArrayList<Profesor> profesores;

    public Principal() {
        profesores = new ArrayList<Profesor>();
        profesores.add(new Profesor(1,"Juan","Martinez","1"));
        profesores.add(new Profesor(2,"Mario","Rodriguez","2"));
        profesores.add(new Profesor(3,"Maria","Gutierrez","3"));
        profesores.add(new Profesor(4,"Ariana","Jimenez","4"));
    }
    
    
    
    
    //Métodos operacionales
    
    //iniciarSesion: método encargado de evaluar si la cédula y contraseña dados coinciden con alguno del sistema
    //Entradas: cédula y contraseña del profesor registrado
    //Salidas: verdadero si los datos coinciden, falso si los datos no coinciden
    public boolean iniciarSesion(int cedula, String contrasenna){
        for(Profesor prof: profesores){
            if(prof.getCedula() == cedula && prof.getContrasenna().compareTo(contrasenna)==0){
                return true;
            }
        }
        return false;
    }
    
    //agregarProfesor: método encargado de añadir un profesor a la lista de profesores
    //Entradas: cédula, nombre, apellido y contraseña del profesor por registrar
    //Salidas: ninguna
    public void agregarProfesor(int cedula, String nombre, String apellido, String contrasenna){
        profesores.add(new Profesor(cedula, nombre, apellido, contrasenna));
    }
    
    
    
}
