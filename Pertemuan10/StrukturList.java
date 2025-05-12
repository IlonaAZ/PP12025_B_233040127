package Pertemuan10;

public class StrukturList {
	
	Node HEAD;
	
	public boolean isEmpty() {
	    return HEAD == null;
	}

	
	public void addHead(MataKuliah data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			HEAD = newNode;
		}
		else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}
	
	public void addTail (MataKuliah data) {
		Node newNode = new Node(data);
		
		if (HEAD==null) 
		{
			HEAD = newNode;
		}
		else
		{
			Node posNode = null;
			Node curNode = HEAD;
			
			while (curNode != null)
			{
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode);
	  }
   }
	
	public void addMid(MataKuliah data, int position) {
        if (position <= 0) {
            addHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node curNode = HEAD;
        int index = 0;

        while (curNode != null && index < position - 1) {
            curNode = curNode.getNext();
            index++;
        }

        if (curNode == null) {
            addTail(data);
        } else {
            newNode.setNext(curNode.getNext());
            curNode.setNext(newNode);
        }
    }
	
	public void displayElement() {
		if (isEmpty()) {
			System.out.println("List Kosong");
		}
		else {
			Node curNode = HEAD;
			while (curNode != null) {
				System.out.println(
						"Kode: " + curNode.getData().getKode() +
						", Nama: " + curNode.getData().getNama() +
						", SKS: " + curNode.getData().getSks()
					);
				curNode = curNode.getNext();
			}
			System.out.println();
		}
	}
}
