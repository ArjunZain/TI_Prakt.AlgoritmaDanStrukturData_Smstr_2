public class NodePesanan {
    NodePesanan prev;
    Pesanan data;
    NodePesanan next;

    public NodePesanan(NodePesanan prev,
                       Pesanan data,
                       NodePesanan next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
