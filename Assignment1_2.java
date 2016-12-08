// program to print the result of the following expressions provided the integer variable a is
//20 and b is 10.
public class Assignment1_2 {
	public static void main(String[] args){
		int a=20, b=10,c=0,d=0,e=0;
		
		b = a-- - --a;
		System.out.println("the value of b is "+b);
		
		c = a--;
		System.out.println("the value of c is "+c);
		
		d = a>>2;
		System.out.println("the value of d is "+d);
		
		e = a & b;
		System.out.println("the value of e is "+e);
	}
	

}
