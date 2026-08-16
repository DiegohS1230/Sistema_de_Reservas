package Logic;

public class Administrador  extends  Usuario{
    Administrador(String id,String clave){
        super(id,clave,Rol.ADMINISTRADOR);
    }
}
