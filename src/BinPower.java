
import java.util.Scanner;

public class BinPower {
	//Fixed Scanner bug for float inputs
	
	Scanner input = new Scanner(System.in);
	String name = "";
	
	public BinPower() {
		
	}

	public void setBinary() {
		
		double exp = 3;
		double base = 2;
		double answer = 0;
		System.out.println("Hello amazing Java student! What is your name?");
		name = input.nextLine();
		System.out.println("Thanks for using my most awesome program, "+ name+"!");
		System.out.println("Please choose a base");
		base = input.nextDouble();
		System.out.println("You chose: " + base);
		System.out.println("Please choose an exponet");
		exp = input.nextDouble();
		System.out.println("You chose: " + exp);
		//don't need: Math myMath = new Math();
		//Why? it is static -- means it's built in, just use it!
		// (int) "Type Casting" == pow requires double, which makes no sense in binary
		// so type cast to the correct answer
		answer = Math.pow(base, exp);
		System.out.println("Answer is: " + answer);
		//String is capitalized because it's a Class
		//int is not capitalized because it is a primitive type, means not Class
		//Integer - full name with capital is a Class
		
	}

}
