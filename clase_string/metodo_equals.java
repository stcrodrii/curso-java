package clase_string;
public class metodo_equals {
    public static void main(String[] args) {
        
        
        /*METODO EQUALS 
        devulve true si dos cadenas que se comapran son iguiales y false si no lo son . 
         distingue mayusculas y minuscculas*/

    String texto1 = "hola rodrigo" ; 
    String texto2 = "hola rodrigo"; 
    String texto3 = "Hola rodrigo"; // el (Hola) esta con mayuscula
    String texto4 = "hola rodrigo jose bernave";
    System.out.println(texto1.equals(texto2)); // es true xq las 2 cadenas son iguales 
    System.out.println(texto2.equals(texto3)); // es false xq si bien las 2 cadenas son iguales (texto 2) tiene mayuscula 
    System.out.println(texto3.equals(texto4)); // es false xq las cadenas dicen cosas distintas 


    }
}
