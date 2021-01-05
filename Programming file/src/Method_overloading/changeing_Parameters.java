package Method_overloading;

public class changeing_Parameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int l=20;
int b=30;
float r = 5.5f;
area(l,b);
area(r);
		
		
		
	}
public static int area(int n1,int n2) {
	int result=n1*n2;
	return result;
}
public static float area(float n) {
	float result = 3.14f*n*n;
	return result;
}
}
