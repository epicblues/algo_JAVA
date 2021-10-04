package practice.datastructure.orderedlist;

public class Polynomial {
	private int degree; 
	private float coef[] = new float[20];
	
	public Polynomial(int degree, float[] coef) {
		this.degree = degree; // 몇차 다항식인가?
		this.coef = coef; // coefficient : 계수
	}
	
	public Polynomial(int degree) { // 공백 다항식을 만드는 연산
		this.degree = degree;
		for (int i = 0; i <=degree; i++) {
			this.coef[i] = 0;
		}
	}
	
	public int getDegree() {
		return this.degree;
	}
	
	public float getCoef(int i) {
		return this.coef[i]; // 계수 구하기
	}
	
	public float setCoef(int i, float coef) {
		
		return this.coef[i] = coef;
	}
	
	public void printPoly() {
		int temp = this.degree;
		for(int i = 0; i <= this.degree; i++) {
			System.out.printf("%3.0fx^%d", this.coef[i], temp--);
		}
		
		System.out.println();
	}
}
