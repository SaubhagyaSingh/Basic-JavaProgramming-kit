package flowstatement;

public class Elseif {

	public static void main(String[] args) {
	int x=75;
	if (x<40) {
		System.out.println("You failed the exam");
	}
	else if (x>40 && x<70) {
		System.out.println("U Have passed with C grade");
	}
	else if (x>70 && x<90) 
	{
		System.out.println("Good work! U have passed with B grade");
	}
	else if (x>90 && x<101)
	{
		System.out.println("Congrats! you have passed with A grade");
	}
	else {
		System.out.println("Invalid value");
	}
	}
	}