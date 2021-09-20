package clase_string;

public class metodo_length_charAt {

    public static void main(String[] args) {


         /*CLASE  STRING 
         ¿ como almacebnar una cadena de caracteres ?
         - String  mi_nombre = "rodrigo" ;  ( donde  MI_NOMBRE es un objeto (istancia , ejemplar ) de la clase string )

         METODOS MAS USADOS DE LA CLASE STRING 
         
         -length(): devulve la longitud de una cadeba de caracteres 
         
         -charAt(n): devuelve la pociicon de una caracter dentro de una cadena . (las pociciones empiezan a contar desde o) (hay que colocar la posicion en el parentesis)
         
         -substring(x,y): devuelve una subcadena dentro de la cadena , siendo x el caracter a partir del cual se extrae
         e y el numero de caracteres que se  quiere extraer 
         
         -equals(cadena) : devulve true si dos cadenas que se comapran son iguiales y false si no lo son . 
         distingue mayusculas y minuscculas 
         
         -equalsIgnorecase(cadena) : es igual a la anterior pero no distingue entre minusculas y mayusculas

         */


        String nombre = "rodrigo" ; 
        System.out.println("mi nombre es " + nombre);
        System.out.println("mi nombre tiene " + nombre.length() + " letras"); //METODO .length()
        System.out.println("la primera letra de mi nombre es la    "  +  nombre.charAt(0));// METODO .charAt(n) primera posicion 
       
        int ultima_letra ; 
        ultima_letra= nombre.length();
        System.out.println("la ultima letra de mi nombre es la  " + nombre.charAt(ultima_letra-1) ); //METODO .charAt(n)
        // va (-1) xq en la pocicion 6 esta la ultima letra y la variable (ultima_letra) es un 7 


    }

}