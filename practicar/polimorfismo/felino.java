package polimorfismo;
public class felino {
    private String especie ;
    private boolean domestico ;
 
    public felino (String especie ,  boolean domestico ){
        this.especie = especie ;
        this.domestico = domestico ;

    }

    public String getEspecie (){
        return especie ;
    }

    public String toString (){
        return "la especie es = " + especie + " //   ¿es domestico ? = " + domestico ;
    }

}