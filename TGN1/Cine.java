package TGN1;

import java.util.*;

public class Cine {
    public static void main(String[] args) {


        //Se debe poder listar los espectadores de una sala, pero en caso de que no haya
        // sido asignada se debe capturar el error emitiendo el mensaje
        // "SIN ESPECTADORES CARGADOS".
        System.out.println("prueba de cargar una sala sin expectadores");
        Sala sala02 = new Sala(40, "salaB");
        sala02.listarEspectadores();

        //Cargar espectadores pidiendo los nombre, edad, fila y silla al usuario por medio de la consola.
        // En caso de que el usuario ingrese letras en lugar de números donde no corresponda el
        // programa debe finalizar con el error: "ERROR EN EL INGRESO DE DATOS".
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        LinkedList<Espectador> listadeEspectadores = new LinkedList<>();
        while(continuar){
            System.out.println("ingrese nombre del espectador \n");
            String nombre = sc.next();
            int edad = 0;
            System.out.println("ingrese la edad del espectador \n");
            try {
                edad = sc.nextInt();
            } catch (Exception e){
                System.out.println("el valor ingresado debe ser un numero");
                return;
            }
            int silla =0;
            System.out.println("ingrese la silla del espectador \n");
            try {
                silla = sc.nextInt();
            } catch (Exception e){
                System.out.println("el valor ingresado debe ser un numero");
                return;
            }
            System.out.println("ingrese la fila del espectador \n");
            String fila = sc.next();
            Espectador nuevoEspectador = new Espectador(nombre, edad, fila, silla);
            listadeEspectadores.add(nuevoEspectador);
            System.out.println("¿Desea agregar mas espectadores? S/N");
            String respuesta = sc.next();
            if (!respuesta.toLowerCase().equals("s")){
                continuar = false;
            }
        }

        // Por medio del código crear una sala con capacidad para 3 personas
        // llamada “Sala 01” en donde se proyecte la película “Jocker”.
        Sala sala01 = new Sala(3, "Sala 01");
        sala01.setPelicula("Joker");
        sala01.setEspectadores(listadeEspectadores);
        //Imprimir la lista de espectadores que se encuentran asignado a la sala.
        System.out.println("los espectadores que se encuentran en la sala son: ");
        sala01.listarEspectadores();
        //Crear un acomodador por medio del código.
        Acomodador acomodador01 = new Acomodador("Juan Perez",50);
        //Asignar a dicho Acomodador la sala creada anteriormente.
        acomodador01.setSala(sala01);
        //Asignar un sueldo de $50.000 al Acomodador.
        acomodador01.setSueldo(50000);
        //Mostrar los datos del Acomodador en la consola.
        
        System.out.println("El acomodador de la Sala 01 es:");
       System.out.println( acomodador01.toString());
        //Crear un Empleado.
        Empleado empleado01 = new Empleado("Jorge Medina",50);
        //Mostrar los datos del Empleado.
       empleado01.toString();




    };
}
