package facultad;
import java.util.*;


public class Estudiante extends Persona {

  public Estudiante(String nombre, String apellido, int lejago) {
    super(nombre, apellido, lejago);
  }

  @Override
  public void modificarDatos() {
    Scanner entrada= new Scanner(System.in);

    System.out.println("Ingresa legajo = ");
    String s = entrada.nextLine();
    System.out.println("Datos nuevos  = ");
    System.out.println(this.toString());

    
    entrada.close();
  }

  @Override
  public String toString() {
    return "alumno = " + super.toString();
  }

}