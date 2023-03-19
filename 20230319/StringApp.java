
public class StringApp {

	public static void main(String[] args) {
		
		System.out.println("Hello World"); // String 문자열
		System.out.println('H'); // 자바에서는 작은따옴표가 한 글자를 표현하는 데이터
		System.out.println("H"); // 한 문자지만 스트링취급
		
		System.out.println("Hello" // 줄바꿈 안됨! 엔터치면 이렇게 자동으로 따옴표 붙여주는 편리한 기능은있음
				+ "World");
		
		System.out.println("Hello \nWorld"); // 줄바꿈!
		System.out.println("Hello \"World\""); // 특수문자 출력하기 
		

	}

}
