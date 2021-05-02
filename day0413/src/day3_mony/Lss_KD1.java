package day3_mony;

import java.util.Scanner;

public class Lss_KD1 {

   public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int check,input,output,sum=0;
           boolean run=true;
           System.out.println("안녕하세요. ICIA은행입니다.");
           while(run) {
            System.out.println("-------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택>");
            check=scan.nextInt();
            
            if(check==1) { //
             System.out.print("예금액 :");
             input=scan.nextInt();
             sum+=input;
             System.out.println("현재 잔액은" +sum+"원 입니다.");
            }
            else if(check==2) {
             System.out.print("출금액 :");
             output=scan.nextInt();
             if(sum>=output){   
              sum-=output;
              System.out.println("현재 잔액은" +sum+"입니다.");
             }else {
              System.out.println("잔액이 부족합니다.");
             }
             
            }
            else if(check==3){
             System.out.print("잔고 확인");
             System.out.println("현재 잔고 잔액은" + sum+"원 입니다.");
            }
            else if(check==4) {
             System.out.println("안녕히 가세요.");
             break;
            }
            else {
             
             
            }
           }
           
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
   }

}