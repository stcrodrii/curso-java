package claseAbstracEj2;



// clase final rectangulo que hereda de figuraGeo. que es abstract
final class rectangulo extends FiguraGeometr {

    
    private double base , altura;



    // constructor de rectangulo
    public rectangulo (double base , double altura){ 
        this.base = base ;
        this.altura = altura ;

    }




// metodos abstractos por contrato de la clase figuraGeomtr
  
    public double areas() {
        double area = this.base * this.altura;
        return area;
    }

    
    public double perimetro() {
        
        return 0;
    }

    
}
