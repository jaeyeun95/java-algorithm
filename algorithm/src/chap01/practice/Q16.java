package chap01.practice;

import java.util.Scanner;

public class Q16 {
    // 피라미드 출력하기
    static void spira(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("피라미드를 출력합니다.");
        System.out.print("몇 층?");
        n = sc.nextInt();

        spira(n);

        sc.close();
    }

}
