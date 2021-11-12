package princSustCasteo;


public class Main {
    public static void main(String[] args) {
 // casteo implicito  o UPCASTING (cuando dentro de la clase padre se crean objetos de la clase hija )      

// felino clase padre o base
        felino [] zoo2 = new felino[5]; 
// tigre clase hija o subclase
        zoo2[0] = new tigre ("leon" );
        zoo2[1] = new tigre ("leon" );
        zoo2[2] = new tigre ("puma" );
        zoo2[3] = new tigre ("chita" );
        zoo2[4] = new tigre ("gato de montaña" );       
        
        for (felino felinos : zoo2) {
            System.out.println( "zoo2 = " +felinos.toString());
        }

        System.out.println("");
        System.out.println("");

        // casteo explicito o DOWN CASTING ( cuando en la clase hija se crean objetos de la clase padre)

            // tigre subclase o clase hija 
            tigre [] zoo = new tigre[6];

            // felino clase padre o superclase
            felino felinoAtigrado = new tigre("'F.A'tigre rayado"); // CREACION DEL CASTING
            felino felinoAtigrado2 = new tigre(" 'F.A'tigre alvino");
            zoo[0] = (tigre) felinoAtigrado; // CASTEO
            zoo[1] = new tigre ("leon" );
            zoo[2] = new tigre ("puma" );
            zoo[3] = (tigre) felinoAtigrado2 ; // CASTEO
            zoo[4] = new tigre ("gato de montaña" );
            zoo[5] = new tigre ("gato domestico" );

            for (tigre unidad : zoo) {
            System.out.println("zoo = " + unidad.toString());
            }

            System.out.println("");
            System.out.println("");

            felino[] zoo3 = new felino [3];

            zoo3 [0]= new leon(" LEON DE LA SELVA");
            zoo3 [1]= new leon ("leon DE LA ASABANA");
            zoo3 [2]= new leon ("leon cachoroo");
            

            for (felino objetoss : zoo3) {
                System.out.println("zoo3 = "+objetoss.toString());
                
            }
        
            // dentro de la clase tigre creo objetos de la clase leon 
            // esto da error xq no se puede hacer casteo entre clases hijas 

            /*
            tigre[] zoo4 = new tigre[2] ;

            zoo4 [0]= new leon(" perros");
            */
    
    }
}
