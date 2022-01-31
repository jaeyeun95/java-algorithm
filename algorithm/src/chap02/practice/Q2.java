package chap02.practice;

import java.util.Scanner;

public class Q2 {

    // 값 바꾸기
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 역순 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length; i++) {
            swap(a, i, a.length - i - 1);
            print(a);
        }
    }

    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 요소를 입력하세요 : ");

        int[] num = new int[sc.nextInt()];

        for (int i = 0; i < num.length; i++) {
            System.out.println("a[" + i + "]와 a[" + (num.length - 1 - 1) + "]를 교환합니다.");
        }

        reverse(num);

        System.out.println("역순 정렬을 마쳤습니다.");
    }

}
