import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		p2.toString(); // Object 클래스의 toString을 사용!
		p2.write("hello 2"); // Writer 클래스의 write함수가 마음에 들지 않아서 
		                     // PrintWriter write함수로 덮어씌운것
	
		
	}

}
