package step2_01.array;

import java.util.Scanner;

public class ArrayEx24_테스트문제1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = { 10 , 4 , 5 , 3 , 1 };
		
		// 문제 1) 전체 요소의 합출력
		System.out.println("문제 1)");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		// 문제 2) 데이터를 입력하면 배열의 인덱스 출력
		// 예) 5 => 2  ,  1 => 4
		System.out.println("문제 2)");
		System.out.println("데이터를 입력해라");
		int data = scan.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == data) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		// 문제 3) 배열의 인덱스를 입력하면 데이터 출력
		// 예) 2 => 5  , 4 => 1
		System.out.println("문제 3)");
		System.out.println("배열의 인텍스를 입력해라");
		int idx = scan.nextInt();
		System.out.println(a[idx]);
		System.out.println();

		// 문제 4) 배열중 가장 큰 데이터 출력 
		// 예) 10
		System.out.println("문제 4)");
		int big = 0;
		for (int i = 0; i < a.length; i++) {
			if (big < a[i]) {
				big = a[i];
			}
		}
		System.out.println(big);
		System.out.println();
		

		// 문제 5) 배열중 홀수의 개수 출력 
		// 예) 홀수의 개수 : 3
		System.out.println("문제 5)");
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				cnt++;
			}
		}
		System.out.println("홀수의 개수 : " + cnt);
		System.out.println();
			
		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0 , 0 , 5 , 3 , 1}
		System.out.println("문제 6)");
		int[] b = {0 , 0 , 0 , 0 , 0};
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				b[i] = a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// 문제 7)  a의 값중 홀수만 c에 저장(저장위치는 앞에서부터 저장)
		// 예) c => {5, 3, 1, 0, 0}
		System.out.println("문제 7)");
		int[] c = { 0 , 0 , 0 , 0 , 0 };
		int oddNum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				c[oddNum] = a[i];
				oddNum++;
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

		
	}

}
