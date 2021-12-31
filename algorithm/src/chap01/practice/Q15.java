package chap01.practice;

import java.util.Scanner;

public class Q15 {
    // 왼쪽 아래가 직각인 이등변 삼각형
    static void triangleB(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 왼쪽 위가 직각인 이등변 삼각형
    static void triangleLU(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // 오른쪽 위가 직각
    static void triangleRU(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }

    // 오른쪽 아래가 직각
    static void triangleRB(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까? ");
            n = sc.nextInt();
            System.out.println("왼쪽 아래");
            triangleB(n);
            System.out.println("왼쪽 위");
            triangleLU(n);
            System.out.println("오른쪽 위");
            triangleRU(n);
            System.out.println("오른쪽 아래");
            triangleRB(n);

        } while (n <= 0);

        sc.close();

    }

}
