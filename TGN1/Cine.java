package TGN1;
import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {


        //Se debe poder listar los espectadores de una sala, pero en caso de que no haya
        // sido asignada se debe capturar el error emitiendo el mensaje
        // "SIN ESPECTADORES CARGADOS".
        System.out.println("prueba de cargar una sala sin expectadores");
        Salas sala02 = new Salas(40, "salaB");
        sala02.getEspectadores();

        //Cargar espectadores pidiendo los nombre, edad, fila y silla al usuario por medio de la consola.
        // En caso de que el usuario ingrese letras en lugar de números donde no corresponda el
        // programa debe finalizar con el error: "ERROR EN EL INGRESO DE DATOS".
        Scanner sc = new Scanner(System.in);
        int x=0;
        int cont=1;
        Espectador espectador1 = new Espectador("",0,"",0);
        Espectador espectador2 = new Espectador("",0,"",0);
        Espectador espectador3 = new Espectador("",0,"",0);
        String nombre="";
        String fila="";
        int edad=0,silla=0;



        while (x==0){
            System.out.println("Ingrese el nombre del espectador");
            nombre = sc.next();

            System.out.println("Ingrese la edad");
            try {
                edad = sc.nextByte();
            }catch (Exception e){
                System.out.println("ERROR EN EL INGRESO DE DATOS");
                cont--;
            }

            System.out.println("Ingrese la Fila");
            fila = sc.next();

            System.out.println("Ingrese la Silla");
            try {
                silla = sc.nextByte();
            }catch (Exception e){
                System.out.println("ERROR EN EL INGRESO DE DATOS");
                cont--;
            }

            if (cont==1){
                espectador1.setFila(fila);
                espectador1.setNombre(nombre);
                espectador1.setSilla(silla);
                espectador1.setEdad(edad);
            }else{
                if (cont==2){
                    espectador2.setFila(fila);
                    espectador2.setNombre(nombre);
                    espectador2.setSilla(silla);
                    espectador2.setEdad(edad);
                }else {
                    espectador3.setFila(fila);
                    espectador3.setNombre(nombre);
                    espectador3.setSilla(silla);
                    espectador3.setEdad(edad);
                }
            }

            cont++;


            System.out.println("desea agregar un nuevo espectador ingrese (0) de lo contrario culauier otro valor");

            int opcion = sc.nextInt();
            if (opcion==0){
                x++;
            }else{
                System.out.println("ADVERTENCIA si el numero de espectadores es mayor a 3 se reemplazara el ultimo espectador cargado");
            }


        }
        // Por medio del código crear una sala con capacidad para 3 personas
        // llamada “Sala 01” en donde se proyecte la película “Jocker”.
        Salas sala01 = new Salas(3, "Sala 01");
        sala01.setPelicula("Jocker");
        sala01.setEspectadores(espectador1);
        sala01.setEspectadores(espectador2);
        sala01.setEspectadores(espectador3);
        //Imprimir la lista de espectadores que se encuentran asignado a la sala.
        System.out.println("los espectadores que se encuentran en la sala son: ");
        sala01.getEspectadores();
        //Crear un acomodador por medio del código.
        Acomodador acomodador01 = new Acomodador("Juan Perez",50,0,sala01);
        //Asignar a dicho Acomodador la sala creada anteriormente.
        acomodador01.setSala(sala01);
        //Asignar un sueldo de $50.000 al Acomodador.
        acomodador01.setSueldo(50.000);
        //Mostrar los datos del Acomodador en la consola.
        System.out.println("El acomodador de la Sala 01 es:");
        System.out.println(acomodador01.toString());
        //Crear un Empleado.
        Empleado empleado01 = new Empleado("Jorge Medina",50,0);
        //Mostrar los datos del Empleado.
        System.out.println(empleado01.toString());


    };
}
