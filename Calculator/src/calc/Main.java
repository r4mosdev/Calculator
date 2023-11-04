package calc;
/**
 * Main class, which allows the application to run. 
 */
public class Main {

	public static void main(String[] args) {
		Operations OP = new Operations();
		try {
			OP.menu();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
