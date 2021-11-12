package princSustCasteo;

public class tigre extends felino{
    

    public tigre ( String especie ){
        super(especie , false); // hace referencia al costrctor de la clse padre
    }

    public String toString (){
        return this.getEspecie() ;
    }
   
}