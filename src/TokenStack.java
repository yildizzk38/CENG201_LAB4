/**
 * TokenStack.java
 * Your Name:       Yıldız Karamahmut
 * Your Student ID: 240444039
 * Your Date:       26/10/2026
 */
public class TokenStack {
    private class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    public TokenStack() {
        this.top = null;
    }
    public void push(String value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String value = top.data;
        top = top.next;
        return value;
    }
    public boolean isEmpty() {
        return top == null;
    }
}
