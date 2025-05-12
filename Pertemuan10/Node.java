package Pertemuan10;

public class Node {
    private MataKuliah data;
    private Node next;

    // Konstruktor untuk inisialisasi data
    public Node(MataKuliah data) {
        this.data = data;
        this.next = null; // default next is null
    }

    // Setter & Getter //
    public MataKuliah getData() {
        return data;
    }

    public void setData(MataKuliah data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
