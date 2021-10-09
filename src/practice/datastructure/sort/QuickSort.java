package practice.datastructure.sort;

public class QuickSort {
	static int i = 0;
	public static void main(String[] args) {
		int a[] = {69,10,30,2,16,8,31,22};
		quickSort(a,0,a.length -1);
	}
	
	public static int partition(int a[], int begin, int end) {
		int pivot, temp, L, R, t;
		
		L = begin;
		R = end;
		pivot = (begin + end) / 2;
		System.out.printf("\n [퀵정렬 %d 단계 : pivot = %d ]", ++i, a[pivot]);
		
		while(L < R) {
			while((a[pivot] > a[L]) && (L<R)) L++;
			while((a[pivot] <= a[R]) && (L<R)) R--;
			if( L < R) {
				temp = a[L];
				a[L] = a[R];
				a[R] = temp;
				
				if(L == pivot) { // L과 R 원소를 교환하여 피봇(원소) 위치가 교환된 경우
					for(t = 0; t<a.length; t++) {
						System.out.printf("%3d ", a[t]);
					}
					System.out.println();
					return R;
				}
			}
		}
		
		// (L > R)이 된 경우
		temp = a[pivot];
		a[pivot] = a[R];
		a[R]  = temp;
		for(t = 0; t<a.length; t++) {
			System.out.printf("%3d ", a[t]);
		}
		System.out.println();
		return R;
	}
	
	public static void quickSort(int a[], int begin, int end) {
		if(begin < end) {
			int p;
			p = partition(a,begin,end); // p는 정렬이 끝난 제자리값. (왼쪽에는 p보다 작은 값들의 집합, 오른쪽에는 p보다 큰 값들의 집합)
			quickSort(a,begin, p-1);
			quickSort(a,p + 1,end);
			
		}
	}

}
