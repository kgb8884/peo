package koo;

import java.util.Scanner;

public class koo_D3 {
  public static void main(String[] args) {
  
         System.out.println("-------------------");
         System.out.println(" 금액을 넣어주세요 ");
         System.out.println(" 자판기에 넣을수있는 화폐는 1000원, 500원, 100원 입니다");
         System.out.println(" 자판기에 넣을수있는 최대 금액은 5000원 입니다");
         System.out.println(" 거스름돈을 받으려면 7번을 누르세요 ");
         System.out.println("-------------------");
         
          int money = 0;
          int price = 0;
          int choice = 0;
          
          Scanner sc = new Scanner(System.in);
          System.out.println("--- 금액을 넣어주세요 ---");
          money = sc.nextInt();
          System.out.println("---" + money + "원을 투입하셨습니다");
          
          if(money > 5000) {
             System.out.println("최대 투입 가능한 금액은 5000원 입니다.");
             System.out.println("다시 시도 해주세요.");
             return;
          }
          do {
            // Scanner scan = new Scanner(System.in);
             System.out.println(" 원하시는 번호 선택");
          
          System.out.println("1. 콜라 2. 오렌지주스 3. 코코팜 7. 잔돈반환");
          choice = sc.nextInt();
         
         
          if( choice == 1) {
             
             price =1000;
             if(price > money) {
                System.out.println("잔액이 부족합니다.");
                System.out.println("거스름돈을 받아가세요.");
                break;
             }else {
                System.out.println("콜라 선택, 1000원입니다");
             }
          }else if( choice == 2) {
             
             price=500;
             if(price > money) {
                System.out.println("잔액이 부족합니다.");
                System.out.println("거스름돈을 받아가세요.");
                break;
             }else {
                System.out.println("오렌지 주스 선택, 500원입니다");
             }
             
          }else if( choice == 3) {
             
             price=430;
                          
             if(price > money) {
                System.out.println("잔액이 부족합니다.");
                System.out.println("거스름돈을 받아가세요.");
                break;
             }else {
                System.out.println("코코팜 선택, 430원입니다");
             }
          }else if( choice == 7) {
             
             System.out.println("거스름돈을 받으세요");
                
                price=0;
             }
          
          System.out.println(" 남은금액 : " + (money-price)+ "원" );
          
          money=money-price; // 
          
          
             
          }while(choice!=7);
          
          System.out.println("남은 잔돈은 " + money + "원 입니다");
          gusrm(money);
          
          System.out.println("감사합니다 또 오세요");
  
  }

private static void gusrm(int money) {
   int p=0; //1000 500 = 3500
   if(money == 0) {
   }else {
   int n1000 =money /1000; // 3500 /1000 3.5 int니까 .5 계산x / =n1000 = 3 만 나옴
   p = money -n1000*1000;   // money 3500 - 3000(n1000*1000) = 500
   int n500 = p / 500; // p=500 / 500 = 1 / 그래서 500원짜리 1개
   p = p - n500*500;
   int n100 = p / 100; // 위에 식에서 나머지들이 오는거
   p = p - n100*100;
   int n50 = p / 50;
   p = p - n50*50;
   int n10 = p / 10;
   p = p - n10*10;
   int n1 = p / 1;
   p = p - n1*10;
   
   System.out.println("1000원 x" + n1000);
   System.out.println("500원 x" + n500);
   System.out.println("100원 x" + n100);
   System.out.println("50원 x" + n50);
   System.out.println("10원 x" + n10);
   System.out.println("1원 x" + n1);
   }
}
}