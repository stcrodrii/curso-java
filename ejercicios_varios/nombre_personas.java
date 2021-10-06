package ejercicios_varios;
import java.util.*;
public class nombre_personas {
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);

        System.out.println("ingrese 1er nombre ");
        String tex1=entrada.nextLine();
        System.out.println("ingrese 2do nombre ");
        String tex2=entrada.nextLine();
        int ultima_letra = tex1.length();
        int ultima_letra2 = tex2.length();

     
        //     MANERA 1 : FUNCIONA PERO LA CONDICION ES MUY LARGA Y PODRIA CONFUNDIR

      if (tex1.charAt(0) == tex2.charAt(0) && (tex1.charAt(ultima_letra -1 ) == (tex2.charAt(ultima_letra2 - 1))) ){

            System.out.println("COINCIDENCIA");
        }

        else {
            System.out.println(" NO HAY COINCIDENCIA");
        } 



        //   MANERA 2 : FUNCIONA Y TENEMOS 2 CONDICONES PARA QUE NO SE CONFUNDA TANTO ( es mas eficiente)


        if (tex1.charAt(0) == tex2.charAt(0) ){

        
         if (tex1.charAt(ultima_letra -1 ) == (tex2.charAt(ultima_letra2 - 1))) 

            System.out.println("COINCIDENCIA");
        }
          else {
            System.out.println(" NO HAY COINCIDENCIA");
          }
        

        

        
    }
}
