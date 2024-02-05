//package ch06.sec08.exam4;
//
//import java.util.Scanner;
//
//public class CalExample {
//
//	public static void main(String[] args) {
//		System.out.println("main()");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요.");
//		int i1 = sc.nextInt();
//		System.out.println("숫자를 입력하세요.");
//		int i2 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("숫자를 입력하세요.");
//		double d1 = sc.nextDouble();
//		System.out.println("숫자를 입력하세요.");
//		double d2 = sc.nextDouble();
//		sc.nextLine();
//
//		//		// 정수
////		int i1 = 0;
////		int i2 = 0;
////		
////		//실수
////		double d1 = 0.0;
////		double d2 = 0.0;
////		
//		if(i1 % i2 == 0) {		//정수일 때
//			
//			
//			Cal ci = new Cal(i1, i2);
//
//			int plus = ci.intPlus();
//			System.out.println("plus: " + plus);
//			
//			int minus = ci.intMinus();
//			System.out.println("minus: " + minus);
//			
//			int mul = ci.intMul();
//			System.out.println("mul: " + mul);
//			
//			int div = ci.intDiv();
//			System.out.println("div: " + div);
//			
//		} else if(d1 % d2 != 0) {	//실수일 때
//			
//			
//			Cal cd = new Cal(d1, d2);
//
//			double plusd = cd.doublePlus();
//			System.out.println("plus: " + plusd);
//
//			double minusd = cd.doubleMinus();
//			System.out.println("minus: " + minusd);
//
//			double muld = cd.doubleMul();
//			System.out.println("mul: " + muld);
//
//			double divd = cd.doubleDiv();
//			System.out.println("div: " + divd);
//
//		}
//		
//	}
//
//}
