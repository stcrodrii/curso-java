package arrays_bidimencioanles;
public class arregllos_for_each {
    public static void main(String[] args) {


        int[][] matrixx = {// esta es otra manera crear e istanciar una matriz bidimencional
           { 0, 1, 2, 3, 4},
           { 5, 6, 7, 8, 9},
           {10,11,12,13,14},
           {15,16,17,18,19}
        } ;

        /* recorrer arreglo con un for aninado de un for
        for (int i=0 ; i<4 ; i++){
            System.out.println(); // este system vacio es para que el arereglo me muestre en forma de tabla
             for (int j =0 ; j<5 ; j++){ // cuando entra aca ejecuta el bucle hasta 5 veces antes de salir
                 System.out.print(matrixx [i][j] + " ");
             }
         }
         */
        

         // recorrer un arreglo con un for each anidano de un for aech
         for(int[]fila:matrixx){
             System.out.println();
             for(int z:fila){
                 System.out.print(z + " ");
             }

         }
    }
}
