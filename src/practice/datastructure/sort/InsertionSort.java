package practice.datastructure.sort;

public class InsertionSort {

	public static void insertionSort(int a[]) {
		int i, j, temp; // temp는 실제 값, i,j는 index
		if(a.length == 1) return;
		
		for(i = 1; i < a.length; i++) {
			temp = a[i]; // 비교값을 미리 저장.
			j = i;
			while((j > 0) && (temp < a[j-1])) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = temp;	
		}
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {69,10,30,2,16,8,31,22};
		
		insertionSort(a);
		
		for(int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		
	}

	
	
	
}
