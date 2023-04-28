package ClassEx;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEx01_1 {
	
	public String[] myInput() {
		Scanner scan = new Scanner(System.in);
		String n1,n2,n3;
		
		System.out.println("첫번째 이름 입력 : ");
		n1 = scan.next();
		System.out.println("두번째 이름 입력 : ");
		n2 = scan.next();
		System.out.println("세번째 이름 입력 : ");
		n3 = scan.next();
		
		String[] s = {n1,n2,n3};
		return s;
	}
	
	public void print(String[] s) {
		System.out.println();
		System.out.println("입력받은 이름은");
		for(int i=0;i<s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("입니다.");
	}
}
