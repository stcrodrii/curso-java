package facultad;

import java.util.ArrayList;

public class Carrera implements Informacion {
  private String nombre;
  private ArrayList<Materia> colMaterias;

  public Carrera(String nombre, ArrayList<Materia> colMaterias) {
    this.nombre = nombre;
    this.colMaterias = colMaterias;
  }
// metodos de nombre
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ArrayList<Materia> getColMaterias() {
    return colMaterias;
  }

  public void setColMaterias(ArrayList<Materia> colMaterias) {
    this.colMaterias = colMaterias;
  }

  public void agregarMateria(Materia materia) {
    this.colMaterias.add(materia);
  }

  

  @Override
  public String toString() {
    String str = String.format("carreraa", this.nombre, this.colMaterias);
    return str;
  }

  @Override
  public int verCantidad() {
    return this.colMaterias.size();
  }

  @Override
  public String listarContenidos() {
    String str = "Materias  Carrera " + this.nombre ;
    for (Materia o : this.colMaterias) {
      str += o.getNombre() ;
    }
    return str;
  }

}