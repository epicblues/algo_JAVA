package practice.datastructure.sort;

public class Program {
	public static void main(String[] args) {
		Sort s = new Sort();
		int[] a = new int[] { 69, 10, 30, 2, 16, 8, 31, 22 };
		s.shellSort(a);

		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}
