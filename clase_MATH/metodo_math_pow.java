package clase_MATH;

public class metodo_math_pow {
    public static void main(String[] args) {

        /*la CLASE MATH.POW(BASE,EXPONETE) 
        esta clse sirve para sacar POTENCIAS 
        ej: 5 elevado a 3  = 125
         
        esta clase para la base te pide un tipo de dato DOUBLE y para el exponente 
        lo mismo un tipo de dato DOUBLE y el resultado que devuelve es un tipo de dato 
        DOUBLE 
        ej: 5 elevado a 3 = 125 
        5 tiene que ser de tipo DOUBLE 
        3 tiene que ser de tipo DOUBLE 
        125 tiene que ser de tipo DOUBLE 

        en caso de qquerer que 125 sea un resultado de tipo int o otro 
        lo que devemos hacer es una REFUNDICION que lo que hace es convertir ese 
        resultado de tipo DOUBLE  a uno de tipo INT
        */
        
        double base = 5 ;
        double exponente = 3 ;
        double resultado = Math.pow(base,exponente) ; // esto es usando el tipo de dato DOUBLE como resultado
        System.out.println("el sesultadio de la potencia 5 elavdo a 3 es " + resultado);

        double bas = 5 ;
        double exponent = 3 ;
        int resultado2 =(int) Math.pow(bas,exponent) ; //utilizamos la REUTILIZACION para trasformar el resultado en un tipo de dato INT y no DOUBLE
        System.out.println("el sesultadio de la potencia  " +bas+ " elavado a  "+ exponent + "  es " + resultado2); // utilice CONCATENACION


        

    }
}
