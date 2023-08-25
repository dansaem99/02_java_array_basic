package step2_01.array;

import java.util.Scanner;

/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 'O'로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [O] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */

public class ArrayEx09_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X', 'X', 'X', 'X', 'X', 'X', 'X'};
		int getSeat = 0;
		int totalSellingMoney = 0;
		int operateSignal = 0;
		
		
		while (true) {
		
			System.out.println("\n------------- 메가 영화관 ----------\n");
			
			for (int i = 0; i < seat.length; i++) {
				System.out.print("[" + seat[i] + "] ");
			}
			System.out.println("\n\n");
			System.out.println("1. 좌석 예매");
			System.out.println("2. 종료");
			operateSignal = scan.nextInt();
				
			if (operateSignal == 1) {			
		
				System.out.println();
				System.out.print("좌석 선택(1~7) : ");
				getSeat = scan.nextInt()-1;
				
				
				if (getSeat < 0 || getSeat >= 7) {
					System.out.println("\n1~7까지의 좌석을 선택하여 주십시요.");
					continue;
				}
				
				if (seat[getSeat] == 'X') { 
					seat[getSeat] = 'O';
					totalSellingMoney += 12000;
				}
				else {
					System.out.println("\n이미 예매가 완료된 좌석입니다");
				}
				
			
			}
			else if (operateSignal == 2) {
				System.out.println("매출액 : " + totalSellingMoney +"원");
				break;
			} 
			else {
				System.out.println("1~2중에 선택해 주세요.\n");
			}
		}
		
		scan.close();
		
	}
	
}
