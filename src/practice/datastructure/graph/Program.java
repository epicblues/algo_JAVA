package practice.datastructure.graph;

public class Program {
	public static void main(String[] args) {
//		AdjMatrix matrix = new AdjMatrix();
//		matrix.insertVertex(1);
//		matrix.insertVertex(1);
//		matrix.insertVertex(1);
//		matrix.insertVertex(1);
//		matrix.insertVertex(1);
//		
//		matrix.insertEdge(0, 4);
//		matrix.insertEdge(1, 2);
//		matrix.insertEdge(3, 2);
//		matrix.insertEdge(4, 1);
//		matrix.insertEdge(2, 4);
//		matrix.printMatrix();
		
		AdjList list = new AdjList();
		list.insertVertex(0);
		list.insertVertex(0);
		list.insertVertex(0);
		list.insertVertex(0);
		list.insertVertex(0);
		list.insertEdge(0, 3);
		list.insertEdge(0, 1);
		list.insertEdge(1, 3);
		list.insertEdge(1, 2);
		list.insertEdge(2, 3);
		list.insertEdge(2, 1);
		list.insertEdge(3, 2);
		list.insertEdge(3, 1);
		list.insertEdge(3, 0);
		
		list.printAdjList();
	}
}
