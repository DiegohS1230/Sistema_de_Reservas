package Logic;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Administrador  extends  Usuario{
    //Atributos
    private List<Categoria> categorias; //llista de Categorias
    private List<Recurso> recursos;//Lista de recursos
    Administrador(String id,String clave){
        super(id,clave,Rol.ADMINISTRADOR);//Asignamos al contructor de la clase base
        this.categorias = new ArrayList<>(); //Se inicializan las listas vacias.
        this.recursos = new ArrayList<>();
    }
    public boolean agregarCategoria(Categoria categoria){return categorias.add(categoria);}
    public boolean eliminarCategoria(Categoria categoria){return categorias.remove( categoria);}
    public boolean modificarCategoria(Categoria nuevaCategoria){
        for (Categoria c : categorias) {
            if (c.getId().equals(nuevaCategoria.getId())) {
                c.setDescripcion(nuevaCategoria.getDescripcion());
                return true;
            }
        }
        return false;
    }
    public Categoria buscarCategoria(String id){
        for (Categoria c : categorias) if (c.getId().equals(id)) return c;
        return null;
    }

    public String listarCategorias() {
        StringBuilder salida = new StringBuilder();
        for(Categoria c: categorias) salida.append(c.toString());
        return salida.toString();
    }
    public boolean agregarRecurso( Recurso recur){
        if(!buscarRecurso(recur)) recursos.add(recur);
        return false;
    }
    public boolean eliminarRecurso(Recurso recur){
        return recursos.remove(recur);
    }
    public Recurso buscarRecurso(String  id){
            for(Recurso c: recursos) if(c.getId().equals(id)) return c;
            return null;
    }
    public boolean buscarRecurso(Recurso recurso) {
    for (Recurso c : recursos) if (Objects.equals(c.getId(), recurso.getId())) return true;
    return false;
}
    @Override
    public String toString() {
        return super.toString() + "Administrador{" + "categorias=" + categorias + ", recursos=" + recursos + '}';
    }



}
