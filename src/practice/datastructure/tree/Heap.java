package practice.datastructure.tree;

import java.lang.reflect.Array;
import java.util.Comparator;

import org.springframework.util.comparator.ComparableComparator;

public class Heap<T extends Comparable<T>> {

	Comparator<T> comparator = new ComparableComparator<T>();

	private int heapSize;
	private final T[] itemHeap;

	public Heap() {
		heapSize = 0;
		itemHeap = (T[]) new Object[50];

	}

	public void insertHeap(T item) {
		// 최대 힙
		int i = ++heapSize;
		while ((i != 1) && (comparator.compare(item, itemHeap[i / 2])) > 0) {
			itemHeap[i] = itemHeap[i / 2];
			i = i / 2;
		}

		itemHeap[i] = item;
	}

	public int getHeapSize() {
		return heapSize;
	}

	public T deleteHeap() {
		int parent, child;
		T item, temp;
		item = itemHeap[1]; // 루트 노드의 데이터를 미리 보관 (가장 최대값만 삭제하니까)
		temp = itemHeap[heapSize--]; // 루트 노드가 삭제될 때 이동할 마지막 데이터

		parent = 1;
		child = 2;

		while (child <= heapSize) {
			if ((child < heapSize) && (comparator.compare(itemHeap[child], itemHeap[child + 1]) < 0)) {
				child++;
			}
			if(comparator.compare(temp,itemHeap[child]) >= 0) break;
			// 이 빈 공간에는 temp 가 그 둘보다 부모로 들어가야 한다(두 자식이 temp 보다 우선순위가 낮으므로)
			itemHeap[parent] = itemHeap[child];
			
			parent = child;
			child *= 2;
		}
		itemHeap[parent] = temp;
		return item;
	}
	
	public void printHeap() {
		System.out.print("\nHeap >>>");
		for(int i = 1; i <= heapSize; i++) {
			System.out.printf("[%s]  ", itemHeap[i]);
		}
	}
}
