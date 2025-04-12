package MiddlePertemuan7;

public class StrukturListTest {
	public static void main(String[] args) {
		StrukturList list = new StrukturList();
		list.addTail(2);
		list.addTail(6);
		list.addTail(3);
		list.addTail(5);
		list.addTail(1);
		
		System.out.print("Elemen awal: ");
		list.displayElement();
		
		list.removeMid(2);
		list.removeMid(2);
		list.removeMid(2);
		
		System.out.print("Elemen akhir: ");
		list.displayElement();

}
}