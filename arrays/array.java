package arrays;
public class array {
    public static void main(String[] args) {
           
    // int matriz_arrays = new int [5];  
        int [] mi_matriz = {10,3,2,4,6,8,3,10,10,19,19};// DECALRAR e iniciar  un array o arreglo en la misma linea  
//tipo de dato-nombre del arreglo -- numero de valores que almacenara el arreglo

     /* mi_matriz [0] =13;     otra manera de declaracion de un arreglo
        mi_matriz [1] =4;
        mi_matriz [2] =33;
        mi_matriz [3] =66;
        mi_matriz [4] =77;
        mi_matriz [5] =88;
        */


       /* for (int i=0 ; i<5 ; i++) esto es para recorrer un arreglo con 4 pociciones {

       }*/
        for (int i = 0 ; i<mi_matriz.length ; i++){   // se usa el for para recorrer un arreglo .. use LENGTH para que el for recorra todo el arreglo 
            System.out.println("posicion "+i+" = " +mi_matriz[i]);

        }
       //System.out.println(mi_matriz[5]); esto me muestra por pantalla el valor de la pocicion 5 del arreglo 
      

    }
}
