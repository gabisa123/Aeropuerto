
package aeropuerto;

public class Aeropuerto {

    private int numeroDeAviones;
    private String nombre;
    private Boolean pistaDoble;

    public Aeropuerto(int numeroDeAviones, String nombre, Boolean pistaDoble) {
        this.numeroDeAviones = numeroDeAviones;
        this.nombre = nombre;
        this.pistaDoble = pistaDoble;
    }

    public int getNumeroDeAviones() {
        return numeroDeAviones;
    }

    public void setNumeroDeAviones(int numeroDeAviones) {
        this.numeroDeAviones = numeroDeAviones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getPistaDoble() {
        return pistaDoble;
    }

    public void setPistaDoble(Boolean pistaDoble) {
        this.pistaDoble = pistaDoble;
    }
    
    
    
}
