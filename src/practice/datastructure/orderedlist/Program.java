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
		
	}

}
