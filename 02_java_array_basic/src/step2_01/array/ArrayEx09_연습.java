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

//2023-08-17 19:39 ~ 20:05
public class ArrayEx09_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X', 'X', 'X', 'X', 'X', 'X', 'X'};
		int choice = 0;
		int choiceSeat = 0;
		int money = 0;
		
		while (true) {
			System.out.println("영화관");
			
			for(int i = 0; i < seat.length; i++) {
				System.out.print("[" + seat[i] + "] ");
			}
			System.out.println();
			System.out.println("1. 좌석예매");
			System.out.println("2. 종료");
			
			choice = scan.nextInt();
			
			if (choice == 1) {
				System.out.println();
				System.out.println("좌석선택(1~7) : ");
				
				choiceSeat = scan.nextInt() - 1;
				
				if (choiceSeat < 0 || choiceSeat > 7) {
					System.out.println("1 ~ 7 좌석만 선택해주세요.");
				}
				
				if (seat[choiceSeat] == 'X') {
					seat[choiceSeat] = 'O';
					money += 12000;
				}
				else System.out.println("이미 예약 된 좌석입니다.");
			}
			else if (choice == 2) {
				System.out.println("총 매출 = " + money + "원 입니다.");
				break;
			}
			else System.out.println("1 ~ 2 만 선택해주세요.");
		}
		
	}
	
}
