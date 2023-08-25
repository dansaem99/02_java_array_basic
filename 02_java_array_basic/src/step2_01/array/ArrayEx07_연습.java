package step2_01.array;

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */

//2023-08-17 19:21 ~ 19:27
public class ArrayEx07_연습 {

	public static void main(String[] args) {
		
		int[] stduentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		int stduent1th = 0;
		int score1th = 0;
		for (int i = 0; i < stduentNums.length; i++) {
			if (score1th < scores[i]) {
				score1th = scores[i];
				stduent1th = i;
			}
		}
		System.out.println("학번 = " + stduentNums[stduent1th] + " (성적 = " + score1th + "점)");
		
	}
	
}
