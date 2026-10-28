package exercise1;

/**
 * BracketStack.java
 *
 * Your Name:        Ferzan
 * Your Student ID:  240444049
 */

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    // TODO 1: Add an element to the top of the stack
    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // TODO 2: Remove and return the top element
    public char pop() {
        if (isEmpty()) {
            return '\0'; // Return null character if stack is empty
        }
        char data = top.data;
        top = top.next;
        return data;
    }

    // TODO 3: Return the top element without removing it
    public char peek() {
        if (isEmpty()) {
            return '\0'; // Return null character if stack is empty
        }
        return top.data;
    }

    // TODO 4: Check whether the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}