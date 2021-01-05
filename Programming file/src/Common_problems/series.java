package Common_problems;
import java.util.*;
public class series {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			int q=input.nextInt();
			for(int i=0;i<q;i++){
			int a =input.nextInt();
			int b=input.nextInt();
			int n=input.nextInt();
			for(int x=0;x<n;x++) 
			{
				 a=a+(int)Math.pow(2,x)*b;
				System.out.println(a);
			
			
			
			}
}
		}
}
}