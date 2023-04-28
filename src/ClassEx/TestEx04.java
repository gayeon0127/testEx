package ClassEx;

import java.util.Scanner;

public class TestEx04 {
	
	public int myInput() {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("숫자를 입력하세요 ; ");
		n = scan.nextInt();
		return n;
	}
	
	public boolean divide(int num) {
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}
	
	public void print(boolean b) {
		String s = null;
		if (b==false) {
			s = "소수가 아닙니다.";
			System.out.println(s);
		} else {
			s = "소수입니다.";
			System.out.println(s);
		}
	}
	
	
}
