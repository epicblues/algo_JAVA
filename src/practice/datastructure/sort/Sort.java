package practice.datastructure.sort;

public class Sort {
	
	
	
	public void intervalSort(int a[], int begin, int end, int interval) {

		for (int i = begin + interval; i <= end; i += interval) {
			int item = a[i];
			int j = i;
			while (j > begin && (a[j - interval] > a[j])  ) {
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
			for(int i = 0; i < interval; i++ ) {
				intervalSort(a,i, size - 1, interval);
			}
			interval = interval / 2;
		}
		// 핵심은 인터벌에 맞는 배열을 return 하는 것.
	}
}
