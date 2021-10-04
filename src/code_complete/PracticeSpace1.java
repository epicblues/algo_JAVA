package code_complete;



public class PracticeSpace1 {

	public static void main(String[] args) {
		System.out.println(Factorial(5));
	}
	
//	private static void quickSort(int firstIndex, int lastIndex, String[] names) {
//		if (lastIndex > firstIndex) {
//			int midPoint = Partition(firstIndex, lastIndex,names);
//			quickSort(firstIndex, midPoint - 1, names);
//			quickSort(midPoint+1, lastIndex, names);
//		}
//	}
	
	private static int Factorial(int number) {
		int intermediateResult = 1;
		for (int factor = 2; factor <= number; factor ++) {
			intermediateResult = intermediateResult * factor;
		}
		return intermediateResult;
		
	}
	
}
