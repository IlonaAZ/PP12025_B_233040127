package Pertemuan12;

public class StrukturStack {
    private int[] array;
    private int capacity;
    private int TOP;

    public final int MIN = -1;

    // Konstruktor
    public StrukturStack(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    // Cek apakah stack kosong
    public boolean isEmpty() {
        return (TOP == MIN);
    }

    // Cek apakah stack penuh
    // Karena indeks dimulai dari 0, maka kapasitas maksimal indeks adalah capacity-1
    public boolean isFull() {
        return TOP == capacity - 1;
    }

    // Menambahkan elemen ke stack
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh, tidak bisa menambahkan data: " + data);
        } else {
            TOP++;
            array[TOP] = data;
            System.out.println("Data " + data + " berhasil ditambahkan ke stack.");
        }
    }

    // Menghapus elemen paling atas dan mengembalikan nilainya
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak ada data untuk di-pop.");
            return -1; // Bisa juga lempar exception kalau mau
        } else {
            int data = array[TOP];
            TOP--;
            System.out.println("Data " + data + " berhasil dihapus dari stack.");
            return data;
        }
    }

    // Mengintip elemen paling atas tanpa menghapus (alias top)
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak ada data untuk di-top.");
            return -1;
        } else {
            return array[TOP];
        }
    }

    // Menampilkan semua elemen stack dari atas ke bawah
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
        } else {
            System.out.println("Isi stack dari atas ke bawah:");
            for (int i = TOP; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }
    }

    // Mendapatkan ukuran stack saat ini
    public int size() {
        return TOP + 1;
    }
}
