package ejercicios_varios ;
import java.util.*;
public class numero_mayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(" ingresar el primer numero");
        int num1 = entrada.nextInt();
        System.out.println(" ingresar el segundo numero");
        int num2 = entrada.nextInt();

        if (num1>num2){
            System.out.println(num1 + " es mayor que " + num2);
        }
        else if (num1 == num2) {
            System.out.println("los numero ingresados son iguales");
            System.out.println("los numero son " + num1 +" y " + num2 );
        }
        else {
            System.out.println(num2 + " es mayor que " + num1);
        }
    }
}
