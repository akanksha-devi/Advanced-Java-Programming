package java8;

class Square{
	void checkSide(int side1, int side2) {
		if(side1 == side2) {
			System.out.println("2 sides are equal");
		} else if (side1 > side2) {
			System.out.println("Side1 is greater than side2");
		} else {
			System.out.println("Side1 is smaller than side2");
		}
	}
}

@FunctionalInterface
interface Shape{
	void side(int n1, int n2);
}

public class MethodRefrencingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		Shape sh = s::checkSide;  //method refrencing
		sh.side(23, 67);
	}
}