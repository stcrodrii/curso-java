package bucle;
import java.util.*;
public class for_ejercicios {
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);

         boolean arroba = false ; 

         System.out.println("introduce tu mail");
         String mail = entrada.nextLine();

         for (int i = 0 ; i<mail.length() ; i++){

            if (mail.charAt(i)=='Q'){
                arroba = true;

            }

         }
         if (arroba==true){
             System.out.println("es correcto ");
         }
         else {
             System.out.println("no es correcto");

         }

    



    }
}
