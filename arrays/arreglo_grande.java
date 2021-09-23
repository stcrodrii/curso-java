public class arreglo_grande {
    public static void main(String[] args) {
        int [] numeros = new int [150];
        for (int i=0 ; i<numeros.length ; i++){ // generar los numeros qe van a complerar el arreglo
            numeros[i]=(int)Math.round(Math.random()*100);
           
        }
        for (int num:numeros){ //recorrer el arreglo
            System.out.print(num + " ");
        }
    }
}
