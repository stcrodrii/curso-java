package claseAbstracEj2;
public class Main {
    public static void main(String[] args) {

        circulo figura1 = new circulo(12); // objeto de la clase circulo
        rectangulo figura2 = new  rectangulo(10 , 10); // objeto de  la clase rectangulo 


        // metodo abstract areas() que correstonde a la clase   CIRCULO
        System.out.println(figura1.areas()); 


         // metodo abstract areas() que correstonde a la clase RECTANGULO
        System.out.println(figura2.areas()); 
     

     
    }
}
