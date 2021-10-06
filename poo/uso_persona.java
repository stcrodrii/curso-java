package poo;
import java.util.*;
public class uso_persona {
    public static void main(String[] args) {

        persona [] laspersonas = new persona [2];
        laspersonas [0] = new empleado2("rodrigo", 50000, 1995, 05, 27);
        laspersonas [1]=new alumno("elias", " T.U.P");

//(for)  nombre de variable (e) : nombre del arrays ( laspersonas)
                for (persona e : laspersonas){
            System.out.println(e.dame_nombre() + " , " + e.dame_descripcion());
        }
        
    }



}

 abstract class persona { // clase abstracta

         public persona (String nom){
            nombre = nom ;
         }

         public String dame_nombre() {
             return nombre ;
         }

         public abstract String dame_descripcion (); // metodo ABSTRACT

    private String  nombre ;
}


 class empleado2 extends persona{ // clase empleado (pero le tube que agregar abstract xq hereda de la clase persona y perosna es una clase abstracta )
    // si agrego (FINAL class empleado ) esto hace que corte la gerarquia de herencia nadie puede heredar de la class empleado      
    public empleado2 (String nom, double sue , int agno ,int mes , int dia ){//cosntructor con parametros
            super(nom); // llame al costructor de la clase padre ( clss persona )
            //nombre=nom;
            sueldo =sue ;
            GregorianCalendar calendario =new GregorianCalendar(agno , mes-1, dia);
            altaContrato=calendario.getTime();
     }
        //private String nombre ;
        private double sueldo ;
        private Date altaContrato;
        private int Id;
        private static int IdSiguiente = 1 ;

 /*
        public  String dame_nombre(){ // getter
            return nombre;
           }
*/
    
        public double dame_sueldo (){ // si agrego ( public FINAL double ) el metodo se vuelve unico y nadie mas puede reutilixarlo ni heredando de la clase 
            return sueldo ;
            }
        public Date dame_fecha_contrato (){
            return altaContrato ;
           }
    
    
        public void subeSueldo (double porcentaje){ //setter
            double aumento = sueldo *porcentaje/100;
            sueldo += aumento; // +=  aumentar el sueldo ya estblecido con el porcentaje de recien 
            }

         public static String dameIdSiguiente (){
             return "Id Siguiente es : " + IdSiguiente;
         }   

            /*
       
        //      SOBRECARGA DE CONSTRUCTORES
        public empleado (String nom ){// 2do contructor
            this(nom , 30000 , 1995,05,27);
            }
            */

            public String dame_descripcion (){
                return "este empleado tiene un Id= " + IdSiguiente + " \n " + " con un sueldo de = " + sueldo;
            }




 }

 class alumno extends persona{

    public alumno (String nom , String car){

        super(nom);

        carrera = car;
    }

    public String dame_descripcion (){
        return " este alumno esta estudiando la carrera de = " + carrera ;
    }


    private String carrera ;


 }