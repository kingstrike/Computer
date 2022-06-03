package week03;

import java.util.Iterator;

public class Basic2 {
	
	public static void main(String[] args) {
		for(int i=1; i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("1 3 5 7 9");
		
		for(int i=1; i<=10;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();

		for(int i=1; i<=10;i++) {
			if(i%2 == 1)
				System.out.print(i+" ");
		}
		System.out.println();

		for(int i=1; i<=10;i++) {
			if(i%2 ==0)
				continue;
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=1; i<=10;i++) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		for(int k=0; k<10; k++) {
			System.out.print(k+" ");
		}
		//System.out.println(k); error: k를 찾을수 없음.
		System.out.println();
		
		int i=1;
		while(i<10) {
			System.out.print(i +" ");
			i += 2;
		}
		System.out.println();
		
		int a[] = new int[10];
		int n= 5;
		a[n] = 5;
		System.out.println("a[5]:"+a[5]+", n:"+n);
		call(a,n);
		System.out.println("a[5]:"+a[5]+", n:"+n);
	}
	
	public static void call(int[] a, int n) {
		a[n] = 10;
	}
}