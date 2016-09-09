import java.util.Scanner;


public class cal {
	void calculate() { 
		Scanner userInput = new Scanner (System.in);
	
		
		String Weight, Height, Age, Ans, c;
		double m, h, a, cons, bmr;
		
		Weight = "Enter weight in kg:";
		Height = "Enter height in cm:";
		Age = "Enter age:";
		Ans = "Your BMR is";
		c = "cal";
		System.out.print(Weight);
		m = userInput.nextDouble();
		System.out.print(Height);
		h = userInput.nextDouble();
		System.out.print(Age);
		a = userInput.nextDouble();
		cons = 88.362;
		
		
		bmr = ((13.397 * m) + (4.799 * h) + (5.677 * a) + (cons));
		System.out.println(Ans + " " + bmr + c);
		
	
	}

	public void cal() {
		// TODO Auto-generated method stub
		
	}

}
