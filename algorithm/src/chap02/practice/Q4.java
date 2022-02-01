package chap02.practice;

public class Q4 {

    // 배열 b의 모든 요소를 a에 복사하는 매서드
    static void copy(int[] a, int[] b) {
        // 두 배열 중 짧은 배열로 루프를 돌려야 함
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++) {
            b[i] = a[i];
        }
    }

}
