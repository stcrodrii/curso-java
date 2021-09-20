package bucle;
import java.util.*;
public class do_while_prueva {
 public static void main(String[] args) {

    int aleatorio = (int ) (Math.random()*100) ;


    Scanner entrada = new Scanner(System.in);
    //System.out.println("adivina el numero entre el 0 y 100 \nJUGUEMOS");
    //int num1 = entrada.nextInt();
    int numero_para_generar_el_juego = 0;
    int intentos = 0 ; 

   do{  // ejecuta almenos una ves lo que esta dentro y despues mira la condiucion si es true o false
        intentos ++;
        if (numero_para_generar_el_juego  > aleatorio){
            System.out.println("ERROR....el numero es MENOR al que ingresaste \nintenta de nuevo"); 
            numero_para_generar_el_juego = entrada.nextInt();
        }
        else {
            System.out.println("ERROR....el numero es MAYOR al que ingresate \nintenta de nuevo");
            numero_para_generar_el_juego = entrada.nextInt();
        }

    }  while (numero_para_generar_el_juego != aleatorio);
    System.out.println("adivinaste .. " + numero_para_generar_el_juego + "  era el numero");
    System.out.println("encontraste el numero en " + intentos + " intentos");
    
 }   
}
