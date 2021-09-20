package clase_MATH;

public class metodo_math_round {
    public static void main(String[] args) {
/*CLASE Math.round (n) ; 
esta clase lo que hace es REDONDEAR un numero x 
. el numero que ingresemos tiene que serun float y el resultado sera un int 
 */

        float num1 = 5.87F ; 
        int resultado = Math.round(num1);
        System.out.println(resultado);



        double num2 = 3.45 ; 
        int resultado2 = (int)Math.round(num2) ; //utilice REFUNDICION en esta line de long a int 
        System.out.println(resultado2) ; 
        


 }
}
