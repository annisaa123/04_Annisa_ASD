package tugasdoublelinkedlists;

/**
 * NodeVaksin04
 */
public class NodeVaksin04 {

    Vaksin04 data;
    NodeVaksin04 prev, next;

    public NodeVaksin04(NodeVaksin04 prev, Vaksin04 data, NodeVaksin04 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    public void printData() {
        System.out.println("|"+data.no_antrian+"\t|"+data.nama+"\t|");
    }
}