package facultad;

import java.util.ArrayList;

class ClassMain {
  public static void main(String[] args) {

    // profesor
    Profesor profe1 = new Profesor("Facu", "uferer", 2435, 150.000);

    //estudiantesss
    Estudiante est1 = new Estudiante("john ", "snow", 5_900);
    Estudiante est2 = new Estudiante("cersei", "lannister", 533_000);
    Estudiante estudiante3 = new Estudiante("jose", "cabral", 456);


    // lugaro donde se guardan los alumnos
    ArrayList<Estudiante> colEstudiantes = new ArrayList<>();
    colEstudiantes.add(est1);
    colEstudiantes.add(est2);


    // obj materia
    Materia materia1 = new Materia("Laborat.II", profe1, colEstudiantes);
    Materia materia2 = new Materia("diseño.web", profe1, colEstudiantes);


    // creacion de la 
    ArrayList<Materia> Matrias = new ArrayList<>();
    Matrias.add(materia1);
    Matrias.add(materia2);


// obj carrera
    Carrera carrera1 = new Carrera("Tecnicatura Universitaria en Programación", Matrias);

    System.out.println(carrera1);

    ArrayList<Carrera> colCarreras = new ArrayList<>();
    colCarreras.add(carrera1);


    // obj facultad

    Facultad facultad1 = new Facultad("UTN FRRe", colCarreras);
    System.out.println(facultad1);

    System.out.println(facultad1.listarContenidos());

    System.out.println(carrera1.listarContenidos());

    System.out.println(materia2.listarContenidos());
    
    // esto es para modifacar algun dato quieramos cambair
    estudiante3.modificarDatos();
    
  }

}