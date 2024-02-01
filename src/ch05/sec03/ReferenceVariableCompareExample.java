package ch05.sec03;

public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		// 배열 = 동일한 자료형을 가진 값들이 연속적으로 저장되는 것
		int[] arr1;		// c에서는 int arr1[]; 이런 식으로 많이 씀(자바에서도 사용 가능)
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println("arr1 == arr2: " + (arr1 == arr2));		//false, 저장하고 있는 객체의 주소가 다르므로 false
		System.out.println("arr2 == arr3: " + (arr2 == arr3));		//true
		
	}

}
