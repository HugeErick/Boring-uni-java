package main.random;

import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class RMain {

  static String tab = "\t";

    public static void main(String[] args) throws IOException {
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

    // verificando usuario
    Scanner sc = new Scanner(System.in);
    String playerName;
    int totalGames = 0, totalWins = 0;

    
    System.out.println("Bienvenido al juego de adivina quien!");
    System.out.println("Ingrese su nombre de jugador:");
    playerName = sc.nextLine();
    
    File file = new File("C:/Users/drave/OneDrive/Escritorio/java/uni/main/users", playerName + ".txt");

    if (file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine(); //lee la linea que esta escrita para que no de error de NumberFormatException
            totalGames = Integer.parseInt(br.readLine());
            line = br.readLine(); // lo mismo
            totalWins = Integer.parseInt(br.readLine());
            br.close();
            System.out.println("Hola " + playerName + "! Bienvenido de vuelta.");
            System.out.println("Has jugado " + totalGames + " partidas y ganado " + totalWins + " de ellas.");
        } else {  
            file.createNewFile();
            System.out.println("Hola " + playerName + "! Bienvenido al juego.");
        }    


        //preguntando si quiere jugar una partida
        while (true) {
            System.out.println("¿Quieres jugar una partida? (s/n)");
            String response = sc.next().toLowerCase();
            if (response.equals("n")) {
                break;
            }
            if (!response.equals("s")) {
                System.out.println("Por favor, ingrese una respuesta válida.");
                continue;
            }

            totalGames++;

            // Aquí iría la lógica del juego Adivina Quién
            
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
                
                try {
                  Thread.sleep(900);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
                
                int indiceSujeto = (int) (Math.random() * 10);
                System.out.println("\n" + "hemos seleccionado a un personaje");
                System.out.println("A continuación se muestra un menu en donde usted seleccionara que atributo cree que es verdadero");
            
                // Mostrar a las 10 personas con sus características
                System.out.println("en todo momento es valido que usted vea sus atributos que se quedaron por arriba");
                System.out.println("Estas son las 10 personas:\n");
                for (int i = 0; i < personas.length; i++) {
                  System.out.println(i + ": " + personas[i].getNombre());
                }
            
                //contador de personas eliminadas
                int personasEliminadas = 0;
                
                // Crear menú de preguntas
                for (int i = 0; i < 3; i++) {
                  try {
                    Thread.sleep(700);
                  } catch (InterruptedException e) {
                    e.printStackTrace();
                  }
                  System.out.println("\nPregunta " + (i + 1) + ":");
                  System.out.println("1. ¿Tiene trabajo?");
                  System.out.println("2. ¿Es mujer?");
                  System.out.println("3. ¿Es doctor?");
                  System.out.println("4. ¿Está soltero/a?");
                  int respuesta = sc.nextInt();
            
                  if(personas[indiceSujeto] != null){
                    switch(respuesta) {
                      case 1:
                        if(!personas[indiceSujeto].isTrabajo()){
                          System.out.println("el sujeto no tiene trabajo");
                        } else {
                          System.out.println("el sujeto si tiene trabajo");
                        }
                        break;
                      case 2:
                        if(!personas[indiceSujeto].isMujer()){
                          System.out.println("el sujeto no se identifica como mujer");
                        } else {
                          System.out.println("el sujeto si se identifica como mujer");
                        }
                        break;
                      case 3:
                        if(!personas[indiceSujeto].isDoctor()){
                          System.out.println("el sujeto no tiene doctorado");
                        } else {
                          System.out.println("el sujeto si tiene doctorado");
                        }
                        break;
                      case 4:
                        if(!personas[indiceSujeto].isSoltero()){
                          System.out.println("el sujeto no esta soltero");
                        } else {
                          System.out.println("el sujeto si esta soltero");
                        }
                        break;
            
                    }
                  }
            
                  // Eliminar personas que no tienen la característica indicada
                  for (int j = 0; j < personas.length; j++) {
                    if (personas[j] != null) { 
                      switch (respuesta) {
                        case 1:
                          if (!personas[j].isTrabajo()) {
                            //System.out.println(personas[j].getNombre() + " no tiene trabajo");
                            if(personas[j] != personas[indiceSujeto]){
                              personas[j] = null;
                            }
                            ++personasEliminadas;
                          } else {
                            //System.out.println(personas[j].getNombre() + " tiene trabajo");
                            }
                          break;
                        case 2:
                          if (!personas[j].isMujer()) {
                            //System.out.println(personas[j].getNombre() + " no se identifica como mujer");
                            if(personas[j] != personas[indiceSujeto]){
                              personas[j] = null;
                            }
                            ++personasEliminadas;
                          } else {
                            //System.out.println(personas[j].getNombre() + " se identifica como mujer");
                          }
                          break;
                        case 3:
                          if (!personas[j].isDoctor()) {
                            //System.out.println(personas[j].getNombre() + " no tiene doctorado");
                            if(personas[j] != personas[indiceSujeto]){
                              personas[j] = null;
                            }
                            ++personasEliminadas;
                          } else {
                            //System.out.println(personas[j].getNombre() + " tiene doctorado");
                          }
                          break;
                        case 4:
                          if (!personas[j].isSoltero()) {
                            //System.out.println(personas[j].getNombre() + " no es soltero");
                            if(personas[j] != personas[indiceSujeto]){
                              personas[j] = null;
                            }
                            ++personasEliminadas;
                          } else {
                            //System.out.println(personas[j].getNombre() + " es soltero");
                          }
                          break;
                        default:
                          System.out.println("Opción inválida.");
                          break;
                      }
                    }
                  }
                }
                if(personas[indiceSujeto] == null){
                  --personasEliminadas;
                }
                  // Mostrar lista actualizada de personas
                System.out.println("Personas restantes: ");
                //System.out.println(personasEliminadas);
                for (int j = 0; j < personas.length; j++) {
                  if (personas[j] != null) {
                    if(personasEliminadas > 1){
                      System.out.println(j + " " + personas[j].getNombre());
                    } else {
                      System.out.println("Solo queda una persona!");
                      break;
                    }
                }
              }
            
                // Adivinar la persona seleccionada por el sistema
                System.out.println("¿Quién crees que es el sujeto elegido? (introduce un número del 0 al 9)");
                //System.out.println(indiceSujeto);
                int adivinanza = sc.nextInt();
                if (adivinanza == indiceSujeto) {
                  System.out.println("¡Felicidades, has acertado!");
                } else {
                  System.out.println("Lo siento, esa no es la persona elegida.");
                  System.out.println("el personaje era: " + personas[indiceSujeto].getNombre());
                  System.out.println("tonto!");
                }
            //String consume = sc.next();

            System.out.println("¿Ganaste? (s/n)");
            response = sc.next().toLowerCase();
            if (response.equals("s")) {
                System.out.println("yeii!");
                totalWins++;
            } else if (!response.equals("n")) {
                System.out.println("Por favor, ingrese una respuesta válida.");
                continue;
            }
        }

        FileWriter fw = new FileWriter(file);
        fw.write("partidas jugadas\n");
        fw.write(totalGames + "\n");
        fw.write("partidas ganadas\n");
        fw.write(totalWins + "\n");
        fw.close();
        System.out.println("¡Gracias por jugar! Tus estadísticas han sido guardadas.");
    







    


    // Cerrar scanner
    sc.close();


  } 
  
}
