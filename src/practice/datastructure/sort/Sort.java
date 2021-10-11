package practice.datastructure.sort;

public class Sort {

	int[] sorted = new int[30];

	public void intervalSort(int a[], int begin, int end, int interval) {

		for (int i = begin + interval; i <= end; i += interval) {
			int item = a[i];
			int j = i;
			while (j > begin && (a[j - interval] > a[j])) {
				a[j] = a[j - interval];
				a[j - interval] = item;
				j -= interval;
			}
		}

	}

	public void shellSort(int[] a) {
		int size = a.length;
		int interval = size / 2;
		while (interval >= 1) {
			for (int i = 0; i < interval; i++) {
				intervalSort(a, i, size - 1, interval);
			}
			interval = interval / 2;
		}
		// 핵심은 인터벌에 맞는 배열을 return 하는 것.
	}

	public void merge(int a[], int m, int middle, int n) {
		
		int i, j, k, t;
		i = m;
		j = middle + 1;
		k = m;
		while (i <= middle && j <= n) {
			if (a[i] <= a[j]) {sorted[k] = a[i++];}
			else 	{
				sorted[k] = a[j++];
			}
			k++;
		}
		if(i>middle) { // 왼쪽 집합의 수만 sorted에 다 들어간 경우
			for(t=j; t<= n; t++, k++) {
				sorted[k] = a[t];
			}
		}else {  // 오른쪽 집합의 수가 먼저 다 sorted에 들어갔을 경우(앞의 집합보다 작을 경우)
			for(t = i; t <= middle; t++, k++ )
				sorted[k] =a[t];
		}
		
		System.out.print("Merge Sort : ");
		for(t=m; t<=n; t++) {
			a[t] = sorted[t]; // 임시로 저장해 뒀던 공간 반납
			System.out.print(a[t] + " ");
		}
		System.out.println();
		
	}
	
	public void mergeSort(int a[], int m, int n) {
		int middle;
		if(m < n) {  // m == n 이 되면 해당하지 않는 조간
			middle = (m + n) / 2;
			mergeSort(a, m, middle);
			mergeSort(a,middle + 1, n);
			merge(a, m, middle, n); // 더 이상 분해할 수 없을 때; 비교하는 두 집합이 오름차순일 때;
		}
	}
}
