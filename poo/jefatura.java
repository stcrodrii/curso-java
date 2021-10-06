package poo;

 class jefatura extends empleado{// 2da class nueca de jefe 

    public jefatura(String nom , double sue , int agno , int mes , int dia){
           
    super(nom , sue , agno,mes,dia); // super es para llamar al costructor 
    }
     public void estableceincentivo (double b){// metodo setter 
        incentivo = b;
    }
     public  double dame_sueldo (){
         double sueldoJefe=super.dame_sueldo();
         return sueldoJefe + incentivo;
     }

     private double incentivo ;


   }

   
    