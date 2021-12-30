package chap01;

import java.util.Scanner;

// 1,2, ...,n의 합 구하기
public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값을 입력하세요.");
        
        int n = sc.nextInt();
        int i = 1; 
        int sum = 0; // 총합

        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        
    }
    
}
