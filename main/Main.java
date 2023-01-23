package main;

import java.util.Scanner;

//Erick Gonzalez Parada #171845
public class Main {

    public static void main(String[] args) {
   askingUser(); 
  }

  public static void askingUser() {

    
    System.out.println("Which figure u want to create? Circle or Square?");
  Scanner scanner = new Scanner(System.in);
  String figure = scanner.nextLine();
  figure.toLowerCase();
  
  if (figure.equals("square")) {
    System.out.println("enter side length");
    double side = scanner.nextDouble();
    Cuadrado cuadrado = new Cuadrado(side);
    
    
    System.out.println("What operation do you want to do? (area/perimeter/diagonal)");
    String operation = scanner.next();
    operation.toLowerCase();

    if(operation.equals("area")){
      double ans = cuadrado.getArea();
      System.out.println(ans);
    } else if(operation.equals("perimeter")) {
      double ans = cuadrado.getPerimetro();
      System.out.println(ans);
    } else if(operation.equals("diagonal")) {
      double ans =cuadrado.getDiagonal();
      System.out.println(ans);
    } else {
      System.out.println("sorry invalid operation");
    }
    
  } else if (figure.equals("circle")) {
    System.out.println("Enter the radius of the circle:");
    int radius = scanner.nextInt();
    Circulo circulo = new Circulo(radius);

      System.out.println("What operation do you want to do? (area/circumference)");
      String operation = scanner.next();
      operation.toLowerCase();

      if(operation.equals("area")) {
        double ans = circulo.getArea();
        System.out.println(ans);
      } else if (operation.equals("circumference")) {
        double ans = circulo.getCircunferencia();
        System.out.println(ans);
      } else {
        System.out.println("invalid operation");
      }

    } else {
      System.out.println("Invalid choice. Please choose either 'circle' or 'square'.");
    }
    scanner.close();
  }

  
}
