package ClassEx;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEx01_2 {
	
	public ArrayList<String> myInput() {
		Scanner scan = new Scanner(System.in);
		String n1,n2,n3;
		
		System.out.println("첫번째 이름 입력 : ");
		n1 = scan.next();
		System.out.println("두번째 이름 입력 : ");
		n2 = scan.next();
		System.out.println("세번째 이름 입력 : ");
		n3 = scan.next();
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add(n1);
		arr.add(n2);
		arr.add(n3);
		
		return arr;
	}
	
	public void print(ArrayList<String> arr) {
		System.out.println();
		System.out.println("입력받은 이름은");
		System.out.println(arr);
		System.out.println("입니다.");
	}

}
