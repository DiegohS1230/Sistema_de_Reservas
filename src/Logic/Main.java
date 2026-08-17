package Logic;

public class Main {
    public static void main(String[] args) {
        // Crear administrador
        Administrador admin = new Administrador("admin01", "clave123");

        // Crear categoría
        Categoria categoria = new Categoria("C1", "Salas de reuniones");
        admin.agregarCategoria(categoria);

        // Crear recurso
        Recurso recurso = new Recurso("R1", categoria,"Sala 101");
        admin.agregarRecurso(recurso);

        // Cre

        // Crear fecha y hora
        Fecha fecha = new Fecha(16, 8, 2026);
        Hora horaInicio = new Hora(14, 30);
        Hora horaFin = new Hora(16, 0);

        // Crear reserva
        Reserva reserva = new Reserva(
                "RES1",
                fecha,
                horaInicio,
                horaFin,
                "Domingo",
                recurso,
                admin,
                "Activa"
        );

        // Mostrar resultados
        System.out.println("=== Categorías ===");
        System.out.println(admin.listarCategorias());

        System.out.println("=== Reserva creada ===");
        System.out.println(reserva.toString());
    }
}
