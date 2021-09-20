package condicionales;
import java.util.*;
import javax.swing.*;
public class areas_figuras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("elije una opcion : \n1:cuadrado \n2:rectangulo \n3:triangulo \n4:circulo");
        int figura = entrada.nextInt();
    

        switch (figura){
            case 1: int lado = Integer.parseInt(JOptionPane.showInputDialog("introduce lado"));
            System.out.println("el rea del cuadrado es " + Math.pow(lado , 2));
            break;

            case 2: int base = Integer.parseInt(JOptionPane.showInputDialog("introduce el lado"));
            int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
            System.out.println("el area del rectangulo es " + base * altura);
            break;

            case 3: int base3 = Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
            int altura3 = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
            System.out.println(  " el area del tringulo es " + (base3 * altura3) / 2  );
            break;
            
            case 4: int radio = Integer.parseInt(JOptionPane.showInputDialog("introduce el radio"));
            System.out.println(" el area del circulo es");
            System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2))); // printf es para deter,inar los decimales
            break;

            default: System.out.println(" la opcion ingresada NO corresponde con ninguna figura ");
            break;
        }
    }
}