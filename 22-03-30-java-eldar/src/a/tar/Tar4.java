package a.tar;

public class Tar4 {

	/*
	 * define a random number named ‘salary’ with a value between 5000-6000.
	 * 
	 * Now, raise the salary in 10% - only if the result is not greater than 6000
	 * 
	 * (which is the maximum salary allowed)
	 * 
	 * print the current salary and the updated salary
	 */
	public static void main(String[] args) {

		// 1. create a random number (salary) 5000 - 6000
		double salary = (int) (Math.random() * 1001) + 5000;
		// 2. print it
		System.out.println("salary is: " + salary);
		// 3. define another variable with the salary + 10%
		double newSalary = salary * 1.1;
		System.out.println(newSalary);
		// 4. check if the new variable is more than 6000.
		if (newSalary > 6000) {
			// if more than 6000 - change it to 6000
			newSalary = 6000;
		}
		// 5. print the updated salary
		System.out.println("new salary is: " + newSalary);

	}

}
