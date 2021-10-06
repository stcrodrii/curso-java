package ejercicios_varios ;
import java.util.*;
import javax.swing.*;
public class dias_semanas
 {
    public static void main(String[] args) {

        String tex1 = "lunes";
        String tex2 = "martes";
        String tex3 = "viernes";
        String tex4 = " .ESTE DIA SE HACE DIETA";
        String tex5 = "HOY ES TU DIA PERMITIDO.. PUEDES COMER LO QUE QUIERAS";
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el dia de la semana");

        String dia1 = entrada.nextLine();

        if (dia1.equals(tex1)){
            System.out.println("hoy es " +dia1+ tex4+" .el menu del dia es 'ensaladas'");
        }
      else if (dia1.equals(tex2)){
        System.out.println("hoy es " +dia1+ tex4+".el menu del dia es 'pollo con papas'");
      }
       else if (dia1.equals(tex3)){
        System.out.println("hoy es "+dia1+ tex4+". el menu del dia es 'atum con huevos'");
       }
       else {
        System.out.println(tex5);
       }
    }
}
