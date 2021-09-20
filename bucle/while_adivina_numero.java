package bucle;
import java.util.*;

public class while_adivina_numero {
    public static void main(String[] args) {


        // MANERA 1 DE GENERAR UN NUMERO ALEATORIO
        int aleatorio = (int ) (Math.random()*10) ; //refundicion .. convertir un tipo de dato en otro
        //System.out.println(aleatorio); 

        //MANERA 2 DE GENERAR UN NUMERO ALEATORIO
        // System.out.printf("%1.0f", (Math.random()*100)); 
        // Math.randon() es el metodo para generar un numero aleatorio entre el o y 1 
        // si queresmos que el numero randon sea entre 0 y 100 tenemos que multiplicarle por 100 para desplazar la coma
        // usamos el printf(%1.0,) para decirle que me muestre despues de la coma la cantidad de numero que quiero ver

        Scanner entrada = new Scanner(System.in);
       System.out.println("adivina el numero entre el 0 y 100 \nJUGUEMOS");
        int num1 = entrada.nextInt();
        int intentos = 0 ; 

        while (num1 != aleatorio){ 
            intentos ++;
            if (num1>aleatorio){
                System.out.println("ERROR....el numero es MENOR al que ingresaste \nintenta de nuevo");
                num1 = entrada.nextInt();
            }
            else {
                System.out.println("ERROR....el numero es MAYOR al que ingresate \nintenta de nuevo");
                num1 = entrada.nextInt();
            }

        }
        System.out.println("adivinaste .. " + num1 + "  era el numero");
        System.out.println("encontraste el numero en " + intentos + " intentos");
        
        
    }
}
