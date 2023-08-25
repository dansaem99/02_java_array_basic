package step2_01.array;

import java.util.Random;

/*
 * # OMR카드
 * 
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * hgd     = {1, 1, 4, 4, 3}
 * 정오표  = {O, X, O, X, X}
 * 성적    = 40점
 */

//2023-08-17 19:27 ~ 19:39
public class ArrayEx08_연습 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		char[] answerOX = new char[5];
		int gradeCnt = 0;
		
		for (int i = 0; i < answer.length; i++) {
			hgd[i] = ran.nextInt(5) + 1;
		}
		
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == hgd[i]) {
				answerOX[i] = 'O';
				gradeCnt++;
			} else answerOX[i] = 'X';
		}
		
		int grade = gradeCnt * 20;
		
		System.out.print("answer = ");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println();
		
		System.out.print("hgd = ");
		for (int i = 0; i < hgd.length; i++) {
			System.out.print(hgd[i] + " ");
		}
		System.out.println();
		
		System.out.print("OX = ");
		for (int i = 0; i < answerOX.length; i++) {
			System.out.print(answerOX[i] + " ");
		}
		System.out.println();
		
		System.out.println("점수 = " + grade);
		
	}
	
}
