package practice.datastructure.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int i, j, temp, size;
		int[] a = { 69, 10, 30, 2, 16, 8, 31, 22 };
		size = a.length;

		for (i = size - 1; i > 0; i--) {
			for(j = 0; j < i; j++) {
				
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(i = 0; i < a.length; i ++) {
			System.out.print(a[i] + " ");
		}

	}

}
