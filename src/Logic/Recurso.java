package Logic;

public class Recurso {
    //Atributos
    private String id;
    private String descripcion;
    private Categoria categoria;


    //Metodos
    public Categoria getCategoria() {return categoria;}
    public void setCategoria(Categoria categoria) {this.categoria = categoria;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    //Contructor
    public Recurso(String id, Categoria categoria, String descripcion) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "Recurso{" + "id='" + id + '\'' + ", descripcion='" + descripcion + '\'' + ", categoria=" + categoria + '}';
    }


}
