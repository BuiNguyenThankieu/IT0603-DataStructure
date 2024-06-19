public class Stack {
    private int maxSize; // Maximum size of the stack
    private int[] stackArray; // Array to hold the stack elements
    private int top; // Index of the top element in the stack

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element " + value);
        } else {
            top++;
            stackArray[top] = value;
            System.out.println("Pushed element: " + value);
        }
    }

    // Method to pop the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // Return a default value indicating stack underflow
        } else {
            int value = stackArray[top];
            top--;
            System.out.println("Popped element: " + value);
            return value;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Method to peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No element to peek.");
            return -1; // Return a default value indicating stack is empty
        } else {
            return stackArray[top];
        }
    }

    // Method to display the elements of the stack
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack();

        stack.pop();
        stack.displayStack();

        System.out.println("Top element: " + stack.peek());
        stack.displayStack();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.displayStack();
    }
}
