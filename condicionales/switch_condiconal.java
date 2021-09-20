package condicionales;
import java.util.*;
public class switch_condiconal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(" ingrese un numero de acuerdo al dia que es");
        System.out.println(" 1 =lunes , 2 =martes , 3 =miercoles , 4 =jueves , 5 =viernes , 6 =sabado ; 7 =domingo ");
  
    int num1=entrada.nextInt();

    switch (num1) {
        case 1:
        System.out.println(" hoy se hace biceps \n  1-Curl de un solo brazo en banco inclinado \n  2-Curl con banda de resistencia");
        System.out.println(" 3-Curl con mancuernas en banco inclinado \n  4-Curl de martillo de pie");
        break;

        case 2: 
        System.out.println(" hoy se hace pecho");
        System.out.println("1- Calentamiento con banda de resistencia");
        System.out.println("2- Mancuernas contra el pecho ");
        System.out.println("3- Press de banca inclinado");
        System.out.println("4- Flexiones con peso ");
        break;

        case 3: 
        System.out.println(" hoy se hace triceps ");
        System.out.println("1- Flexiones con manos juntas ");
        System.out.println("2- Extensiones de pie con mancuernas ");
        System.out.println("3- Extensiones en TRX ");
        System.out.println("4- Extensiones con mancuerna en banco ");
        break;

        case 4: 
        System.out.println(" hoy se hace espalda ");
        System.out.println("1- Band bent over row ");
        System.out.println("2- Renegade row ");
        System.out.println("3- Remo con mancuerna a una mano ");
        System.out.println("4- Remo con mancuerna con el pecho en el banco ");
        break;

        case 5: 
        System.out.println(" hoy se hace solo abdominales");
        System.out.println("1-Plancha ");
        System.out.println("2-Levantamiento en bloque ");
        System.out.println("3-Piernas elevadas ");
        System.out.println("4-Elevación de piernas con tijera ");
        break;

        case 6: 
        System.out.println(" hoy se hace solo cardio ");
        System.out.println("1-correr 4 kilometros ");
        break;

        case 7:
        System.out.println(" hoy se desansa .. nos vemos el lunes");
        
        break;
        
    
        default:
        System.out.println(" la opcion ingreasa es incorrecta");
            break;
    }

        
        
      

    

    }
}
