package practice.datastructure;

public class PointXY {
	int x,y;
	PointXY(int x, int y) {
		this.x= x;
		this.y= y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	void moveXY(int x,int y) {
		this.x += x;
		this.y += y;
	}
}
