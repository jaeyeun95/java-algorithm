package chap01.practice;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("정수 2개를 입력하세요.");
        System.out.print("a 의 값 : ");
        a = sc.nextInt();

        do {
            System.out.print("b 의 값 : ");
            b = sc.nextInt();
            if (b < a){
                System.out.println("a보다 큰 값을 입력하세요!");
            }
        } while (b<a);

        int result = b-a;

        System.out.println("b - a 는 " + result + " 입니다.");

        
    }
    
}
