package practice.datastructure;

public class Triangle implements Shape {

	int x,y;
	double area;
	
	
	
	public Triangle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	@Override
	public void getArea() {
		this.area= this.x * this.y * 0.5;

	}

}
