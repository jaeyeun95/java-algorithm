package chap01;

import java.util.Scanner;

public class Max4 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 4개의 최대값 구하기 : ");
		
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		System.out.print("c : ");
		int c = sc.nextInt();
		System.out.print("d : ");
		int d = sc.nextInt();
		
		int max = max4(a,b,c,d);
		
		System.out.println("최대값 = " + max);
	}

}
