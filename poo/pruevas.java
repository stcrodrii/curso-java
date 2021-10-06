package poo;
public class pruevas {
    public static void main(String[] args) {
        
        empleados trabajador1=new empleados ("rodrigo cabral");
        empleados trabajador2=new empleados ("juana ortega");
        empleados trabajador3=new empleados ("ANTONIO Peres");
        empleados trabajador4=new empleados ("patrica rodriguez");

        trabajador1.cambiaseccion("caja");
        trabajador2.cambiaseccion("reparto");

        //esto esta mal , no se deveria cambair el valor inicial .. para eso se una un FINAL ( una constante)
       // trabajador1.cambiaNombre("pedro alfonzo");// cambie el nombre inicial de " rodrigo cabral " a  "pedro alfonso"


        System.out.println(trabajador1.devuelve_dato()+ "\n" +trabajador2.devuelve_dato() + "\n" 
        +trabajador3.devuelve_dato() + "\n" +trabajador4.devuelve_dato() );
    


      //  empleados.dameIdSiguiente(); // como use un (public static) a la hora de usar este metodo que es estatico tengo usar la clase y despues el metodp( empleados.dameIdSiguiente)
        System.out.println(empleados.dameIdSiguiente());//cuando muestro por pantalla como es static debo poner la clase delante del metodo 


    }



}
class empleados {

    private final String nombre ;
    private String seccion ;
    private int Id;
    private static int IdSiguiente =1 ;  // variable estatica ( el objeto no tiene una copia de esta variable )
    
    public empleados (String nom){ //costructor
      
        nombre = nom ;
        seccion = "administracion";
        Id = IdSiguiente;
        IdSiguiente ++;
    }
    public static String dameIdSiguiente (){
        return "Id Siguiente es : " + IdSiguiente;
    }

    public void cambiaseccion (String seccion ){
        this.seccion = seccion ; 
    }

   public String devuelve_dato(){
       return "el nombre es: " + nombre +"\n"+  " y la seccion es: "+ seccion + "\n" + "el ID es = " + Id ;
   }

   

   
    
    // public void cambiaNombre (String nombre){
    //     this.nombre = nombre;
    //}



}