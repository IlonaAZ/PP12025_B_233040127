package Pertemuan13;

public class GraphMain {

	public static void main(String [] args) {
		Graph graph = new Graph (4);
		
//		graph.addVertex('A');
//		graph.addVertex('B');
//		graph.addVertex('C');
//		graph.addVertex('D');
//		graph.addVertex('E');
//		
//		graph.addEdge(0, 1);
//		graph.addEdge(1, 2);
//		graph.addEdge(0, 3);
//		graph.addEdge(3, 4);
		
//		graph.addVertex('A');
//		graph.addVertex('B');
//		graph.addVertex('C');
//		graph.addVertex('D');
//		
//		graph.addEdge(0, 1);
//		graph.addEdge(1, 3);
//		graph.addEdge(3, 0);
//		graph.addEdge(0, 2);
//		graph.adjacencyMatrix();
//		System.out.println();
		
		System.out.println("\n=== latihan 6 ===");
        Graph graph1 = new Graph(4); // 4 simpul: A, B, C, D
        graph1.addVertex('A'); // index 0
        graph1.addVertex('B'); // index 1
        graph1.addVertex('C'); // index 2
        graph1.addVertex('D'); // index 3

        graph1.addEdge(0, 1); // A - B
        graph1.addEdge(0, 2); // A - C
        graph1.addEdge(0, 3); // A - D
        graph1.addEdge(1, 3); // B - D

        System.out.println("Adjacency Matrix (Graph 2):");
        graph1.adjacencyMatrix();
	}
}
