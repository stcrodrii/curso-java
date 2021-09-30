package arrays_bidimencioanles;
public class arregglos {
    public static void main(String[] args) {
     // declaracion de un arreglo de 2 dimenciones .. si fuese de 3 tendriamos que poner 3 veces los corchetes "[]"   
        int [][] arregloss = new int [4][5];


     arregloss [0] [0] = 0 ;
     arregloss [0] [1] = 1 ;
     arregloss [0] [2] = 2 ;
     arregloss [0] [3] = 3 ;
     arregloss [0] [4] = 4 ;

     arregloss [1] [0] = 5 ;
     arregloss [1] [1] = 6 ;
     arregloss [1] [2] = 7 ;
     arregloss [1] [3] = 8 ;
     arregloss [1] [4] = 9 ;

     arregloss [2] [0] = 10 ;
     arregloss [2] [1] = 11 ;
     arregloss [2] [2] = 12 ;
     arregloss [2] [3] = 13 ;
     arregloss [2] [4] = 14 ;

     arregloss [3] [0] = 15 ;
     arregloss [3] [1] = 16 ;
     arregloss [3] [2] = 17 ;
     arregloss [3] [3] = 18 ;
     arregloss [3] [4] = 111 ;

     // manera de mostrar por pantalla el valor de la pocicion 2,3
     //System.out.println(arregloss[2][3]);

     for (int i=0 ; i<4 ; i++){
        System.out.println(); // este system vacio es para que el arereglo me muestre en forma de tabla
         for (int j =0 ; j<5 ; j++){ // cuando entra aca ejecuta el bucle hasta 5 veces antes de salir
             System.out.print(arregloss [i][j] + " ");
         }
     }

     




      
    }
}
