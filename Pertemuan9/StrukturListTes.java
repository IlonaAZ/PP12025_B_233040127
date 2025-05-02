package Pertemuan9;

public class StrukturListTes {
public static void main(String[] args) {


//	StrukturList list = new StrukturList();
//	list.addLast(5);
//	list.addLast(4);
//	list.addLast(6);
//	
//	list.tampilList();
//	
//	System.out.println(list.find(6));


//	StrukturList list2 = new StrukturList();
//	list2.addLast(7);
//	list2.addLast(6);
//	list2.addLast(4);
//	list2.addLast(2);
//	list2.addLast(3);
//	
//	list2.tampilList();
//	
//	 System.out.println("Jumlah elemen: " + list2.size());
//	
	StrukturList list3 = new StrukturList();
	list3.addLast(4);
	list3.addLast(3);
	list3.addLast(7);
	list3.addLast(8);
	list3.addLast(1);
	list3.addLast(9);
	
	System.out.println("Sebelum di-clear:");
	list3.tampilList();

	list3.clear();

	System.out.println("Setelah di-clear:");
	list3.tampilList();
	
}
} 