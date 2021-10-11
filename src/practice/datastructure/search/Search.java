package practice.datastructure.search;

public class Search {
	public void sequentialSearch1(int a[], int size, int key) {
		int i = 0;
		System.out.printf("\n %d를 순차검색하여라! ->>", key);
		while(i<size && a[i] != key) {
			i++;
		}
		
		if(i < size) {
			System.out.printf("%d 번째에 검색 성공 \n" , i + 1);
			
		}
		else {
			System.out.printf("%d 번째에 검색 실패! \n", i + 1);
		}
	}
	
	
}
