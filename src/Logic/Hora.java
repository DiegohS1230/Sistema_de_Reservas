package Logic;

public class Hora {
    //Se omita la creecion de segundos porque vamos, una reservacion no tiene segundos
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() { return hora; }
    public int getMinuto() { return minuto; }

    @Override
    public String toString() {return String.format("%02d:%02d", hora, minuto);}
}

