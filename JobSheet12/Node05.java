public class Node05 {
    Mahasiswa05 data;
    Node05 prev;
    Node05 next;

    public Node05(Node05 prev, Mahasiswa05 data, Node05 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
