package TGN1;
import java.util.LinkedList;

public class Sala {
    private Object Espectador = null;
    private int capacidad;
    private String pelicula;
    private String nombre;
    private LinkedList<Espectador> coleccionEspectadores;

    public Sala(int capacidad, String nombre){
        this.capacidad = capacidad;
        this.nombre = nombre;
        //this.coleccionCarrera = new LinkedList<Carrera>();
        this.coleccionEspectadores = new LinkedList<Espectador>();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Espectador> getEspectadores() {
        // Se debe poder listar los espectadores de una sala, pero en caso de que no
        // haya sido asignada se debe capturar el error emitiendo el mensaje "SIN ESPECTADORES CARGADOS".
//        Scanner scan = new Scanner(System.in);
//        String sala;
//        System.out.printf(" ingrese el la sala a listar");
//        sala = scan.next();

//        if (coleccionEspectadores != null && coleccionEspectadores.size()!= 0){
//            System.out.println("la "+ nombre +" contiene ");
//            System.out.println(coleccionEspectadores.toString());
//        }else{
//            System.out.println("la "+ nombre +" SIN ESPECTADORES CARGADOS");
//        }
//        try {
//            if(coleccionEspectadores.size()!=0) {
//                System.out.println(coleccionEspectadores.toString());
//                int i = 1;
//            }
//
//        }catch (IOException e){
//            System.out.println(" ");
//        }
//        if (i == 0){
//            System.out.println("error");
//        }

//        return null;
        return this.coleccionEspectadores;
    }

    public void setEspectadores(LinkedList<Espectador> espectadores) {
        if (espectadores.size() > this.getCapacidad()) {
            System.out.println("El tamaño de la lista de espectadores es mayor a la capacidad de la Sala");
        } else {
            this.coleccionEspectadores= espectadores;
        }
    }

    public void agregarEspectador(Espectador nuevoEspectador){
        if(this.coleccionEspectadores.size() == this.capacidad){
            System.out.println("Error, sala llena");
        }else {
            this.coleccionEspectadores.add(nuevoEspectador);
        }
    }

    public void listarEspectadores(){
        if (this.coleccionEspectadores == null || this.coleccionEspectadores.size() == 0) {
            System.out.println("Error, la sala "+ this.nombre + " no tiene espectadores");
        }else {
            System.out.println("los espectadores de  "+ nombre +" son: ");
            System.out.println(coleccionEspectadores.toString());
        }
    }


    @Override
    public String toString() {
        return "Salas{" +
                "capacidad=" + capacidad +
                ", pelicula='" + pelicula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", espectadores=" + coleccionEspectadores.toString() +
                '}';
    }


}
