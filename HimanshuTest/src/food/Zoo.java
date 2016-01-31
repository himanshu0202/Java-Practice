package food;

public class Zoo {

public static void main(String[] args){ 
	new Moo().useMyCoolMethod();
	String a= new Zoo().CoolMethod();
	System.out.println(a);
}
 public String CoolMethod(){
	 return "cool baby";
 }

}


class Moo extends Zoo {
    public void useMyCoolMethod() {
      System.out.println("Moo says, " + this.CoolMethod());
      Zoo z = new Zoo();
      System.out.println("Zoo says, " + z.CoolMethod());
} }