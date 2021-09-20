package clase_string;
public class metodo_equalsIgnoreCase {
    public static void main(String[] args) {
         
        /*METODO .equalsIgnoreCase() 
        es igual al METODO EQUALS  pero  este no nodistingue entre minusculas y mayusculas a la hora
       de comparar cadenas de caracteres */

       String texto1 = "hola rodrigo" ; 
       String texto2 = "hola rodrigo"; 
       String texto3 = "Hola rodrigo"; // el (Hola) esta con mayuscula
       System.out.println(texto1.equalsIgnoreCase(texto2)); // da true xq las 2 cadenas son iguales 
       System.out.println(texto2.equalsIgnoreCase(texto3)); // da true xq son iguales y NO DISTINGUE ENTRE MAYUSCULAS Y MINUSCULAS


    }
}
