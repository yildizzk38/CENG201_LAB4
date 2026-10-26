/**
 * BracketStack.java
 * Your Name:       Yıldız Karamahmut
 * Your Student ID: 240444039
 * Your Date:       26/10/2026
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
            return '\0';
        }
        char poppedData = top.data;
        top = top.next;
        return poppedData;
    }
    // TODO 3: Return the top element without removing it
    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return top.data;
    }
    // TODO 4: Check whether the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
