package Pertemuan4;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    // Menambahkan elemen di awal list (Head)
    public void addHead(double data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    // Menambahkan elemen di akhir list (Tail)
    public void addTail(double data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    // Menambahkan elemen di posisi tertentu (Middle)
    public void addMid(double data, int position) {
        if (position <= 0) {
            addHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node curNode = HEAD;
        int index = 0;

        while (curNode != null && index < position - 1) {
            curNode = curNode.getNext();
            index++;
        }

        if (curNode == null) {
            addTail(data);
        } else {
            newNode.setNext(curNode.getNext());
            curNode.setNext(newNode);
        }
    }

    // Menampilkan elemen dalam list tanpa tanda panah dan null
    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData());
            curNode = curNode.getNext();
            if (curNode != null) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addTail(10.5);
        list.addTail(20.7);
        list.addTail(30.2);
        
        System.out.println("Isi Linked List:");
        list.displayElement();

        list.addMid(25.3, 2);
        System.out.println("Setelah menambahkan 25.3 di posisi 2:");
        list.displayElement();
    }
}
