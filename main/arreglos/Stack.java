package main.arreglos;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Character> elements;
    private int Max;
    private char[] queue;
    private int tail;

    public Stack(int Max) {
        this.Max = Max;
        queue = new char[Max];
        tail = 0;
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

    //agregar un elemento a la cola
    public void enqueue(char item) {
        if (tail < Max) {
            queue[tail++] = item;
        }
    }

    //extraer un elemento de la cola
    public char dequeue() {
        if (tail == 0) {
            return '#';
        } else {
            char item = queue[0];
            for (int i = 0; i < tail - 1; i++) {
                queue[i] = queue[i + 1];
            }
            tail--;
            return item;
        }
    }
}

