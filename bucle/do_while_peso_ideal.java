package bucle;
import javax.swing.*;
import java.util.*;
public class do_while_peso_ideal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String hombre = JOptionPane.showInputDialog(" introduce 1 : si eres hombre \n2 : si eres mujer ");
        int num1 = Integer.parseInt(hombre);
        int altura = 0;
        int alturamujer = 0;

        switch (num1){

            case 1: do {
                System.out.println("introduce tu altura , ej si mides 1.80cm COLOCA 180");
                  altura = entrada.nextInt();
                //System.out.println("introduce tu peso ");
                //int peso = entrada.nextInt();
                System.out.println("tu peso ideal es  " + (altura - 110));
                 } 
                 while (altura < 50 && altura > 300);
            break;     
            case 2: do {
                System.out.println("introduce tu altura , ej si mides 1.80cm COLOCA 180");
                alturamujer = entrada.nextInt();
                System.out.println("tu peso ideal es " + (alturamujer - 120));
                     } 
                     while (alturamujer < 90 && alturamujer > 350);
            break;         


        } 

                
          
            
    }
}
