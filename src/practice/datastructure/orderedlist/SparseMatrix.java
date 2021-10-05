package practice.datastructure.orderedlist;

public class SparseMatrix {
	private int matrixRow;
	private int matrixCol;
	private int[][] Matrix;
	
	public SparseMatrix(int matrixRow, int matrixCol) {
		super();
		this.matrixRow = matrixRow;
		this.matrixCol = matrixCol;
		Matrix = new int[matrixRow][matrixCol];
	}
	
	public void setValue(MatrixValue value) {
		this.Matrix[value.getRow()][value.getCol()] = value.getValue();
	}

	public int getMatrixRow() {
		return matrixRow;
	}

	public void setMatrixRow(int matrixRow) {
		this.matrixRow = matrixRow;
	}

	public int getMatrixCol() {
		return matrixCol;
	}

	public void setMatrixCol(int matrixCol) {
		this.matrixCol = matrixCol;
	}

	public int[][] getMatrix() {
		return Matrix;
	}

	public void setMatrix(int[][] matrix) {
		Matrix = matrix;
	}
	
	
	
	
}
