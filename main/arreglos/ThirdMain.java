package main.arreglos;

import java.util.Arrays;

public class ThirdMain {

  public static void main(String[] args) {
// Test multiplication of two matrices
  int[][] matrizA = {{1, 2}, {3, 4}};
  int[][] matrizB = {{5, 6}, {7, 8}};
  int[][] resultadoMultiplicacion = Arrayss.multiplicar(matrizA, matrizB);
  System.out.println("Matriz A: " + Arrays.deepToString(matrizA));
  System.out.println("Matriz B: " + Arrays.deepToString(matrizB));
  System.out.println("Resultado de la multiplicación: " + Arrays.deepToString(resultadoMultiplicacion));

  // Test transposition of a matrix
int[][] matriz = {{1, 2}, {3, 4}, {5, 6}};
int[][] resultadoTransposicion = Arrayss.transponer(matriz);
System.out.println("Matriz original: " + Arrays.deepToString(matriz));
System.out.println("Matriz transpuesta: " + Arrays.deepToString(resultadoTransposicion));

// Test sum of diagonal elements of a square matrix
int[][] matrizCuadrada = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
int sumaDiagonal = Arrayss.sumaDiagonal(matrizCuadrada);
System.out.println("Matriz cuadrada: " + Arrays.deepToString(matrizCuadrada));
System.out.println("Suma de elementos de la diagonal: " + sumaDiagonal);

// Test finding the maximum value in a matrix
int[][] matriz2 = {{1, 4, 3}, {5, 2, 6}, {7, 8, 9}};
int maximo = Arrayss.encontrarMaximo(matriz2);
System.out.println("Matriz: " + Arrays.deepToString(matriz2));
System.out.println("Valor máximo: " + maximo);

// Test addition of two matrices
int[][] matrizA2 = {{1, 2}, {3, 4}};
int[][] matrizB2 = {{5, 6}, {7, 8}};
int[][] resultadoSuma = Arrayss.sumar(matrizA2, matrizB2);
System.out.println("Matriz A: " + Arrays.deepToString(matrizA2));
System.out.println("Matriz B: " + Arrays.deepToString(matrizB2));
System.out.println("Resultado de la suma: " + Arrays.deepToString(resultadoSuma));

// Test multiplication of a matrix by a scalar
int[][] matriz3 = {{1, 2}, {3, 4}};
int escalar = 2;
int[][] resultadoMultiplicacionPorEscalar = Arrayss.multiplicarPorEscalar(matriz3, escalar);
System.out.println("Matriz original: " + Arrays.deepToString(matriz3));
System.out.println("Escalar: " + escalar);
System.out.println("Resultado de la multiplicación por escalar: " + Arrays.deepToString(resultadoMultiplicacionPorEscalar));
  }
  
}
