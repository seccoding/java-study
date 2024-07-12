package sample_application;

/**
 * <pre>
 * Document 주석
 * 
 * 클래스나 메소드 혹은 멤버변수들을 설명하기 위한 가이드.
 * 
 * 해당 클래스나 메소드 혹은 멤버변수에 마우스를 가져다 올리면
 * 주석이 툴팁으로 나타난다.
 * </pre>
 */
public class CastingTest {

	/**
	 * 형변환 예제 실습 번호
	 */
	int testCaseNumber;
	
	/**
	 * 클래스의 실행을 담당하는 메소드.
	 * 
	 * @param args 실행할 때 전달된 데이터
	 */
	public static void main(String[] args) {
		
		// 주석 : 코드에 설명을 붙이는 것.
		// 컴파일러 또는 JVM에 변환 / 실행시키지 않는 영역.
		// Single line Comment
		
		/*
		 * 여러 줄을 주석으로 사용할 수 있는 문법.
		 * Multi line Comment
		 */
		int score1 = 100;
		int score2 = 90;
		int score3 = 60;
		int score4 = 77;
		
		double average = (double) (score1 + score2 + score3 + score4) / 4;
		System.out.println(average);
		
		int number = 9725;
		double doubleNumber = number / 100.0;
		System.out.println(doubleNumber);
		
		double average2 = 93.167;
		double tempAverage = average2 * 100;
		long intAverage = Math.round(tempAverage);
		average2 = (double) intAverage / 100;
		System.out.println(average2);
		
		average2 = 93.167;
		average2 = round(average2, 2);
		System.out.println(average2);
	}
	
	public static double round(double value, int point) {
		double result = value * Math.pow(10, point);
		result = Math.round(result);
		result /= Math.pow(10, point);
		return result;
	}
	
}
