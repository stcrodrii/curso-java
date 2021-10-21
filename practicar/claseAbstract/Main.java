package claseAbstract;
public class Main {
    public static void main(String[] args) {

        // istanciamiento de los objetos
        animal perro = new animal() ;
        persona humano = new persona();
        


        // es el mismo metodo pero como es abstracto retorna valores distinto
        perro.moverse();
        humano.moverse();


       System.out.println("el perro se trasporta  "+ perro.moverse());
       System.out.println("el humano se trasporta " +humano.moverse());

    }
}
