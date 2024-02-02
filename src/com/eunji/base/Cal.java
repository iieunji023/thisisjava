package com.eunji.base;

import java.util.Scanner;

public class Cal {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(true) {
         System.out.print("숫자를 입력하세요.");
         int a =sc.nextInt();
         System.out.print("숫자를 입력하세요.");
         int b = sc.nextInt();
         
         sc.nextLine();
         System.out.print("+, -, *, / 중 선택하세요.");
         String c = sc.nextLine();
         
         if (c.equals("+")) {
            System.out.println("두 수의 합은 : " + (a+b));
         }else if (c.equals("-")) {
            System.out.println("두 수의 차는 : " + (a-b));               
         }else if (c.equals("*")) {            
            System.out.println("두 수의 곱은 : " + (a*b));         
          }else if (c.equals("/")) {             
             System.out.printf("두 수의 나머지는 : %.3f \n" , (double)(a/b));                
           }else {
              System.out.println("연산자를 누르세요.");
           }
           System.out.println("종료 하시려면 'q'를 누르세요.");
           String d = sc.nextLine();
           
           if(d.equals("q")) {
              System.out.println("종료합니다.");
              break;
              
           }
        }
    }
}