package Logic;
import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String id;
    private String description;
    private List<Recurso> recurses;
    //Meotos de Acceso
    public void setDescripcion(String description) {this.description = description;}
    public void setRecursos(List<Recurso> recurses) {this.recurses = recurses;}
    public void setId(String id) {this.id = id;}
    // Getters básicos
    public String getId() {return id;}
    public String getDescripcion() {return description;}
    public List<Recurso> getRecursos(){return recurses;}

    //Constructor
    public Categoria(String id, String description) {
        this.id = id;
        this.description = description;
        this.recurses = new ArrayList<>();
    }

    //Metodos especiales
    public boolean agregarRecurso(Recurso recurso) {
        //Esta operacion por default ya devuelve un boolean
        return recurses.add(recurso);
    }

    public boolean eliminarRecurso(Recurso recurso) {
        //Esta operacion por default ya devuelve un boolean
       return recurses.remove(recurso);
    }




}
