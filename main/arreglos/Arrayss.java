package main.arreglos;

//actividad 15/02/2023
public class Arrayss {

  // Método para multiplicar dos matrices
  public static int[][] multiplicar(int[][] matrizA, int[][] matrizB) {
    int filasA = matrizA.length;
    int columnasA = matrizA[0].length;
    int columnasB = matrizB[0].length;

    /*
     0 0
     0 0

     0 0 
     0 0
     */

    int[][] resultado = new int[filasA][columnasB];

    for (int i = 0; i < filasA; i++) {
      for (int j = 0; j < columnasB; j++) {
        for (int k = 0; k < columnasA; k++) {
          resultado[i][j] += matrizA[i][k] * matrizB[k][j];
        }
      }
    }

    return resultado;
  }

  // Método para transponer una matriz
  public static int[][] transponer(int[][] matriz) {
  int filas = matriz.length;
  int columnas = matriz[0].length;

  int[][] resultado = new int[columnas][filas];

  for (int i = 0; i < filas; i++) {
    for (int j = 0; j < columnas; j++) {
      resultado[j][i] = matriz[i][j];
    }
  }

  return resultado;

  }

  // Método para sumar la diagonal de una matriz cuadrada
  public static int sumaDiagonal(int[][] matriz) {
  int dimension = matriz.length;
  int suma = 0;
  for (int i = 0; i < dimension; i++) {
    suma += matriz[i][i];
  }

  return suma;
  }

  // Método para encontrar el valor máximo de una matriz
  public static int encontrarMaximo(int[][] matriz) {
  int maximo = matriz[0][0];
  for (int[] fila : matriz) {
    for (int elemento : fila) {
      if (elemento > maximo) {
        maximo = elemento;
      }
    }
  }

  return maximo;
  }

  // Método para sumar dos matrices
  public static int[][] sumar(int[][] matrizA, int[][] matrizB) {
  int filas = matrizA.length;
  int columnas = matrizA[0].length;

  int[][] resultado = new int[filas][columnas];

  for (int i = 0; i < filas; i++) {
    for (int j = 0; j < columnas; j++) {
      resultado[i][j] = matrizA[i][j] + matrizB[i][j];
    }
  }

  return resultado;

  }

  // Método para multiplicar una matriz por un escalar
  public static int[][] multiplicarPorEscalar(int[][] matriz, int escalar) {
  int filas = matriz.length;
  int columnas = matriz[0].length;
  
  int[][] resultado = new int[filas][columnas];

  for (int i = 0; i < filas; i++) {
    for (int j = 0; j < columnas; j++) {
      resultado[i][j] = matriz[i][j] * escalar;
    }
  }

  return resultado;

  }



  
}
