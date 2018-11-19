package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot JT6 = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		JT6.setSpeed(200);
		JT6.penDown();
		// 5. Set the pen width to 5
		JT6.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random
			JT6.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();

			// 8. Turn the robot 90 degrees to the right
		JT6.turn(90);}

	}

	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for (int i = 0; i < 4; i++) {
			JT6.move(100);
			JT6.turn(360 / 4);
		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
