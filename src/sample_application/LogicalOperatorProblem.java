package sample_application;

import java.util.Scanner;

public class LogicalOperatorProblem {

	public static void main(String[] args) {
		
		// Ctrl + Shift + O
		Scanner keyboard = new Scanner(System.in);
		
		/*
		 * 문제.
		 * 정수형 변수 두 개를 생성하고
		 * keyboard.nextInt()를 이용해 값을 각각의 변수에 할당한 뒤
		 * 
		 * 두 변수의 값 중 큰 값을 가진 변수의 값을 출력!
		 * (3항 연산자 사용)
		 */
		System.out.println("첫 번째 숫자를 입력하세요!");
		int firstNumber = keyboard.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요!");
		int secondNumber = keyboard.nextInt();
		
		System.out.println(
				firstNumber > secondNumber ? firstNumber : secondNumber);
		
		// 3항 연산자
		// 잘 사용되지 않는 이유?
		// 조건과 처리의 구분이 모호하다. ==> 의미를 분석하기 쉽지 않다.
		int biggestNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
		
		System.out.println(biggestNumber);
	}
	
}
