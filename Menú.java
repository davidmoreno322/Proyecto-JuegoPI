package bricker.breaker;

public class Menú {
    
    private int puntuacion=0;
    private String nombre;
    private int nivel;
    
    public Menú() {
    
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void sumarPuntuacion() {
        puntuacion = puntuacion+100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public int getNivel() {
        return nivel;
    }

    public void siguienteNivel() {
        nivel = nivel+1;
    }
    
    
    
    
    
}
