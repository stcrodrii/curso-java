package condicionales;
import java.util.*;
import javax.swing.*;
public class cond_if {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);



    String nombre =JOptionPane.showInputDialog("introduce tu nombre");
    String edad =JOptionPane.showInputDialog ("introduce tu edad");
    int edad_u = Integer.parseInt(edad);
    //System.out.println("introduce tu nombre");
    //String nombre = entrada.nextLine();

   // System.out.println("introduce tu edad"); 
    //int edad = entrada.nextInt() ;

 
    if (edad_u>21 && edad_u<=40) {//condicion a evaluar 
        System.out.println(nombre +" ..usted es joven y su fecah de nacimento es " + (2021-edad_u));
        }
    
    
        else if (edad_u>21 && edad_u >40 && edad_u <70 ){
            System.out.println(" .. usted ya es mayor y su fecah de nacimento es " + (2021-edad_u)); 
    
        }
    
        else if (edad_u > 21 && edad_u >= 70){
            System.out.println(nombre + "... usted ya es anciano.mucho cuidado y su fecah de nacimento es " + (2021-edad_u));
    
        }
       else {
        System.out.println(nombre +".. es MENOR de edad y su fecah de nacimento es " + (2021-edad_u));
       }

    

    }
}
