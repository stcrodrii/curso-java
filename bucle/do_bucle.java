package bucle;
import java.util.*;
import javax.swing.*;
public class do_bucle {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String genero = "" ;
        do {
            genero =JOptionPane.showInputDialog("introduce tu genero (H/M)");

        }while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
    
            if (genero.equalsIgnoreCase("H")) {
                System.out.println("introdusca su altura en cm ");
                int peso = entrada.nextInt(); 
                System.out.println(peso - 110 +" peso ideal");
            }
            else if (genero.equalsIgnoreCase("m")){
                System.out.println("introdusca su altura en cm ");
                int peso = entrada.nextInt(); 
                System.out.println(peso - 10 +" peso ideal");
            }
    
    
        
    }






}
