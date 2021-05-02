package koo;

import java.util.Scanner;

public class koo_D2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 배열 곱하기
		int[] row;
		row = new int[1];
		int[] column = new int[] {1,2,3,4,5,6,7,8,9};
		int i;
		
		System.out.println("원하시는 곱셈표(구구단)를 입력해주세요.");
		System.out.println("숫자 입력 : ");
		row[0] = scan.nextInt();
		
		for(i=0; i<=8; i++) {
			System.out.println(row[0] +"*"+ column[i] + "="+ row[0]*column[i]);
		}
		
		
	
		
	
	
	
	
	
}

}
