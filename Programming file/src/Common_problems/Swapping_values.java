package Common_problems;

public class Swapping_values {

	public static void main(String[] args) {
	// a very common problem in which we are asked to swap values of different values
	
	swap(10,20);	
	
	                                       } 
		public static void swap (int a,int b) {
		
		System.out.println("the value before swapping, a = " + a + " and b = " + b);

		int c=a;
        a=b; 
        b=c;
        System.out.println("after swapping, a = " + a+" and b = "+b);
        
		                                        }
	                          }