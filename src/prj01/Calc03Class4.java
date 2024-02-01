package prj01;

import java.util.Scanner;

public class Calc03Class4 {
   public static void main(String[] args) {
            
      System.out.println("종료하려면 q를 눌리세요" );
      System.out.println("계속 하시려면 q 이외의 무키나 눌리세요");
      
      Scanner scanner = new Scanner(System.in);
      String inputString = "";
      String x = scanner.nextLine();
      
      do {
      System.out.print("값을 입력하세요");
      int a = scanner.nextInt();
      
      System.out.print("값을 입력하세요");
      int b = scanner.nextInt();
      
      System.out.print("연산값?");
      String y = scanner.nextLine();
      
      String z = scanner.nextLine();
      
      if(z. equals("+")) {
         System.out.println("더한값은? " + (a + b));
      } else if(z.equals("-")) {
         System.out.println("뺀 값은? " + (a - b));
      }else if(z.equals("*")) {
         System.out.println("곱한 값은? " + (a * b));
      }else if(z.equals("/")) {
         System.out.printf("나눈 값은? %.4f" ,((double)a / b));
         
      }
      }
      while( ! inputString.equals("q"));
      
      
      System.out.println();
      System.out.println("프로그램종료");
   }
}


      