package practice.datastructure;

public class Program {

	public static void main(String[] args) {
		
		String [][] school = {{"홍길동","김철수","한영희","최관우","이진주"}, {"박정수","양준식","안선영","백정원","유승환"}};
		
		
		for(int i = 0; i < school.length; i++) {
			System.out.printf("%d반 목록 : ", i + 1);
			for (int j = 0; j < school[i].length; j++) {
				System.out.print(school[i][j] + "/");
			}
			System.out.println("");
		}
		
		
		for(int i = 1; i<=5; i++) {
			for(int j = 0; j < 5-i ; j++ ) { 
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		PointXY varXY = new PointXY(100,100);
		System.out.printf("x:%d, y:%d\n", varXY.getX(), varXY.getY());
		varXY.setX(200);
		System.out.printf("x:%d, y:%d\n", varXY.getX(), varXY.getY());
		varXY.setY(300);
		System.out.printf("x:%d, y:%d\n", varXY.getX(), varXY.getY());
		varXY.moveXY(50,50);
		System.out.printf("x:%d, y:%d\n", varXY.getX(), varXY.getY());
		
		
		Triangle t1 = new Triangle(30,15);
		Rectangle t2 = new Rectangle(30,15);
		t1.getArea();
		t2.getArea();
		System.out.println("삼각형의 넓이 = " + t1.area);
		System.out.println("삼각형의 넓이 = " + t2.area);
	}

}
