
package aeropuerto;

public class AeropuertoDeCarga {
    private Boolean equipamiento;
    private int logìstica;
    private String mercancia;

    public AeropuertoDeCarga(Boolean equipamiento, int logìstica, String mercancia) {
        this.equipamiento = equipamiento;
        this.logìstica = logìstica;
        this.mercancia = mercancia;
    }

    public Boolean getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(Boolean equipamiento) {
        this.equipamiento = equipamiento;
    }

    public int getLogìstica() {
        return logìstica;
    }

    public void setLogìstica(int logìstica) {
        this.logìstica = logìstica;
    }

    public String getMercancia() {
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }
    
    
}
