package practice.datastructure.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int i, j, min;
		int[] array = { 69, 10, 30, 2, 16, 8, 31, 22 };

		for (i = 0; i < array.length-1; i++) {
			min = i;
			for (j = i + 1; j < array.length; j++) {
				if(array[min] > array[j]) min = j;
				
			}
			if (array[i] > array[min]) {
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
			System.out.print(array[i] + " ");
		}
		System.out.println(array[array.length - 1]);
		

	}

}
