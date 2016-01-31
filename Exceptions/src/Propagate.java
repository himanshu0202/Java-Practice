
public class Propagate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = reverse("abcde");
		try{
			if (str==null){
				System.out.println("String is null and cannot be reversed");
			}else{
				System.out.println("reversed String: " + str);
			}
		}
		finally{
			System.out.println("End of the program");
		}
		
	}
	
	static String reverse(String s){
			if(s.length()==0){
				return null;
			}
			String reverseStr="";
			for(int i=s.length()-1;i>=0;i--){
				reverseStr += s.charAt(i);
			}
		return reverseStr;
	}

}
