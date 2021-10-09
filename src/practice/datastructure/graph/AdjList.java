package practice.datastructure.graph;

public class AdjList {
	private GraphNode[] head = new GraphNode[10];
	private int totalV = 0;

	public void insertVertex(int v) {
		totalV++;
	}

	public void insertEdge(int v1, int v2) {
		if (v1 >= totalV || v2 >= totalV) {
			System.out.println("그래프에 없는 정점입니다!"); // 1 to 1 은 그래프의 특징 상 존재할 수가 없다.
			return;
		}

		GraphNode gNode = new GraphNode();
		gNode.vertex = v2;
		gNode.link = head[v1]; // 처음에는 null을 pointing한다.
		head[v1] = gNode;
	}

	public void printAdjList() {
		for (int i = 0; i < totalV; i++) {
			GraphNode temp = head[i];

			System.out.println((char) (i + 'A') + " is connected to :\n\t");
			while (temp != null) {
				System.out.print((char) (temp.vertex + 'A') + " ");
				temp = temp.link;
			}
			System.out.println();
		}
	}

	public void DFS(int v) {
		GraphNode w = new GraphNode();
		LinkedStack S = new LinkedStack();
		boolean visited[] = new boolean[10];
		S.push(v);
		visited[v] = true;
		System.out.printf(" %c", v + 65);
		while (S.top != null) {
			w = head[v];
			while (w != null) {
				if (!visited[w.vertex]) {
					S.push(w.vertex);
					System.out.printf(" %c", w.vertex + 65);
					visited[w.vertex] = true;
					v = w.vertex;
					w = head[v]; // 여긴 검색이 안 된 곳이었으니까 여기를 더 파자.
				} else {
					w = w.link;
				}

			}
			v = S.pop();
		}
		System.out.println();

	}

	public void BFS(int v) {
		GraphNode w = new GraphNode();
		LinkedQueue q = new LinkedQueue();
		boolean[] visited = new boolean[10];
		q.enQueue(v);
		visited[v] = true;
		System.out.printf(" %c", 65 + v);
		
		 // head의 주변부 탐색 시작
		while(!q.isEmpty()) {
			v = q.deQueue(); // 더 이상 v를 BFS할 이유가 없다.
			for(w = head[v]; w != null; w = w.link) {
				int vertex = w.vertex;
				if(!visited[vertex]) {
					visited[vertex] = true;
					System.out.printf(" %c", 65 + vertex);
					q.enQueue(vertex);
				}
			}
		}
		
		
		System.out.println();
		
	}
}
