package practice.datastructure;

public class Rectangle implements Shape{

	int x, y;
	double area;
	
	Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public void getArea() {
		this.area = this.x * this.y;
	}

}
