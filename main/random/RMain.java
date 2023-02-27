package main.random;

import java.util.Random;

public class RMain {

  static String tab = "\t";

    public static void main(String[] args) {
    Persona[] personas = new Persona[10];
    String[] nombres = {"pepe", "jana", "pedro", "ale", "carlos", "vale", "pepa", "juana", "juana2", "concha"};
    Random random = new Random();
    int contadorTrabajo = 0, contadorMujer = 0, contadorDoctor = 0, contadorSoltero = 0;

    for (int i = 0; i < personas.length; i++) {
      String nombre = nombres[i];
      boolean trabajo = random.nextBoolean();
      boolean mujer = random.nextBoolean();
      boolean doctor = random.nextBoolean();
      boolean soltero = random.nextBoolean();

      // Verificar que al menos un atributo sea diferente
      while (!trabajo && !mujer && !doctor && !soltero) {
        trabajo = random.nextBoolean();
        mujer = random.nextBoolean();
        doctor = random.nextBoolean();
        soltero = random.nextBoolean();
      }

      if (trabajo) contadorTrabajo++;
      if (mujer) contadorMujer++;
      if (doctor) contadorDoctor++;
      if (soltero) contadorSoltero++;

      personas[i] = new Persona(nombre, trabajo, mujer, doctor, soltero);
    }

    // Imprimir los atributos de cada persona
    System.out.println("nombre" + tab + "trabajo?" + " " + "mujer?" + tab + "doctorao?" + "" + "soltero?");
    for (Persona persona : personas) {
      System.out.println(persona.getNombre() + ":" + tab + persona.isTrabajo() + tab + persona.isMujer() + tab + persona.isDoctor() + tab + persona.isSoltero());
    }

    // Imprimir la cantidad de veces que cada atributo fue utilizado
    System.out.println("\n"+"Contador trabajo: " + contadorTrabajo);
    System.out.println("Contador mujer: " + contadorMujer);
    System.out.println("Contador doctor: " + contadorDoctor);
    System.out.println("Contador soltero: " + contadorSoltero);
  } 
  
}
