package facultad;

public abstract class Persona {
  private String nombre;
  private String apellido;
  private int legajo;

  public Persona(String nombre, String apellido, int lejago) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.legajo = lejago;
  }
  public abstract void modificarDatos();

  @Override
  public String toString() {
    String str = String.format(" Nombre = " + " Legajo:", this.apellido.toUpperCase(),
        this.nombre, this.legajo);
    return str;
  }

  //metodo nombre
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  //metodo apellido
  public String getApellido() {
    return apellido;
  }
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }


  //metodo legajo
  public int getLejago() {
    return legajo;
  }
  public void setLegajo(int lejago) {
    this.legajo = lejago;
  }

}