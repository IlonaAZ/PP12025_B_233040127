package Pertemuan7;

public class StrukturListTest {
	public static void main(String[] args) {
		
//		StrukturList listhead = new StrukturList();
//		listhead.addHead(2);
//		listhead.addHead(9);
//		listhead.addHead(7);
//		
//		System.out.print("Elemen awal: ");
//		listhead.displayElement();
//		
//		listhead.removeHead();
//		
//		System.out.print("Elemen akhir: ");
//		listhead.displayElement();
		
		
		
//		StrukturList listhead2 = new StrukturList();
//		listhead2.addHead(2);
//		listhead2.addHead(9);
//		listhead2.addHead(7);
//		
//		System.out.print("Elemen awal: ");
//		listhead2.displayElement();
//		
//		listhead2.removeHead();
//		listhead2.removeHead();
//		listhead2.removeHead();
//		
//		System.out.print("Elemen akhir: ");
//		listhead2.displayElement();
		
		
		
		StrukturList listhead3 = new StrukturList();
		listhead3.addHead(1);
		listhead3.addHead(5);
		listhead3.addHead(3);
		listhead3.addHead(6);
		listhead3.addHead(2);

		System.out.print("Elemen awal: ");
		listhead3.displayElement();

		listhead3.removeHead();
		listhead3.removeTail(); 
		listhead3.removeTail(); 

		System.out.print("Elemen akhir: ");
		listhead3.displayElement();

		
	}
}
