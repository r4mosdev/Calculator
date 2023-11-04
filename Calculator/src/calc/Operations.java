package calc;
import java.util.Scanner;

/**
 * Class containing methods that perform addition, subtraction, multiplication and division operations.
 * 
 * @author Ramos, Isaac
 * 
 */
public class Operations {
	Scanner scan = new Scanner(System.in);
	private String option;
	private double value, result;
	boolean exit = false;

	/**
	 * Method that starts the application, allowing data input and output. 
	 */
	public void menu () throws InterruptedException {
		while (exit != true) {
			System.out.println("\nCALCULATOR\n "
					+ "(1) Sum\n"
					+ "(2) Subtraction\n"
					+ "(3) Multiplication\n"
					+ "(4) Division\n"
					+ "(5) Exit");
			option = scan.next();

			switch (option) {
			case "1":
				sum();
				break;
			case "2":
				subtraction();
				break;
			case "3":
				multiplication();
				break;
			case "4":
				division();
				break;
			case "5":
				System.out.println("Thank you for uses the calculator. See you next time :)");
				exit = true;
				break;
			default:
				System.out.println("Sorry, the imputed value is invalid!");
				break;
			}
		}
	}
	
	/**
	 * Method that performs the sum operation of the values ​​imputed by the user 
	 */
	public void  sum () {
		System.out.println("First Value?");
		value = scan.nextDouble();
		result = value;
		System.out.println("Second Value?");
		value = scan.nextDouble();
		result += value;
		System.out.println("\n" + result);
	}

	/**
	 * Method that performs the subtraction operation of the values ​​imputed by the user
	 */
	public void subtraction () {
		System.out.println("First Value?");
		value = scan.nextDouble();
		result = value;
		System.out.println("Second Value?");
		value = scan.nextDouble();
		result -= value;
		System.out.println("\n" + result);
	}

	/**
	 * Method that performs the multiplication operation of the values ​​imputed by the user
	 */
	public void multiplication () {
		System.out.println("First Value?");
		value = scan.nextDouble();
		result = value;
		System.out.println("Second Value?");
		value = scan.nextDouble();
		result *= value;
		System.out.println("\n" + result);
	}

	/**
	 * Method that performs the division operation of the values ​​imputed by the user
	 */
	public void division () {
		System.out.println("First Value?");
		value = scan.nextDouble();
		result = value;
		System.out.println("Second Value?");
		value = scan.nextDouble();
		if (value != 0) {
			System.out.println("");
			System.out.println(result /= value);
		}else {
			System.out.println("The imputed value is 0 (zero), and 0 cannnot be divided.");
		}
	}

}
