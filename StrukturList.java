package Pertemuan3;
public class StrukturList {
	
	Node HEAD;
	
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
	
	
	public void displayElement() {
		Node curNode = HEAD;
		while (curNode != null) {
			System.out.print(curNode.getData()+ "  ");
			curNode = curNode.getNext();
		}
	}
}
































