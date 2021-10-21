package TGN1;
public class Acomodador extends Empleado implements ParaAcomodador {
    private Sala sala;

    public Acomodador(String nombre, int edad){
        super(nombre, edad);
        
    }


    @Override
    public String getTipo() {
        return "Acomodador";
    }

    @Override
    public Sala getSala() {
        return sala;
    }

    @Override
    public void setSala(Sala sala) {
        this.sala=sala;
    }

}
