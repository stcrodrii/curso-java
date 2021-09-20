package clase_Scanner;
import javax.swing.*;

public class metodo_JOptionpane {
    public static void main(String[] args) {


        String nombre=JOptionPane.showInputDialog("introduce tu nombre , porfa") ;// muestra una ventana que dice "intr tu nombre" 
        String  edad = JOptionPane.showInputDialog("intruduce tu edad ") ; // muestra un aventana que dice " intr tu edad"
        int edad_usuario = Integer.parseInt(edad); // trasforma mi variable "edad" de tipo String a una varaible de tipo int "edad_usuario "
        //                 (Clase) - (metodo)

        edad_usuario ++ ; //incremento la edad en 1  
        /* += n ; esto hace un incremnto con el numero que le pasemos 
        ej : si hago 5 +=2 ; (el resultado es "7") xq le dije que incremnte 2  */


        System.out.println("tu nombre es " + nombre);
        System.out.println("tu edad es "  +edad+ " y el año que viene vas a cumplir "+ edad_usuario); 

        
    }
}
