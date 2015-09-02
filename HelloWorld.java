 /******************************************************************************
 * compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such 
 *  lines in our programs and encourage you to do the same.
 *
 ******************************************************************************/
import java.util.Date;
import java.util.Random;

public class HelloWorld {

    public static void main(String[] args) {
		Date date = new Date();
		Random randomGenerator = new Random();
        	System.out.println("Hello, World!!");
		System.out.println(date.toString());
		int number = randomGenerator.nextInt(50);
		System.out.println(number);
		
		/* Create two objects using constructor */
	       	Employee empOne = new Employee("James Smith");
	      	Employee empTwo = new Employee("Mary Anne");
	
	      	// Invoking methods for each object created
	      	empOne.empAge(26);
	      	empOne.empDesignation("Senior Software Engineer");
	      	empOne.empSalary(1000);
	      	empOne.printEmployee();
	
		empTwo.empAge(21);
	      	empTwo.empDesignation("Software Engineer");
	      	empTwo.empSalary(500);
	      	empTwo.printEmployee();
	      	System.out.println("End of Program!");
	}
}
// No newline at end of file
