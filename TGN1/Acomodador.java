package TGN1;
public class Acomodador extends Empleado implements ParaAcomodadores{
    private Salas sala;

    @Override
    public String toString() {
        return "Acomodador{" +
                "sala=" + sala +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public Acomodador(String nombre, int edad, double sueldo, Salas sala){
        super(nombre, edad,sueldo);
        this.sala= sala;
    }


    @Override
    public String getTipo() {
        return "Acomodador";
    }

    @Override
    public Salas getSala() {
        return sala;
    }

    @Override
    public void setSala(Salas sala) {
        this.sala=sala;
    }

}
