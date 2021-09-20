package bucle;
import javax.swing.JOptionPane;

public class for_factorial {
    public static void main(String[] args) {
        long resultado = 1L ; 
        int numero =Integer.parseInt(JOptionPane.showInputDialog("introduce un numero para obtener el factorial"));
        for (int i=numero;i>0;i--){
            resultado = resultado*i;

        }
        System.out.println("el factorial del "+numero+" es "+ resultado);
    }
}
