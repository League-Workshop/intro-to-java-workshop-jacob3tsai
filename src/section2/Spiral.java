package section2;

import org.jointheleague.graphical.robot.Robot;

import javafx.scene.paint.Color;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot LBJ = new Robot();
		// 5. Set your robot's pen down 
		LBJ.penDown();
		// 3. Set the robot to go at max speed (100)
		LBJ.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i=0;i<75;i++){
			// 7. Change the pen color to random
			LBJ.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			LBJ.move(5*i);
			// 2. Turn the robot 360/7 degrees to the right
		LBJ.turn(360/7);
			// 8. Set the pen width to i
			LBJ.setPenWidth(i);
	}
    	}
}