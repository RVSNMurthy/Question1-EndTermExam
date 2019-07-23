package main;

import java.util.Scanner;

class Courses {
	public String displayCourseDetails(String dept) {

		return "You have chosen " + dept
				+ " department.\nThe common subjects are:\n1. Engineering Mathematics\n2. Physics\n3. Chemistry\n";
	}
}

class ECE extends Courses { // extend the parent class here
	public String displayCourseDetails(String dept) {
		// write or edit your code here
		Courses c = new Courses();
		String commonSubjects = c.displayCourseDetails(dept);// call the parent function after using inheritence
		String subject1 = "Microprocessor"; // write the specific subjects name here
		String subject2 = "Linear Integrated Circuits"; // write the specific subjects name here

		String specificSubjects = " specific subjects are:\n4. " + subject1 + "\n5. " + subject2;
		return commonSubjects + dept + specificSubjects;

	}
}

class Mechanical { // extend the parent class here
	public String displayCourseDetails(String dept) {
		// write or edit your code here
		Courses c = new Courses();
		String commonSubjects = c.displayCourseDetails(dept);// call the parent function after using inheritence
		String subject1 = "Fluid Mechanics"; // write the specific subjects name here
		String subject2 = "Thermodynamics"; // write the specific subjects name here

		String specificSubjects = " specific subjects are:\n4. " + subject1 + "\n5. " + subject2;
		return commonSubjects + dept + specificSubjects;

	}

}

class CSE { // extend the parent class here
	public String displayCourseDetails(String dept) {

		// write or edit your code here
		Courses c = new Courses();
		String commonSubjects = c.displayCourseDetails(dept);// call the parent function after using inheritence
		String subject1 = "Network Theory"; // write the specific subjects name here
		String subject2 = "Operating Systems"; // write the specific subjects name here

		String specificSubjects = " specific subjects are:\n4. " + subject1 + "\n5. " + subject2;
		return commonSubjects + dept + specificSubjects;
	}
}

public class Question1 {
	public static void main(String[] args) {
		System.out.println("Departments:");
		System.out.println(" 1) ECE \n 2) Mechanical \n 3) CSE");
		System.out.println("Choose the department:");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		Question1 mn = new Question1();
		switch (choice) {
		case 1: {
			// this case is or ECE
			// Initialize the Class using appropriately taking the concept of inheritence
			// and polymorphism in mind.
			ECE ec = new ECE();
			String ece = "ECE";
			System.out.println(ec.displayCourseDetails(ece));// call the function of the class that you initialized
			break;
		}
		case 2: {
			// this case is or Mechanical
			// Initialize the Class using appropriately taking the concept of inheritence
			// and polymorphism in mind.
			Mechanical mc = new Mechanical();
			String mech = "Mechanical";
			System.out.println(mc.displayCourseDetails(mech));
			// call the function of the class that you initialized
			break;
		}
		case 3: {
			// this case is or CSE
			// Initialize the Class using appropriately taking the concept of inheritence
			// and polymorphism in mind.
			CSE cs = new CSE();
			String cse = "CSE";
			System.out.println(cs.displayCourseDetails(cse));// call the function of the class that you initialized
			break;
		}
		default:
			System.out.println("Invalid input!");
			break;
		}
	}
}