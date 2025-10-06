import java.util.Random;

public class ThingList {
    private class Node {
        Thing data;
        Node next;

        Node(Thing t) {
            data = t;
            next = null;
        }
    }

    private Node head;

    public void addThing(Thing t) {
        Node newnode = new Node(t);
        newnode.next = head;
        head = newnode;
    }

    public void moveAll(Random rand) {
        Node current = head;

        while (current != null) {
            current.data.maybeTurn(rand);
            current.data.step();
            current = current.next;
        }
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }
}