package exerciceStudent;

public class Student {

	String name;	
	double grade1;
	double grade2;
	double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
		
	}
	
	public double validateGrade() {
		if (finalGrade() < 60.00) {
			return 60 - finalGrade();
		}
		else {
			return 0.00;
		}
	}

}
