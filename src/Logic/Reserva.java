package Logic;

public class Reserva {
    private String id;
    private Fecha fecha;
    private Hora horaInicio;
    private Hora horaFin;
    private String diaSemana;
    private Recurso recurso;
    private Usuario usuario;
    private String estado; // "Activa", "Cancelada", "Pendiente"
    private String observaciones;

    public Reserva(String id, Fecha fecha, Hora horaInicio, Hora horaFin, String diaSemana, Recurso recurso, Usuario usuario, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.diaSemana = diaSemana;
        this.recurso = recurso;
        this.usuario = usuario;
        this.estado = estado;
    }

    // Getters y setters
    public String getId() { return id; }
    public Fecha getFecha() { return fecha; }
    public Hora getHoraInicio() { return horaInicio; }
    public Hora getHoraFin() { return horaFin; }
    public String getDiaSemana() { return diaSemana; }
    public Recurso getRecurso() { return recurso; }
    public Usuario getUsuario() { return usuario; }
    public String getEstado() { return estado; }
    public String getObservaciones() { return observaciones; }

    public void setEstado(String estado) { this.estado = estado; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    @Override
    public String toString() {
        return "Reserva{" + "id='" + id + '\'' + ", fecha=" + fecha + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", diaSemana='" + diaSemana + '\'' + ", recurso=" + recurso + ", usuario=" + usuario + ", estado='" + estado + '\'' + ", observaciones='" + observaciones + '\'' + '}';
    }
}

