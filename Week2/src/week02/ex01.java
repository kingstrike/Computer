package week02;

import java.util.Iterator;

public class ex01 {
	public static int seq(int n) {
		return (n==1) ? 1: seq(n-1) + 3;
	}
	public static void A(int n) {
		if(n>0) {
			A(n-1);
			System.out.print(n+" ");
		}
	}
	public static int fact1(int n) {
		int temp = 1;
		for (int i=2;i<=n;i++) {
			temp *= i;
		}
		return temp;
	}
	public static int fact2(int n) {
		return (n==0) ? 1: n*fact2(n-1);
	}
	public static void main(String[] args) {
		System.out.println(fact1(5));
		System.out.println(fact2(5));
	}
}