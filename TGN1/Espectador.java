package TGN1;
public class Espectador extends Persona {
    private String fila;
    private int silla;

    public Espectador(String nombre, int edad, String fila, int silla){
        super(nombre,edad);
        //this.nombre = nombre;
        //this.edad = edad;
        this.fila = fila;
        this.silla = silla;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public String getButaca(){
        return (this.fila + this.silla);
    }


    @Override
    public String toString() {
        return "Espectador{" +
                "fila='" + fila + '\'' +
                ", silla=" + silla +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public String getTipo() {
        return "Espectador";
    }
}
