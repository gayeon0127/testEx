package ClassEx;
/*
 *  4. 엽력값이 소수인지 아닌지 구분
 */

public class Ex04 {
	public static void main(String[] args) {
	
	TestEx04 t = new TestEx04();
	
	int num = t.myInput();
	boolean b = t.divide(num);
	t.print(b);
	
	}	
}
