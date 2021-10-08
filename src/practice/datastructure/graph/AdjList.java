package practice.datastructure.graph;

public class AdjList {
	private GraphNode[] head = new GraphNode[10];
	private int totalV=0;
	
	public void insertVertex(int v) {
		totalV++;
	}
	
	public void insertEdge(int v1, int v2) {
		if(v1 >= totalV  || v2>= totalV) {
			System.out.println("그래프에 없는 정점입니다!"); // 1 to 1 은 그래프의 특징 상 존재할 수가 없다.
			return;
		}
		
		GraphNode gNode = new GraphNode();
		gNode.vertex = v2;
		gNode.link = head[v1]; // 처음에는 null을 pointing한다.
		head[v1] = gNode;
	}
	
	public void printAdjList() {
		for(int i = 0; i <totalV;i++) {
			GraphNode temp = head[i];
			
			System.out.println((char)(i + 'A') + " is connected to :\n\t");
			while(temp != null) {
				System.out.print((char)(temp.vertex + 'A') + " ");
				temp = temp.link;
			}
			System.out.println();
		}
	}
}
