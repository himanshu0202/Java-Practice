package techie;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		Square sqr =new Square();
		doTest(rec);
		doTest(sqr);
	}
	
	public static  void doTest(GameShape shape){
		shape.displayShape();
		((Rectangle) shape).doSomething();
		((Square) shape).doWhat();
	}
}

