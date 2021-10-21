package claseAbstracEj2;
final  class circulo extends FiguraGeometr {

    private double radio ;

// constructor de la clase circulo
    public circulo( double radio) { 
        this.radio = radio ;
    }

// metodos abstractos por contrato de la clase figuraGeomtr
    @Override
    public double areas() {
        double area = (super.pi * this.radio)* (super.pi * this.radio); // SUPER xq hace referencia al " pi de FiguraGeometr"
        return area;
    }

    @Override
    public double perimetro() {
        // TODO Auto-generated method stub
        return 0;
    }

}