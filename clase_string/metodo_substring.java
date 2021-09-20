package clase_string;
public class metodo_substring {
    public static void main(String[] args) {


     /* METODO SUBSTRING(X,Y) devuelve una subcadena dentro de la cadena , siendo x el caracter a partir del cual se extrae
      e y el numero de caracteres que se  quiere extraer */


      String texto = "hola que hermoso dia para aprender a programar  " ;
      String resumen_texto = texto.substring(26,46); // el primer parametro que le paso es desde que pocicion 
      System.out.println(resumen_texto);           //qiero extraer el texto y el 2do parametro es hasta donde quiero extraer
      System.out.println(resumen_texto + " EN 2021"); // al resultado de la cadena extraida le concatene " EN 2021"








    }
}