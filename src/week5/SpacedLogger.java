package week5;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String log) {
		String result = "";
		for(int i = 0; i <= log.length() - 1; i++) {
			if(i == log.length() - 1)
				result += log.charAt(i);
			else
				result += log.charAt(i) + " ";
			}
		System.out.println(result);
		
	}

	@Override
	public void Error(String error) {
		String result = "";
		for(int i = 0; i <= error.length() - 1; i++) {
			if(i == error.length() - 1)
				result += error.charAt(i);
			else
				result += error.charAt(i) + " ";
			}
		System.out.println("ERROR: " + result);
		
	}

}
