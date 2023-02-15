package main.arreglos;

public class SecondMain {
 public static void main(String[] args) {
        Stack stack = new Stack();

        String inputString2= "owu";
        char[] inputArray = {'o', 'w', 'u'};
        System.out.println("Reversing the input array: " + new String(stack.reverseArray(inputArray)));

        String inputString = "uwu";
        System.out.println("Checking if '" + inputString + "' is a palindrome: " + stack.isPalindrome(inputString));
        System.out.println("Checking if '" + inputString2 + "' is a palindrome: " + stack.isPalindrome(inputString2));

        stack.push('a');
        stack.push('w');
        stack.push('u');


        System.out.println("Popping items from the stack: " + stack.pop() + ", " + stack.pop() + ", " + stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue queue = new Queue(3);

        queue.enqueue('u');
        queue.enqueue('w');
        queue.enqueue('u');

        System.out.println("Dequeuing items from the queue: " + queue.dequeue() + ", " + queue.dequeue() + ", " + queue.dequeue());
    } 
}
