package ClassEx;
/*
 * 3. 입력 값이 3의 배수인지 아닌지 구분 
 */

public class Ex03 {
	public static void main(String[] args) {
		TestEx03 t = new TestEx03();
		
		int num = t.myInput();
		boolean b = t.divide(num);
		t.print(b);
		}
	

}
