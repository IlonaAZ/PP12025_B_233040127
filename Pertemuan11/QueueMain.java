package Pertemuan11;

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        // Sebelum Enqueue
        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());

        // Enqueue 3x
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);

        // Setelah Enqueue
        System.out.println("\n### Enqueue 3x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("front: " + queue.front());
    
        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements(); // Menampilkan isi queue (kosong)

        // Enqueue 4x
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        // Setelah Enqueue
        System.out.println("\n### Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements(); // Menampilkan isi queue (berisi elemen)
        System.out.println("front: " + queue.front());
    
        
        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("Size: " + queue.size());
        System.out.println("Is Empty: " + queue.isEmpty());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("### Sesudah Enqueue 3x ###");
        System.out.println("Size: " + queue.size());
        System.out.println("Front: " + queue.front());
        System.out.println("Is Empty: " + queue.isEmpty());
        queue.displayElements();
        
        
        StrukturQueue queue2 = new StrukturQueue(); // Buat queue baru untuk pengujian

        queue2.enqueue(2);
        queue2.enqueue(7);
        queue2.enqueue(6);
        queue2.enqueue(1);

        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("Size: " + queue2.size());
        System.out.println("Is Empty: " + queue2.isEmpty());

        System.out.println("### Sesudah Enqueue 4x ###");
        System.out.println("Size: " + queue2.size());
        System.out.println("Front: " + queue2.front());
        System.out.println("Is Empty: " + queue2.isEmpty());
        queue2.displayElements();
    }
}
