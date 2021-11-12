package princSustCasteo;
public class leon extends felino {
    

    public leon (String especie){ // costructor
        super(especie , true); // super que hace referencia a la clase felino
    }


    public String toString (){
        return this.getEspecie() ;
    }
   
}
