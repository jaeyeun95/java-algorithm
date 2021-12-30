package chap01.practice;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값을 입력하세요.");
        
        int n = sc.nextInt();
        int sum = 0; // 총합

        for(int i = 0; i < n; i++){
            sum += i;
            if( (i+1) <= 6)
                System.out.print((i+1) + " + ");
            else
                System.out.print((i+1) + " = " + sum);
        }

        // System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        
    }
    
}
