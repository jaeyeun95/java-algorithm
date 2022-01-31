package chap01.practice;

public class Q17 {
    static void spira(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        spira(4);
    }

}
