package claseAbstract;



 class animal extends serVivo {
     
// por contrato hereda el metodo de la clase serVivo que es abstracto 
    public String moverse (){  // el metodo no lleva la palabra reserv "abstract"
        return "con las patas";
    }
    
}
