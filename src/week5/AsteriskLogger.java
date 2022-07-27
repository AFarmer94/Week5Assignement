package week5;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void Error(String error) {
		System.err.println("****************");
		System.err.println("***ERROR: " + error + "***");
		System.err.println("****************");
	}

}
