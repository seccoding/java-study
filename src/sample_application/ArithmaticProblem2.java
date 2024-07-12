package sample_application;

public class ArithmaticProblem2 {

	public static void main(String[] args) {
		
		final int ONE_MINUTES = 60;
		
		int processTime = 145;
		
		int minutes = processTime / ONE_MINUTES; // 2
		int seconds = processTime % ONE_MINUTES; // 25
		
		System.out.println(processTime + "초는 " 
						+ minutes + "분 " 
						+ seconds + "초 입니다.");
		
	}
	
}
