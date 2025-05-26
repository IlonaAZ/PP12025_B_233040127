package Pertemuan12;

public abstract class AbstractStack {
    // Method untuk menambahkan item ke stack
    public abstract void push(Object item);

    // Method untuk menghapus dan mengembalikan item teratas dari stack
    public abstract Object pop();

    // Method untuk mengecek apakah stack kosong
    public abstract boolean isEmpty();
}

