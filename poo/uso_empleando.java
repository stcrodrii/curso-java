package poo;
import java.util.*;


 public class uso_empleando {

    public static void main(String[] args) {// metodo principal

        
 /*
        
    //            PRIMER FORMA 
    empleado empleando1 = new empleado("rodrigo cabral" ,85000 , 1990 , 12 , 17 );
    empleado empleando2 = new empleado("juana ortega" ,95000 , 1995 , 6 , 2 );
    empleado empleando3 = new empleado("oriana molina" ,105000 , 2002 , 3 , 15 );
        
     
    


    empleando1.subeSueldo(5);   
    empleando2.subeSueldo(5);
    empleando3.subeSueldo(5);

    System.out.println("nombre: " + empleando1.dame_nombre() + " sueldo: " + empleando1.dame_sueldo() 
    + " fecha de alta: "  + empleando1.dame_fecha_contrato());

    System.out.println("nombre: " + empleando2.dame_nombre() + " sueldo: " + empleando2.dame_sueldo() 
    + " fecha de alta "  + empleando2.dame_fecha_contrato());

    System.out.println("nombre: " + empleando3.dame_nombre() + " sueldo: " + empleando3.dame_sueldo() 
    + " fecha de alta: "  + empleando3.dame_fecha_contrato());

    

    System.out.println("");
    System.out.println("");
    System.out.println("");

 */
        
        jefatura objJefe1 = new jefatura("carla ", 90000, 1995, 05, 27);
        objJefe1.estableceincentivo(10000);
    // SEGUNDA FORMA ( CON UN ARRAYS)
    empleado [] misEmpleados = new empleado[6];
    misEmpleados[0]=new empleado("rodrigo cabral", 30000, 1990, 12, 17);
    misEmpleados[1]=new empleado("juana ortega", 30000, 1995, 6, 2);
    misEmpleados[2]=new empleado("oriana molina", 30000, 2002, 5, 15);
    misEmpleados[3]=new empleado("catalina morales" ); // correspomde al 2do constructor
    misEmpleados[4]=objJefe1; //    POLIMORFISMO EN ACCION .PRINCIPIO DE SUSTITUCION
    misEmpleados[5]=new jefatura("patricia", 95000, 1990, 05, 20);
    jefatura jefa_finanzas = (jefatura) misEmpleados[5];// refundicion o casting
    jefa_finanzas.estableceincentivo(7000);

    //MOSTRAR LOS DATOS CON UN (FOR) 
    for (int i=0;i<6;i++){
    misEmpleados[i].subeSueldo(5);
    
    }
    for (int i=0 ; i<6 ; i++){
    System.out.println("nombre: " + misEmpleados[i].dame_nombre() + " sueldo: " + misEmpleados[i].dame_sueldo() 
    + " fecha de alta "  + misEmpleados[i].dame_fecha_contrato());
    }
    System.out.println("");
    System.out.println("");
    System.out.println("");
   
 /*
    // MOSTRAR LOS DATOS CON UN (FOR EACH o MEJORADO) 
    for (empleado e: misEmpleados){
   e.subeSueldo(5);  
    }
    for (empleado e : misEmpleados){
    System.out.println("nombre: " + e.dame_nombre() + " sueldo: " + e.dame_sueldo() 
    + " fecha de alta "  + e.dame_fecha_contrato());
    }

    System.out.println("");
    System.out.println("");
    System.out.println("");

*/
    
     

    }
  
}
 class empleado{ // clase empleado
// si agrego (FINAL class empleado ) esto hace que corte la gerarquia de herencia nadie puede heredar de la class empleado 
    
    public empleado (String nom, double sue , int agno ,int mes , int dia ){//cosntructor con parametros
        nombre=nom;
        sueldo =sue ;
        GregorianCalendar calendario =new GregorianCalendar(agno , mes-1, dia);
        altaContrato=calendario.getTime();
    }
    private String nombre ;
    private double sueldo ;
    private Date altaContrato;

    public  String dame_nombre(){ // getter
        return nombre;
    }
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
   
    //      SOBRECARGA DE CONSTRUCTORES
    public empleado (String nom ){// 2do contructor
        this(nom , 30000 , 1995,05,27);


    }





 /*

    class jefatura extends empleado{// 2da class nueca de jefe 

     public jefatura(String nom , double sue , int agno , int mes , int dia){
            
     super(nom , sue , agno,mes,dia); // super es para llamar al costructor 
     }
      public void estableceincentivo (double b){// metodo setter 
         incentivo = b;
     }
      public double dame_sueldo (){
          double sueldoJefe=super.dame_sueldo();
          return sueldoJefe + incentivo;
      }

      private double incentivo ;


}*/

}


