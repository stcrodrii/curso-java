package arrays_bidimencioanles;
public class ejercicios_arreglos {
    public static void main(String[] args) {


        double acumulado ;
        double interes = 0.10;
       

        double [] [] saldo = new double [6][5]; // definimos un arreglo
        for (int i=0 ; i<6 ; i++ ){
            saldo [i][0] = 10000;
            acumulado=10000;
            for(int j=1 ; j<5 ; j++){ // j inicia en la pocicion 1 y NO en la 0 xq en la 0 ya esta (10000)
                acumulado = acumulado + (acumulado*interes);
                saldo[i][j]=acumulado;
                
            }
            interes = interes + 0.01;

        }

            for(int h=0 ; h<6 ; h++){
            System.out.println();
            for(int k =0 ; k<5 ; k++){
                System.out.printf("%1.2f" , saldo [h][k]);
                System.out.print(" ");
             }
            }
      
            

    }
}