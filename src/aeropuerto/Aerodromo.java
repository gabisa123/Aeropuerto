
package aeropuerto;

public class Aerodromo extends Aeropuerto {
    private Boolean avionesTurbo;
    private int capacidadDeHangar;
    private String dueno;

    public Aerodromo(Boolean avionesTurbo, int capacidadDeHangar, String dueno) {
        this.avionesTurbo = avionesTurbo;
        this.capacidadDeHangar = capacidadDeHangar;
        this.dueno = dueno;
    }

    public Boolean getAvionesTurbo() {
        return avionesTurbo;
    }

    public void setAvionesTurbo(Boolean avionesTurbo) {
        this.avionesTurbo = avionesTurbo;
    }

    public int getCapacidadDeHangar() {
        return capacidadDeHangar;
    }

    public void setCapacidadDeHangar(int capacidadDeHangar) {
        this.capacidadDeHangar = capacidadDeHangar;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
    
    
}
