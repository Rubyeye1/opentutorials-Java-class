import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHome {

	public static void main(String[] args) {
		
        String id = "JAVA APT 507";
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
			 
	}

}
