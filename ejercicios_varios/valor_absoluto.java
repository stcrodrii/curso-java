package ejercicios_varios ;
import java.util.*;
public class valor_absoluto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su numero");
        int num1 = entrada.nextInt();

        if (num1>0){
            System.out.println("el valor absoluto de es " +num1);

        }
        else if (num1<0 ){
            System.out.println( num1 = num1 * -1 );
            System.out.println( "el valor absoluto es "+num1);

        }

    }
}
