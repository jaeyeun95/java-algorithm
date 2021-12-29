package chap01;


public class Max3_2 {
// a,b,c 최대값 구하여 반환
	static int max3(int a, int b, int c) {
		int max =a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max(3,2,1) = " + max3(3, 2, 1));
		System.out.println("max(10,23,8) =  " + max3(10,23,8));
	}
}
