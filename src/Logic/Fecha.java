package Logic;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    public void setMes(int mes) {this.mes = mes;}
    public void setAnio(int anio) {this.anio = anio;}
    public void setDia(int dia) {this.dia = dia;}

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }

    @Override
    public String toString() {return dia + "/" + mes + "/" + anio;}
}
