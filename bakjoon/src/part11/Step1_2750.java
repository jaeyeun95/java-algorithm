package part11;

import java.util.*;

// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
public class Step1_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int number = sc.nextInt();
            numList.add(number);
        }
        Collections.sort(numList);
        System.out.println(numList);

    }
}
