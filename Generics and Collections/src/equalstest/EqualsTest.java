package equalstest;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		if(one.equals(two)){
			System.out.println("one and two are equal");
		}
	}

}
class Moof{
	private int moofValue;
	Moof(int val){
		moofValue = val;
	}
	public int getMoofValue(){
		return moofValue;
	}
	public boolean equals(Object o){
		if((o instanceof Moof) && (((Moof)o).getMoofValue()==this.moofValue)){
			return true;
		}else{
			return false;
		}
	}
}