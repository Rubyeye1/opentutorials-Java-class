
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.DimmingLights;

public class OkJavaGoInHomeInput {

	public static void main(String[] args) {
		
        String id = args[0]; // 박스 띄우고 입력받기
        String Bright = args[1];
        // Elevator call 
      Elevator myElevator = new Elevator(id);
      myElevator.callForUp(1); //나 올라갈건데 1층으로 엘리베이터 보내
        // Security off 
      Security mySecurity = new Security(id);
      mySecurity.off();
        // Light on
    Lighting hallLamp = new Lighting(id+ " / Hall Lamp");
    hallLamp.on();
    Lighting floorLamp = new Lighting(id+ " / floor Lamp");
    floorLamp.on();
	
    DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
    moodLamp.setBright(Double.parseDouble(Bright)); // 검색하면 다 나온다! string double로 캐스팅
    moodLamp.on();
	}

}
