package Pertemuan4;

public class ListTest {
    public static void main(String[] args) {
        System.out.println("Latihan 3:");
        latihan3();
        
        System.out.println("\nTugas 1:");
        tugas1();
        
        System.out.println("\nTugas 2:");
        tugas2();
    }

    public static void latihan3() {
        StrukturList list = new StrukturList();
        
        list.addTail(3);
        list.addTail(4);
        list.addMid(7, 2);
        list.addMid(8, 2);
        list.addHead(5);

        list.displayElement(); // Output: 5 -> 3 -> 8 -> 7 -> 4 -> null
    }

    public static void tugas1() {
        StrukturList list = new StrukturList();
        
        list.addTail(2);
        list.addTail(1);
        list.addTail(3);
        list.addTail(4);
        list.addTail(4.5);

        list.displayElement(); // Output: 2 -> 1 -> 3 -> 4 -> 4.5 -> null
    }

    public static void tugas2() {
        StrukturList list = new StrukturList();
        
        list.addTail(3);
        list.addTail(4.2);
        list.addTail(1);
        list.addTail(1.1);
        list.addTail(4.5);
        list.addTail(5.5);

        list.displayElement(); // Output: 3 -> 4.2 -> 1 -> 1.1 -> 4.5 -> 5.5 -> null
    }
}
