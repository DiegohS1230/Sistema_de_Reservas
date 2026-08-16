package Logic;
//La clase no se puede implementar
abstract class Usuario {
    //Metodos
    private String id, clave;
    private Rol rol;
    //Creando un Enum Para el tipo de Funcionalidad o rol que tenga CaDA Usuario.
    public enum Rol {
        ADMINISTRADOR,
        FUNCIONARIO
    }
    //Contructor
    public Usuario(String id, Rol rol, String clave) {
        this.id = id;
        this.rol = rol;
        this.clave = clave;
    }

    //Metodos
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public Rol getRol() {return rol;}
    public void setRol(Rol rol) {this.rol = rol;}

    public String getClave() {return clave;}
    public void setClave(String clave) {this.clave = clave;}



}
