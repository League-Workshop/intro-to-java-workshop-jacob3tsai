package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot BB6 = new Robot ();
	BB6.setSpeed(200); 
	BB6.penDown();
	BB6.turn(90);
	BB6.setPenWidth(6); 
	BB6.setPenColor(Color.BLUE);
		BB6.move (200);
		for(int i = 0;i<4;i++) {
			BB6.move(200);
			BB6.turn(360/4);
		}
		
	}
}
