package polimorfismo;

public class Main {
    public static void main(String[] args) {


// istancia de objetos
        felino animal1 = new felino( "gatito", true);
        tigre animal2 = new tigre("pantera");

// polimorfismo aplivando sobrescritura de metodos y herencia 
        System.out.println( animal1.toString());
        System.out.println( animal2.toString());

    }
}
