import javax.swing.*;
public class pedir_rrelenar_arrays {
    public static void main(String[] args) {
        String [] paises = new String [5];

        for (int i=0 ; i<5 ; i++){ // se coloca la i< "la cantidad de numeros en el arreglo"
            paises[i]=JOptionPane.showInputDialog("introduce el pais : " );
        }


        for (String elementos:paises){
            System.out.println(elementos);
        }
        
    }
}
