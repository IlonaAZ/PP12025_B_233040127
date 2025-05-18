package Pertemuan11;

public class StrukturQueue {
    // Atribut FRONT dan REAR bertipe Node
    private Node FRONT;
    private Node REAR;

    // Konstruktor (opsional, tapi bisa ditambahkan untuk inisialisasi eksplisit)
    public StrukturQueue() {
        FRONT = null;
        REAR = null;
    }

    // Operasi untuk mengecek apakah queue kosong
    public boolean isEmpty() {
        return FRONT == null;
    }

    // Operasi untuk menambahkan elemen ke queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }
    
    // Menghapus dan mengembalikan elemen paling depan dari queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong. Tidak dapat melakukan dequeue.");
            return -1; // Alternatif: lempar exception jika diinginkan
        } else {
            int value = FRONT.getData();
            FRONT = FRONT.getNext();
            // Jika setelah dequeue queue menjadi kosong, REAR juga di-set ke null
            if (FRONT == null) {
                REAR = null;
            }
            return value;
        }
    }
    

    // (Opsional) Tambahkan method untuk menampilkan isi queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue kosong.");
        } else {
            Node current = FRONT;
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            }
            System.out.println();
        }
    }
    
    // Mengembalikan jumlah elemen dalam queue
        public int size() {
            int size = 0;
            Node curNode = FRONT;
            while (curNode != null) {
                size++;
                curNode = curNode.getNext();
            }
            return size;
        }

        public int front() {
            return FRONT != null ? FRONT.getData() : -1;
        }
        
        // Prosedur untuk menampilkan elemen-elemen queue 
        public void displayElements() {
            if (isEmpty()) {
                System.out.println("elemen queue: queue kosong");
            } else {
                System.out.print("elemen queue: ");
                Node current = FRONT;
                while (current != null) {
                    System.out.print(current.getData() + " ");
                    current = current.getNext();
                }
                System.out.println(); // Pindah baris
            }
        }
    }
