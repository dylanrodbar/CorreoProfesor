package principal;
import java.util.ArrayList;


//En esta clase se manejan las principales operaciones del programa
public class Principal {
    private Profesor profesorActual;
    private ArrayList<Profesor> profesores;

    public Principal() {
        profesores = new ArrayList<Profesor>();
        profesores.add(new Profesor(1,"Juan","Martinez","1","Correo1","Contr1"));
        profesores.get(0).agregarGrupo(1, "Grupo1");
        //profesores.get(0).agregarGrupo(2, "Grupo2");
        profesores.get(0).getGrupo(0).annadirEstudiante(1, "E1", "A1", "C1");
        profesores.get(0).getGrupo(0).annadirEstudiante(2, "E2", "A2", "C2");
        profesores.add(new Profesor(2,"Mario","Rodriguez","2","Correo2","Contr2"));
        profesores.add(new Profesor(3,"Maria","Gutierrez","3","Correo3","Contr3"));
        profesores.add(new Profesor(4,"Ariana","Jimenez","4","Correo4","Contr4"));
    }
    
    
    
    
    //Métodos operacionales
    
    //iniciarSesion: método encargado de evaluar si la cédula y contraseña dados coinciden con alguno del sistema
    //Entradas: cédula y contraseña del profesor registrado
    //Salidas: verdadero si los datos coinciden, falso si los datos no coinciden
    public boolean iniciarSesion(int cedula, String contrasenna){
        for(Profesor prof: profesores){
            if(prof.getCedula() == cedula && prof.getContrasenna().compareTo(contrasenna)==0){
                profesorActual = prof;
                return true;
            }
        }
        return false;
    }
    
    //agregarProfesor: método encargado de añadir un profesor a la lista de profesores
    //Entradas: cédula, nombre, apellido y contraseña del profesor por registrar
    //Salidas: ninguna
    public void agregarProfesor(int cedula, String nombre, String apellido, String contrasenna, String correo, String contrasennaCorreo){
        profesores.add(new Profesor(cedula, nombre, apellido, contrasenna, correo, contrasennaCorreo));
        for(Profesor profesor:profesores){
            System.out.println(profesor.getNombre());
            System.out.println(profesor.getApellido());
        }
    }
    
    //getProfesorActual: método encargado de obtener el profesor que actualmente utiliza el sistema
    //Entradas: ninguna
    //Salidas: el profesor actual
    public Profesor getProfesorActual(){
        return profesorActual;
    }
    
    //getNombreProfesorActual: método encargado de obtener el nombre del profesor que actualmente utiliza el sistema
    //Entradas: ninguna
    //Salidas: nombre del profesor actual
    public String getNombreProfesorActual(){
        return profesorActual.getNombre();
    }
    
    //getApellidoProfesorActual: método encargado de obtener el apellido del profesor que actualmente utiliza el sistema
    //Entradas: ninguna
    //Salidas: apellido del profesor actual
    public String getApellidoProfesorActual(){
        return profesorActual.getApellido();
    }
    
    
    
    
    
}
