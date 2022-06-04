package week04;

import java.util.Scanner;

public class ArrEx01 {
	public static void arrDel(int[] abc, int ii) {
		int i;
		for (i = ii; i < abc.length-1; i++) {
			abc[i] = abc[i+1];
		}
		abc[i] = 0;
	}
	public static void arrIns(int[] abc, int n, int ii) {
		int i;
		for(i = abc.length-1; i > ii; i--) {
			abc[i] = abc[i-1];
		}
		abc[i] = n;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int[] abc = new int[5];
//		int abc[];
//		abc = new int[5];
//		int[] abc = {10,20,30,40,50};
//		
//		for (int i = 0; i < abc.length; i++) {
//			System.out.print((i+1) + "번째 정수 입력 : ");
//			abc[i] = scanner.nextInt();
		}
		
		System.out.print("삭제할 index 입력 : ");
		int idx = scanner.nextInt();
		
		arrDel(abc, idx);
		System.out.println();
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		
		System.out.print("삽입할 index 입력 : ");
		idx = scanner.nextInt();
		System.out.print("삽입할 value 입력 : ");
		int value = scanner.nextInt();
		arrIns(abc, value, idx);
		System.out.println();
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
	}
}