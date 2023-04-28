package ClassEx;

import java.util.Scanner;

public class TestEx02 {
	
	public int myInput() {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("숫자를 입력하세요 ; ");
		n = scan.nextInt();
		return n;
	}
	
	public boolean divide(int num) {
		if(num%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print(boolean b) {
		String s = null;
		if (b==true) {
			s = "짝수입니다.";
			System.out.println(s);
		} else {
			s = "홀수니다.";
			System.out.println(s);
		}
	}
	
}
