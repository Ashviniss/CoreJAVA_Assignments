
public class Add2Num {

	public static void main(String[] args) {
		
		int a =0,b = 0;
		
		System.out.println("sum of 2 numbers is " +add(100,-60));

	}
	
	public static int add(int a, int b){
        if(b == 0) return a;
        int sum = a ^ b; 
        int carry = (a & b) << 1;  //CARRY of two integer is A AND B
        return add(sum, carry);
    }

}
