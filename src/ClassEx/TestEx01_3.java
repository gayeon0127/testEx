package ClassEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TestEx01_3 {
	
	public HashMap<String, String> myInput() {
		
		Scanner scan = new Scanner(System.in);
		String n1,n2,n3;
		
		HashMap<String, String> n = new HashMap<>();
		
		System.out.println("첫번째 이름 입력 : ");
		n1 = scan.next();
		n.put(n1, null);
		System.out.println("두번째 이름 입력 : ");
		n2 = scan.next();
		n.put(n2, null);
		System.out.println("세번째 이름 입력 : ");
		n3 = scan.next();
		n.put(n3, null);
		
		return n;
	}
	
	public void print(HashMap<String, String> n ) {
		System.out.println();
		System.out.println("입력받은 이름은");
		Iterator<String> it = n.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		System.out.println("입니다.");
	}
}
