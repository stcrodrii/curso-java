package facultad;

import java.util.ArrayList;

public class Facultad implements Informacion {
  private String nombre;
  private ArrayList<Carrera> coleccionCarreras;

  public Facultad(String nombre, ArrayList<Carrera> coleccionCarreras) {
    this.nombre = nombre;
    this.coleccionCarreras = coleccionCarreras;
  }


  public ArrayList<Carrera> getColCarreras() {
    return coleccionCarreras;
  }

  public void setColCarreras(ArrayList<Carrera> colCarreras) {
    this.coleccionCarreras = colCarreras;
  }

  @Override
  public int verCantidad() {
    return this.coleccionCarreras.size();
  }

  @Override
  public String listarContenidos() {
    String str = "Carreras de la Faculta " + this.nombre + "\n";
    for (Carrera o : this.coleccionCarreras) {
      str += o.getNombre() ;
    }
    return str;
  }

  public void agergarCarrera(Carrera carrera) {
    this.coleccionCarreras.add(carrera);
  }

  public void removerCarrera(String nombreCarrera) {
    boolean contiene = false;
    for (Carrera o : coleccionCarreras) {
      if (o.getNombre() == nombreCarrera) {
        this.coleccionCarreras.remove(o);
        contiene = true;
      }
    }

    if (contiene)
      System.out.println("Carrera removida de la lista");
    else
      System.out.println("!La carrera no se encuentra en la lista: " + this.coleccionCarreras.toString());
  }

  @Override
  public String toString() {
    String str = String.format("Facultad  ", this.nombre.toUpperCase(), this.coleccionCarreras);
    return str;
  }

}