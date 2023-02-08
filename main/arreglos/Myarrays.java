package main.arreglos;

import main.Circulo;

public class Myarrays {
  
  //1) declarando array de 15 enteros
  public int[] intArray = new int[15];

  //2) declarando array de 20 nombres
  public String[] namesArray = new String[20];

  //3) declarando array de 200 circulos
  Circulo[] circulo = new Circulo[200];
  
 public Myarrays() {
   //4) Asignando valor 5 a la decima posición del array de numeros
   intArray[9] = 5;

   //5) Asignando el nombre francisco al array de nombres en la primera posicion
    namesArray[0] = "Francisco";

    // Mostrando valores ambos arrays
    showNumsArray(intArray);
    showStringArray(namesArray);


  }

  // 6) metodo para mostrar numeros del array
  void showNumsArray(int[] intArray) {
    System.out.println("showing array of nums");
    for(int i : intArray) {
      int data = intArray[i];
      System.out.println("index: " + i + " value: " + data);
    }
  }

  // 6) metodo para mostrar Strings del array
  public void showStringArray(String[] namesArray) {
    System.out.println("showing names:");
    for(int i = 0; i < namesArray.length; i++) {
      String data = namesArray[i];
      System.out.println("index: " + i + " value " + data);
    }
  }

  // 7) metodo para buscar valor en numeros
  public int searchingForValue(int[] arr, int val) {
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == (val)) {
        return i;
      }
    }
    return -1;
  }

  // 7) metodo para buscar valor en nombres 
  public int searchForValueString(String[] arr, String val) {
    for(int i = 0; i < arr.length; i++) { 
      if(arr[i].equals(val)) {
        return i;
      }
    }
    return -1;

  }

  //8) metodo para eliminar algun numero
  public int[] deleteValue(int[] arr, int val) {
    int pos = searchingForValue(arr, val);
    if(pos == -1){
      return arr;
    }
    for (int i = pos; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = 0;
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
    return arr;
  }

  //8) metodo para eliminar algun nombre 
  public String[] deleteStringVal (String[] arr, String val) {
    int pos = searchForValueString(arr, val);
    if(pos == -1){
      return arr;
    }
    for (int i = pos; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = null;
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
    return arr;

  }

}
