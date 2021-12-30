package chap01.practice;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        // 가우스의 덧셈 사용
        // 가우스의 덧셈이란 1~10까지의 합을 구하기 위해서는 
        // (첫숫자 + 끝숫자) * 숫자의 갯수

        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값을 입력하세요.");

        int n = sc.nextInt();   // n 이자 끝자리 숫자

        int sum = (1+n) * (n/2);

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        
    }
    
}
