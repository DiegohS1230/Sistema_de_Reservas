package Logic;
import java.util.List;
import java.util.ArrayList;

public class Funcionario extends Usuario{
    //Atributos
    private String nombre;
    private int telefono;
    private List<Reserva> reservas;
    //metodos de Acceso
    public List<Reserva> getReservas() {return reservas;}
    public void setReservas(List<Reserva> reservas) {this.reservas = reservas;}

    public int getTelefono() {return telefono;}
    public void setTelefono(int telefono) {this.telefono = telefono;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    //Contructor
    Funcionario(String id,String clave, String nombre, int telefono){
        super(id,clave,Rol.FUNCIONARIO);//Asignamos al contructor de la clase base
        this.nombre = nombre;
        this.telefono = telefono;
        this.reservas = new ArrayList<>();
    }
    //toString
    @Override
    public String toString() {
        return "Funcionario{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", reservas=" + reservas +
                '}';
    }
    //Metodos especificos de la lista
    public boolean AgregarRecerva(Reserva nuevo){
        if(nuevo != null && reservas.contains(nuevo)) reservas.add(nuevo);

        return false;
    }
    public boolean buscarReserva(String id){
        for(Reserva c: reservas) if (c.getId().equals(id)) return true;
        return false;
    }
    public boolean eliminarReserva(Reserva vieja){
        if(vieja != null) reservas.remove(vieja);
        return false;
    }
    


}
