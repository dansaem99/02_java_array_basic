package step2_01.array;


/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */

public class ArrayEx07_정답예시 {

	public static void main(String[] args) {
		
		int[] stduentNums = {1001,1002,1003,1004,1005};
		int[] scores  =  {  87,  11,  45,  98,  23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
	
		int score1th = 0;
		int studentNum1th = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (score1th < scores[i]) {
				score1th = scores[i];
				studentNum1th = i;
			}
		}
		
		System.out.println("1등 학생 = " + stduentNums[studentNum1th] + "번(" + score1th + "점)");
		
	}
	
}
