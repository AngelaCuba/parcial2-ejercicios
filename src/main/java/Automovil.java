package iterator.importadorasAutomoviles;

public class Automovil {
    private int costo;
    private String modelo;
    private int nroAsientos;
    private String tipo;

    public Automovil(int costo, String modelo, int nroAsientos, String tipo) {
        this.costo = costo;
        this.modelo = modelo;
        this.nroAsientos = nroAsientos;
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNroAsientos() {
        return nroAsientos;
    }

    public void setNroAsientos(int nroAsientos) {
        this.nroAsientos = nroAsientos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
