package ClassEx;

/*
 *2. 입력값의 짝/홀 구분
 *
 *  모든 문제는 main 연산 압력 출력하는 기능으로 만드세요 
 *  단, 연산 기능이 없는 경우 연산은 제외 가능
 */

public class Ex02 {
	public static void main(String[] args) {
		TestEx02 t = new TestEx02();
		
		int num = t.myInput();
		boolean b = t.divide(num);
		t.print(b);
		}
	
	

}
