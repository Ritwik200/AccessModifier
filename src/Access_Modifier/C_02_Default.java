package Access_Modifier;

class B{
	int x =10;
	public void b1() {
		System.out.println("print method");
	}
	protected int z=220;
	protected void ProtectedMethod() {
		System.out.println("protected method");
	}
}
public class C_02_Default {
	
	public static void main(String[] args) {
		B obj=new B();
		int op = obj.z;
		System.out.println("Value of z is "+ op);
		obj.b1();
		obj.ProtectedMethod();
	}
}
