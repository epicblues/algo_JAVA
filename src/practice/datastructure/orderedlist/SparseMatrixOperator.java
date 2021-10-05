package practice.datastructure.orderedlist;

public class SparseMatrixOperator {

	private SparseMatrix inputMatrix;
	private SparseMatrix resultMatrix;
	
	public SparseMatrixOperator(SparseMatrix inputMatrix) {
		this.inputMatrix = inputMatrix;
		this.resultMatrix = new SparseMatrix(inputMatrix.getMatrixCol(), inputMatrix.getMatrixRow());
	}
	
	
	public SparseMatrix transposeSM() {
		int [][] matarray = inputMatrix.getMatrix();
		for(int i = 0; i < inputMatrix.getMatrixRow(); i++) {
			for(int j = 0; j < inputMatrix.getMatrixCol();j++) {
				if(matarray[i][j] != 0)
				resultMatrix.setValue(new MatrixValue(j,i,matarray[i][j]));
			}
		}
		
		
		return this.resultMatrix;
	}
	
}
