package Common_problems;

public class Pyramid_pattern_problem {

	public static void main(String[] args) {
    //Nested for loop for pyramid * pattern
		int x=6;
		for(int y=0;y<x;y++)
		{
		for (int z=0;z<=y;z++)
		{
		System.out.print("*");	
		}
		System.out.println();
		}
	}
	}
