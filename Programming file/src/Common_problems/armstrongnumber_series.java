package Common_problems;

public class armstrongnumber_series {

	public static void main(String[] args) {
		 int c=0,a,temp;  
		    int n=153;//It is the number to check armstrong  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
		}  

	// A positive number is called armstrong number if it is equal to the sum of cubes of its digits
//example:0,1,153,370,371,407