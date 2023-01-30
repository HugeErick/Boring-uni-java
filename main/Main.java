package main;

import java.util.Scanner;

//Erick Gonzalez Parada #171845
public class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static boolean keepRunning = true;
  
    public static void main(String[] args) {
    System.out.println("Hello! in order to exit pls enter ctrl + c in terminal");
   askingUser(); 
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
