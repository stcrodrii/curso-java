package coleccionDeObjetos;
public class salas {
    // atrivutos 
    private int capacidad ;
    private String pelicula ;
    private String nombre ;
    private int espectadores[];


    // cosntructor
    public salas (int capacidad , String nombre){
        this.capacidad = capacidad ;
        this.nombre = nombre ;
    }

    //metodo setter
    public void setPelicula (String pelicula ){
        this.pelicula = pelicula ;
    }
   
    //metodo toString
    public String toString (){
        return " las capacidad es : " +this.capacidad +" // El nombre es :" +this.nombre ;
    }
   
  
}