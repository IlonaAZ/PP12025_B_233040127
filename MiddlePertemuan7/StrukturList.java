package MiddlePertemuan7;

public class StrukturList {

    Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    // Metode baru: Menambahkan data di akhir list
    public void addTail(int data) {
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

    public void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    public void removeMid(int position) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa menghapus.");
            return;
        }

        if (position == 1) {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        } else {
            Node prevNode = null;
            Node curNode = HEAD;
            int i = 1;

            while (curNode != null && i < position) {
                prevNode = curNode;
                curNode = curNode.getNext();
                i++;
            }

            if (curNode == null) {
                System.out.println("Posisi melebihi panjang list.");
            } else {
                prevNode.setNext(curNode.getNext());
                dispose(curNode);
            }
        }
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + "  ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
}
