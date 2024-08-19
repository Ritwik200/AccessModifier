package Access_Modifier;


class A{
	int x=100;
}
public class C_01_Private {
	
	public static void main(String[] args) {
		A obj =new A();
		int op = obj.x;
		System.out.println("Output is: " + op);
	}
}
