package varia_const_opera;
public class variables {

    public static void main(String[] args) {

        //ENTEROS
         int a = 214748673 ; // 4 bytes de espacio desde -2.147.483.648 hasta 2.147.483.647 
         short b = 4565 ; // 2 bytes desde -32768 hasta 32,767  
         long c = 2342423424456L; // 8 bytes , una barbaridad de numeros (se coloca (L) al final ) 
         byte d = 123 ; //1 bytes desde -128 hasta 127

        //COMA FLOTANTE 
        float e = 3.454455F; // 4 bytes despues de la coma 6 o 7 cifras sifnificativas (colocar(f) al final) 
        double f = 3.3454345345345; //8 bytes despues de la coma hasta 15 cifras significativas

        char g = 'a' ; //para escribir caracteres 
        boolean h = true ; // variable logita (solo puede ser true o false)

        System.out.println(a); //mostras algo por pantalla
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(" estas son algunas de las variables ");

         
    }
}