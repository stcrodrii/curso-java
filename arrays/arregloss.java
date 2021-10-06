package arrays;
public class arregloss {
    public static void main(String[] args) {


  // String [] paises = {"argentina" , "peru" , "españa" , "bolivia" , "chile" , " paragua" , " urugua" , "eeuu" } ; 

        String []paises = new String [8]; // todo esto de la linea 7 hasta la linea 15 es lo mismo que esta en la linea 5
        paises [0]="argentina";
        paises [1]="peru";
        paises [2]="españa";
        paises [3]="bolivia";
        paises [4]="chile";
        paises [5]="paragu";
        paises [6]="urugua";
        paises [7]="eeuu";



           //  las 2   maneras de usar el for para recorrer una matriz o arreglo
        /*
        for(int i= 0; i<paises.length ; i++){
        System.out.println("pocicion "+i + " = " +paises[i]);
        } */

        for (String elemntos :paises){  // esto sirve para recorrer una matris ( FOR EACH)
            System.out.println("pais es "+ " = " + elemntos);
        }
    }
}
