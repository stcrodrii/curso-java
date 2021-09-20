package clase_Scanner;
import java.util.*;
public class scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // creaccion del objeto (entrada) para pedirle al usuario valores
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);


        System.out.println("introduce tu nombre" );
       String nombreUsuario = entrada.nextLine(); // se pone el tipo de dato en este caso (string) luego el nombre (nombreUsuario) y luego el objetp (entrado).nextline() que es el metodo
       
        System.out.println("introduce tu edad ");
        int edad =entrada.nextInt(); //tip de dato int (edad) el objeto (entrada).nextInt() que es el metodo

        System.out.println("introduce provincia de nacimeinto");
        String lugar =entrada2.nextLine(); // cree otro objeto con nombre (entarda2) 

        System.out.println("edad de tus pádres");
        int edadpadre =entrada2.nextInt();

        System.out.println("nombre de tu mama");
        String nombremama =entrada3.nextLine();

        System.out.println("nombre de usuario : "+nombreUsuario);
        System.out.println("edad del usuario" + edad);
        System.out.println("lugar de nacimiento "+ lugar +". Fecha de nacimento " + (2021-edad));// las operaciones math van entre parentesis para que no creea el programa que e suna concatenacion
        System.out.println("edad de tus pádres es " + edadpadre);
        System.out.println("el nombre de mi mama es " + nombremama);
        

    }

  
    }