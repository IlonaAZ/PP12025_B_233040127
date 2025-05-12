package Pertemuan10;
public class ListMKTest {

	public static void main (String[] args) {
		StrukturList list = new StrukturList();
		
//		list.addHead(new MataKuliah ("IF004", "Konstruksi PL Berorientasi Objek", 3));
//		list.addTail(new MataKuliah ("IF003", "Struktur Diskrit", 3));
//		list.addTail(new MataKuliah ("IF002", "Pemograman Web", 3));
//		list.addTail(new MataKuliah ("IF001", "Dasar Pemograman", 4));
//		list.displayElement();
		
//		list.addTail(new MataKuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));	
//		list.addMid(new MataKuliah("IF003", "Struktur Diskrit", 3), 3);
//		list.addMid(new MataKuliah("IF002", "Pemrograman Web", 3), 2);
//		list.addTail(new MataKuliah("IF001", "Dasar Pemrograman", 4));
//		list.displayElement();
//		
//		
//		list.addTail(new MataKuliah ("IF004", "Konstruksi PL Berorientasi Objek", 3));
//		list.addTail(new MataKuliah ("IF003", "Struktur Diskrit", 3));
//		list.addTail(new MataKuliah ("IF002", "Pemograman Web", 3));
//		list.addTail(new MataKuliah ("IF001", "Dasar Pemograman", 4));
//		list.displayElement();
		
		list.addHead(new MataKuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));	
		list.addMid(new MataKuliah("IF003", "Struktur Diskrit", 3), 3);
		list.addMid(new MataKuliah("IF002", "Pemrograman Web", 3), 2);
		list.addTail(new MataKuliah("IF001", "Dasar Pemrograman", 4));
		list.displayElement();
	}
}
