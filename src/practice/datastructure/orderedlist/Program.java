package practice.datastructure.orderedlist;

public class Program {

	public static void main(String[] args) {
		
		float a[] = new float[] {4,3,5,0};
		float b[] = new float[] {3,1,0,2,1};
		
		Polynomial A = new Polynomial(3,a);
		Polynomial B = new Polynomial(4,b);
		
		OperatePoly operPol = new OperatePoly();
		
		Polynomial C = operPol.addPoly(A, B);
		
		System.out.print(" A : ");
		A.printPoly();
		System.out.print(" B : ");
		B.printPoly();
		System.out.print(" C : ");
		C.printPoly();
		
		
		SparseMatrix spm = new SparseMatrix(7,4);
		spm.setValue(new MatrixValue(0,3,9));
		spm.setValue(new MatrixValue(1,1,1));
		spm.setValue(new MatrixValue(3,2,7));
		spm.setValue(new MatrixValue(5,0,3));
		
		
		
		
		
		SparseMatrixOperator operator = new SparseMatrixOperator(spm);
		SparseMatrix spm2 = operator.transposeSM();
		
		printMatrix(spm);
		printMatrix(spm2);
	}

	private static void printMatrix(SparseMatrix spm) {
		int[][] matrix = spm.getMatrix();
		for(int i = 0; i < spm.getMatrixRow(); i++) {
			for(int j = 0; j < spm.getMatrixCol(); j++) {
				System.out.print(matrix[i][j] + "/");
			}
			System.out.println();
		}
	}
}
