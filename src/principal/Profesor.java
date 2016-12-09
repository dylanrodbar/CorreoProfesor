package principal;

import java.util.ArrayList;

public class Profesor {
    private int cedula;
    private String nombre;
    private String apellido; 
    private String contrasenna;
    private String correo;
    private String contrasennaCorreo;
    private ArrayList<Grupo> grupos;

    public Profesor(int cedula, String nombre, String apellido, String contrasenna,String correo, String contrasennaCorreo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenna = contrasenna;
        this.correo = correo;
        this.contrasennaCorreo = contrasennaCorreo;
        this.grupos = new ArrayList<>();
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
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasennaCorreo() {
        return contrasennaCorreo;
    }

    public void setContrasennaCorreo(String contrasennaCorreo) {
        this.contrasennaCorreo = contrasennaCorreo;
    }
    
    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }
    
    public Grupo getGrupo(int numeroGrupo){
        return grupos.get(numeroGrupo);
    }
    
    //Métodos operacionales
    
    //agregarGrupo: método encargado de añadir un nuevo grupo al sistema
    //Entradas: numero de grupo, nombre del grupo
    //Salidas: ninguna
    public void agregarGrupo(int numero, String nombre){
        grupos.add(new Grupo(numero, nombre));
        for(Grupo grupo: grupos){
            System.out.println(grupo.getNumero());
            System.out.println(grupo.getNombre());
        }
    }

    
}
