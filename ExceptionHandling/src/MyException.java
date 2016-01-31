public class MyException{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strFood = args[0];
		try{
			new MyException().checkFood(strFood);
		}catch(BadFoodException e){
			System.err.println("Bad Food given :censored: .");
		}
	}
	
	void checkFood(String str) throws BadFoodException{
		if("bad".equalsIgnoreCase(str))
			throw new BadFoodException();
			System.out.println("Food is delicious");
	}

}
