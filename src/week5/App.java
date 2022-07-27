package week5;

public class App {

	public static void main(String[] args) {
		
		Logger asterisk = new AsteriskLogger();
		Logger spacer = new SpacedLogger();

		System.out.println("The following are examples of the AsteriskLogger class.");
		asterisk.Log("Example");
		asterisk.Error("Example");
		
		System.out.println("The following are examples of the SpacedLogger class.");
		spacer.Log("Example");
		spacer.Error("Example");
		
	}

}
