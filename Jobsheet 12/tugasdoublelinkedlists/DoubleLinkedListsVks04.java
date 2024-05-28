package tugasdoublelinkedlists;
public class DoubleLinkedListsVks04 {

    NodeVaksin04 head;
    int size;

    public DoubleLinkedListsVks04() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Vaksin04 item) {
        if (isEmpty()) {
            head = new NodeVaksin04(null, item, null);
        } else {
            NodeVaksin04 newNode = new NodeVaksin04(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Vaksin04 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            NodeVaksin04 current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeVaksin04 newNode = new NodeVaksin04(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong");
        } else {
            NodeVaksin04 tmp = head;
            while (tmp != null) {
                tmp.printData();
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian: " + size());
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus elemen terakhir");
        }
        if (size == 1) {
            head = null;
        } else {
            NodeVaksin04 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.prev.next = null;
        }
        size--;
    }

    public void removeFirst() throws Exception {
        NodeVaksin04 tmp = head;
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
            System.out.println(tmp.data.nama + " telah dihapus");
        }
    }
    
    // Menambahkan metode enqueue untuk menambahkan elemen ke akhir linked list
    public void enqueue(Vaksin04 item) {
        addLast(item);
    }

    // Menambahkan metode dequeue untuk menghapus elemen dari awal linked list
    public void dequeue() throws Exception {
        removeFirst();
    }
}
