package Pertemuan9;

import Pertemuan7.Node;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        HEAD = null;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    public boolean find(int x) {
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu) {
            if (curNode.getData() == x) {
                ketemu = true;
            } else {
                curNode = curNode.getNext();
            }
        }

        return ketemu;
    }
    
    public int size() {
        Node curNode = HEAD;
        int jumlah = 0;

        while (curNode != null) {
            jumlah++;
            curNode = curNode.getNext();
        }

        return jumlah;
    }
    
    public void clear() {
        HEAD = null;
    }

    public void tampilList() {
        Node curNode = HEAD;
        if (curNode == null) {
            System.out.println("List kosong.");
            return;
        }

        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
	}