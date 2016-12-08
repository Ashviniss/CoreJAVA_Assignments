// program that swaps the values of two variables without using third variable.
public class Assignment1_3 {
	
	public static void main(String[] args){
		int x=10, y=20;
		System.out.println("the values of x and y before swapping " +x +" " +y +"rsply");
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("the values of x and y after swapping "+x +" " +y +"rsply");
		
	}

}
