package coleccionDeObjetos;

public class Main {
    public static void main(String[] args) {
        salas obj1 = new salas (12, "toty");
        salas obj2 = new salas (2, "jose");
        salas obj3 = new salas (124, "bernave");
        salas obj4 = new salas (32, "paula");
        
        


        // coleccion o areeglo de objetos  
    salas objs [] = {   // coleccion o areeglo de objetos
         obj1 ,
         obj2,
         obj3 ,
         obj4, 
         new salas(45, "lujan")
         };
         
         for (salas objetos : objs) {
             System.out.println(objetos.toString());
             
         }

        


         



         
    }
    
   
     
}
