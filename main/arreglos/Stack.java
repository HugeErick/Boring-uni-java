package main.arreglos;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Character> elements;


    public Stack() {
        
        elements = new ArrayList<>();
    }

    //agregar un elemento a la pila
    public void push(char item) {
        elements.add(item);
    }

    //extraer un elemento de la pila
    public char pop() {
        if (elements.isEmpty()) {
            System.out.println("Stack is empty");
            return '#';
        } else {
            char item = elements.get(elements.size() - 1);
            elements.remove(elements.size() - 1);
            return item;
        }
    }

    public char[] reverseArray(char[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            push(inputArray[i]);
        }
        char[] reversedArray = new char[inputArray.length];
        for (int i = inputArray.length - 1; i >= 0; i--) {
            reversedArray[i] = pop();
        }
        return reversedArray;
    }

    public boolean isPalindrome(String input) {
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            push(inputArray[i]);
        }
        int size = elements.size();
        for (int i = 0; i < size / 2; i++) {
            char item = pop();
            if (inputArray[i] != item) {
                return false;
            }
        }
        return true;
    }

}

