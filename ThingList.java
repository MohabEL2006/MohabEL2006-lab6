
public class ThingList {
    public Thing data;
    public Node next;

    public Node add(Thing newThing) {
        Node newNode = new Node();
        newNode.data = newThing;
        newNode.next = this.next;
        this.next = newNode;
        return newNode;
    }
}
