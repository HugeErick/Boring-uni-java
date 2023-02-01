package main;

class Examen {
    public String primeraMayuscula(String cadena) {
        System.out.println("devolviendo la primera mayuscula");
        return cadena.substring(0,1).toUpperCase() + cadena.substring(1);
    }

    public String invertirCadena(String cadena) {
        System.out.println("invirtiendo la cadena");
        return new StringBuilder(cadena).reverse().toString();
    }

    public String vocalesMayuscula(String cadena) {
      System.out.println("conviertiendo vocales en mayusc");
        char[] chars = cadena.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public boolean palindromo(String cadena) {
        String cadenaSinEspacios = cadena.replaceAll("\\s+", "").toLowerCase();
        return cadenaSinEspacios.equals(new StringBuilder(cadenaSinEspacios).reverse().toString());
    }
}
