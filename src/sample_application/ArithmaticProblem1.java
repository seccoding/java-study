package sample_application;

public class ArithmaticProblem1 {

	public static void main(String[] args) {
		
		final int ONE_MINUTES = 60;
		
		int minutes = 5;
		int seconds = 50;
		
		int time = minutes * ONE_MINUTES + seconds;
		
		System.out.println(minutes + "분 " 
				+ seconds + "초는 총 " 
				+ time + "초 입니다." );
		
	}
	
}
