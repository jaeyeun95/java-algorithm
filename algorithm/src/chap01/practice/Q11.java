package chap01.practice;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /** 양의 정수를 입력하고 자릿수를 출력하는 프로그램 
         * 예) 135 -> 3자리 숫자 입니다.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("양수를 입력해 주세요.");
        System.out.print("num : ");
        int num = sc.nextInt();

        // int n = 1;
        // int result = num / (10*n);

        if (num / 10 < 1){
            System.out.println("1자리 숫자입니다.");
        } else if (num / 100 < 1){
            System.out.println("2자리 숫자입니다.");
        } else if (num / 1000 < 1){
            System.out.println("3자리 숫자입니다.");
        }

        sc.close();

        /**
         * 입력받은 수를 10의 제곱근(n)으로 나누어서 
         * 나누기 결과가 1보다 작으면 (n-1) 자리입니다로 출력 
         */


        

    }
    
}
