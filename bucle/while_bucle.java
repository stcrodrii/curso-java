package bucle ;
import javax.swing.*; // es para el JOptionPane.showInputDialog(" ");
public class while_bucle {
    public static void main(String[] args) {
      
        String clave = "rodrigo1";

       String pass = JOptionPane.showInputDialog(" introduce la contraseña");

        while ( clave.equals(pass)==false){  //mientras la condicion sea falsa se repetira el ciclo hasta que sea verdadera
            pass = JOptionPane.showInputDialog("introduce de nuevo la contraseña , por favor");
        }

        String ver_pass = JOptionPane.showInputDialog("contraseña CORRECTA \n oprima \n1:si quiere ver la contraseña \n2:si NO quiere verla");
        int num = Integer.parseInt(ver_pass); // pasar lo que esta en (ver_pass) que es un string a una varible de tipo int para operarla

        switch (num) {
            case 1:  System.out.println("la contraseña es " + pass);
            break;
            default : 
        }

    }
}
