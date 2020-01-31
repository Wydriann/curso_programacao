package exercicioEmployee;

	public class Employee {
		String name;
		double grossSalary;
		double tax;
		double percentage;
		double data;
		
		public double liquidSalary() {
			return grossSalary - tax;
		}
		
		public void updateData(double percentage) {
			grossSalary += (grossSalary * percentage) / 100.0;
			
		}
		public String toString() {
			return name+ ", $"
					+ String.format("%.2f", liquidSalary());
		}
		
	}
	
	
