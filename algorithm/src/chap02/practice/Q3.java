package chap02.practice;

public class Q3 {
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(sumOf(arr));

    }

}
