package main.arreglos;

public class Queue {
    private int Max;
    private char[] queue;
    private int tail; 
  
      public Queue(int Max) {
        this.Max = Max;
        queue = new char[Max];
        tail = 0;
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
