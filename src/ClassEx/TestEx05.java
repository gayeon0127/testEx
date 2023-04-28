package ClassEx;

import java.util.Scanner;

public class TestEx05 {
	
	public int myInput() {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("숫자를 입력하세요 ; ");
		n = scan.nextInt();
		return n;
	}
	
	public int change(int num) {
		if(num<0) {
			num = -num;
			return num;
		} else {
			return num;
		}
	}
	
	public void print(int num, int c) {
		System.out.println(num+"의 절대값 : " + c);
	}
	

}
