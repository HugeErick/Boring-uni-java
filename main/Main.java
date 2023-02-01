package main;

import java.util.Scanner;

//Erick Gonzalez Parada #171845
public class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static boolean keepRunning = true;
  
    public static void main(String[] args) {
    System.out.println("Hello! in order to exit pls enter ctrl + c in terminal");
    System.out.println("this is the menu of \"examen\"");
    System.out.println("the string u enter will be the one evaluated for all string methods");
    System.out.println("Please enter string");
    String inputS = scanner.next();
    System.out.println("u put: " + inputS);
    Examen examen = new Examen();
    String mayusc = examen.primeraMayuscula(inputS);
    System.out.println(mayusc);
    String invertir = examen.invertirCadena(inputS);
    System.out.println(invertir);
    String vocaMayusc = examen.vocalesMayuscula(inputS);
    System.out.println(vocaMayusc);
    System.out.println("FizzBuzz y/n?");
    String yesno = scanner.next();
    String lowyesno = yesno.toLowerCase();
    if(lowyesno.equals("n") || lowyesno.equals("no")){
      System.exit(0);
    }
    System.out.println("==========================================");
    examen.fizzBuzz();
    System.out.println("=============================================");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("continuing with boolean palindrom");
    boolean palindromo = examen.palindromo(inputS);
    System.out.println("palindrom: " + palindromo);

    System.out.println("do u want to proceed with calculating circles and squares? y/n");
    yesno = scanner.next();
    lowyesno = yesno.toLowerCase();
    if(lowyesno.equals("n") || lowyesno.equals("no")){
      System.exit(0);
    } else {
      askingUser(); 
    }

  }

  public static void askingNextQ() {
    System.out.println("another operation y/n");
    String input = scanner.next();
    if (input.equals("y")){
      askingUser();
    }
    else if (input.equals("n")) {
      System.out.println("exiting...");
      System.exit(0);
    }
    else {
      System.out.println("invalid input");
      askingNextQ();
    }
  
  }

  public static void askingUser() {
  
    
    System.out.println("Which figure u want to create? Circle or Square?");
  while(keepRunning) {


    String figure = scanner.nextLine();
    figure.toLowerCase();
  
    if (figure.equals("square")) {
      System.out.println("enter side length");
      double side = scanner.nextDouble();
      Cuadrado cuadrado = new Cuadrado(side);
    
    
      System.out.println("What operation do you want to do? (area/perimeter/diagonal)");
      String operation = scanner.next();
      operation.toLowerCase();
  
      switch(operation) {
        case "area":
        double area = cuadrado.getArea();
        System.out.println(area);
        askingNextQ();
        break;
        case "perimeter":
        double perimeter = cuadrado.getPerimetro();
        System.out.println(perimeter);
        askingNextQ();
        break;
        case "diagonal":
        double diagonal =cuadrado.getDiagonal();
        System.out.println(diagonal);
        askingNextQ();
        default:
        System.out.println("invalid operation. Please enter again");
        askingUser();
        break;
      }
    }
    else if (figure.equals("circle")){

      System.out.println("Enter the radius of the circle:");
      int radius = scanner.nextInt();
      Circulo circulo = new Circulo(radius);
  
      System.out.println("What operation do you want to do? (area/circumference)");
      String operation = scanner.next();
      operation.toLowerCase();

      switch(operation){
        case "area":
        double circleArea = circulo.getArea();
        System.out.println(circleArea);
        askingNextQ();
        break;
        case "circumference":
        double circunf = circulo.getCircunferencia();
        System.out.println(circunf);
        askingNextQ();
        break;
        default:
        System.out.println("invalid operation. Please enter again");
        askingUser();
        break;
      }
   
    }
    else {
      System.out.println("invalid figure, please enter again");
      askingUser();
    }
    }
    scanner.close();
  }
 
}
