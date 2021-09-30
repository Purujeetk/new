package math1;

public class Q3 {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		 System.out.println("before swap");
		 System.out.println("first "+ a);
		 System.out.println("second" + b);
		 
		 a=a-b;
		 b=a+b;
		 a=b-a;
		 System.out.println("after swap");
		 System.out.println("first "+ a);
		 System.out.println("second" + b);
	}

}
