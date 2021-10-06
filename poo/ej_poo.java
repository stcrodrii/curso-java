package poo;

public class ej_poo { // la clase

    // el private emcapsula 
    String nombre2 ; 
    private String nombre ;
    private int edad ;
    private double estatura ;
    private char sexo ;
    private boolean sobrePeso ;
    private boolean estudiante ;


    //constructor sin parametros (  this hace referencia a las varaibles de esata clase)
    public ej_poo (){
        nombre2 = "rodri22";
        nombre = "rodri";
        edad = 26;
        estatura = 1.7;
        sexo= 'm';
    }
    //constructor con parametros
    //public persona(String nombre, int edad , double estatura , char sexo ){

    //}
    //ACCESADORES

    // metodo getter
    public String dime_nombre(){ 
        return nombre;
    }

    public int dime_edad(){
        return edad;
    }  

    public double dime_estaruta (){
        return estatura;
    }

    public char dime_sexo(){
        return sexo;
    } 
    public String dime_todos_los_datos (){
        return " todos los datos es una linea son \n" + "mi nombre es "+ nombre +"\n"+ "mi edad es " +edad+"\n" +"mi estatura es "+ estatura +"\n"+ "mi sexo es "+sexo ;
    }

    //metodo setter 

    public void nombre_usuario (String cambiar_nombre ){
        nombre= cambiar_nombre; 
    }
    public void edad_usuario ( int cambiar_edad){
        edad= cambiar_edad;
    }
    public void estatura_usuario(double cambiar_estatura){
        estatura = cambiar_estatura;
    }
    public void sexo_usuario (char cambiar_sexo){
        sexo = cambiar_sexo;
    }





    //metodo setter para PASARLE valores
    public void configuraSiTieneSobrePeso ( String sobrePeso){
        if (sobrePeso.equals("si")) {
            this.sobrePeso=true;//  this hace referencia a la variable de la clase y NO al argumento
        }else {
            this.sobrePeso=false;
        }

    }
    //metodo getter para MOSTRAR valores 
    public String dime_si_tengo_sobrePeso (){
        if(sobrePeso==true){ // if(sobrePeso==true) es lo mismo 
            return "tu tienes sobre peso";
        }else{
            return "tu no tienes sobre peso";
        }
    }

    //metodo setter
    public void configu_si_eres_estudiante(String estudiante){
        if (estudiante.equalsIgnoreCase("si")){
            this.estudiante=true ;
        }else{
            this.estudiante=false;
        }

    }
    //metodo getter
    public String dime_eres_estudiante (){
        if(estudiante==true){
            return "usted ES estudiante de la utn";
        }else{
            return "usted NO ES estudiante de la utn";
        }
    }




 
    

}

