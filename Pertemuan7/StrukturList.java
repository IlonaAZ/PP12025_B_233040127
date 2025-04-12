package Pertemuan7;
public class StrukturList {
	
	Node HEAD;
	
	public boolean isEmpty() {
		return HEAD == null;
	}
	
	public void addTail (int data) 
	{
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
	
	public void removeTail() {
		Node preNode = null, LastNode;
		if (HEAD != null) {
			if (HEAD.getNext()== null) {
				HEAD=null;
			}else{
				LastNode= HEAD;
				while(LastNode.getNext()!= null) {
					preNode=LastNode;
					LastNode = LastNode.getNext();
				}
				preNode.setNext(null);
				dispose(LastNode);
			}
		}else{
		System.out.println("List kosong");
		}
	}
	
	
	public void addHead(int data) {
		Node newNode = new Node(data);
		if (HEAD==null) {
			HEAD = newNode;
		}
		else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}
	
	public void dispose(Node temp) {
		temp.setNext (null);
		temp = null;
	}
	
	public void removeHead( ) {
		if (isEmpty()) {
			System.out.println("List Kosong");
	}
		else {
			Node temp = HEAD;
			HEAD = HEAD.getNext();
			dispose(temp);
		}
	}
	
	public void displayElement() {
		Node curNode = HEAD;
		while (curNode != null) {
			System.out.print(curNode.getData()+ "  ");
			curNode = curNode.getNext();
		}
		System.out.println();
	}
}