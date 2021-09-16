import javax.swing.*;// para usar el  " JOptionPane.showInputDialog " "
import java.util.*; // para usar el  " Scanner "
//  java.lang.*;  se usa para las clase Math pero ya viene incluida por defecto
public class desafio_07 {
    public static void main(String[] args) {


        //String entrada = JOptionPane.showInputDialog("seleccione que operacion quiere realizar. \n1:seno\n2:coseno\n3:tangente");
        
        Scanner entrada = new Scanner(System.in);
        String opciones=JOptionPane.showInputDialog("que decea calcular \n1:seno\n2:coseno\n3:tangente\n4:tangente-1 (arcoTangente)\n5:El metodo exp()\n6:valor de PI\n7:valor de base de los logaritmios (E)");
        int eleccion = Integer.parseInt(opciones);


     switch(eleccion) {
        

        case 1: //Math.sin y Math.toRadians
             System.out.println("introdusca el angulo a calcular");
             Double angulo1 = entrada.nextDouble();
             double converRadianes = Math.toRadians(angulo1); // use la clase Math.toRadianes para pasar el valor que el usuario ingreso que era de tipo bouble a radaines
            double seno = Math.sin(converRadianes);
            System.out.println("el seno de "+angulo1+"° = "+seno );
        break ;

        
        case 2://Math.cos y Math.toRadians
             System.out.println("introdusca el angulo a calcular");
             Double angulo2 = entrada.nextDouble();
            double cose = Math.cos(Math.toRadians(angulo2)); // dentro de la varaible (cose) guarde el coseno del valor que me pasaron que antes fue trasformado a radianes
            System.out.println("el coseno de "+angulo2+"° = "+cose );
        break;
        

        case 3://Math.tan y Math.toRadians
             System.out.println("introdusca el angulo a calcular");
            Double angulo3 = entrada.nextDouble();
            double tangente = Math.tan(Math.toRadians(angulo3));  
            System.out.println("la tangente de "+angulo3+"° = "+tangente );
        break;


        case 4: //Math.atan 
             System.out.println("introdusca el angulo a calcular");
             Double calcTang = entrada.nextDouble();
             double calcTangentess = Math.tan(Math.toRadians(calcTang));//1ero calcule la tangente
             double arcoTangente = Math.atan(Math.toDegrees(calcTangentess)); //calcule el arcoTangente
             System.out.println("la tangente-1 o (arcoTangente) de "+calcTang+"° es "+arcoTangente );
        break;


        case 5: //Math.exp este metodo devulve la base de los algoritmios naturales "E" elevavados a la potencia del argumento
             System.out.println("introdusca el numero a calcular");
             Double numCalcula = entrada.nextDouble();
             System.out.printf("%1.3f" , Math.exp(numCalcula)); 
        break;

    
        case 6:
             System.out.println("el valor de PI es: " + Math.PI );
        break;


        case 7:
             System.out.println("el valor de E es: " + Math.E );
        break;

    
        default: System.out.println("la opcion fue incorrecta");
        break;

        }
    }
}
