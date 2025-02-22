package Pertemuan3;

public class ListTest {
	public static void main(String[] args) {
//		StrukturList listhead = new StrukturList();
//		listhead.addHead(5);
//		listhead.addHead(4);
//		listhead.addHead(3);
		
		StrukturList listhead2 = new StrukturList();
		listhead2.addHead(1);
		listhead2.addHead(2);
		listhead2.addHead(3);
		
		StrukturList listhead3 = new StrukturList();
		listhead3.addHead(7);
		listhead3.addHead(5);
		listhead3.addHead(4);
		listhead3.addHead(1);
		
//		System.out.print("Elemen: ");
//		listhead.displayElement();
		System.out.print("Elemen: ");
		listhead2.displayElement();
		System.out.println();
		System.out.print("Elemen: ");
		listhead3.displayElement();
	}
}