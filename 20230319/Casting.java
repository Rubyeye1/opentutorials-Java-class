
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b =1 ;  // 1.0으로 출력
		double b2 =(double) 1; // 위의 문장은 이것과 같은것
		System.out.println(b);
		
		// 에러! int c= 1.1;
		
		double d = 1.1;
		int e =(int) 1.1;
		System.out.println(d);
		System.out.println(e);
		
		String f = Integer.toString(1); // 문자열이 됨. 모르는건 검색하기!
		System.out.println(f.getClass()); // getClass는어떤 데이터타입인지 알려줌 

		
	}

}
