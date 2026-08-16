package Logic;
//La clase no se puede implementar
abstract class Usuario {
    //Creando un Enum Para el tipo de Funcionalidad o rol que tenga CaDA Usuario.
    public enum Rol {
        ADMINISTRADOR,
        FUNCIONARIO
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public Rol getRol() {return rol;}
    public void setRol(Rol rol) {this.rol = rol;}

    public String getClave() {return clave;}
    public void setClave(String clave) {this.clave = clave;}

    private String id, clave;
    private Rol rol;

}
