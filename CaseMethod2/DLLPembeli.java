public class NodePembeli {
    NodePembeli prev;
    Pembeli data;
    NodePembeli next;
    int nomorAntrian;

    public NodePembeli(NodePembeli prev, int nomorAntrian,
                       Pembeli data, NodePembeli next) {
        this.prev = prev;
        this.nomorAntrian = nomorAntrian;
        this.data = data;
        this.next = next;
    }
}
