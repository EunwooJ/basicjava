package F_OOP2;

public class PointTest {
	public static void main(String[] args) {
		
		Point3D p3d = new Point3D(10,20,30); 
		
		
	}
}


class Point2{
	
	int x;
	int y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}


class Point3D extends Point2{
	int z;
	Point3D(int x, int y, int z){
		super(x,y); //Point2클래스(부모)의x,y
		super.x = 100;   //this.x도 가능 자신의 인스턴스내에서 x찾다가 없으면 부모쪽으로 감
		super.y = 200;
		this.z = z;
	}
}














