
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		while (true) {
			
		
		rob.penDown();
		rob.setSpeed(10);
		rob.hide();
		rob.setPenWidth(10);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		String penColor = JOptionPane.showInputDialog("what color do you want the computer to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (penColor.equals ("red")) {
			rob.setPenColor(Color.red);
		}
		else if (penColor.equals ("orange")) {
			rob.setPenColor(Color.orange);
		}
		else if (penColor.equals ("yellow")) {
			rob.setPenColor(Color.yellow);
		}
		else if (penColor.equals ("green")) {
			rob.setPenColor(Color.green);
		}
		else if (penColor.equals ("blue")) {
			rob.setPenColor(Color.blue);
		}
		else if (penColor.equals ("purple")) {
			rob.setPenColor(160,32,240);
		}
		else {
			rob.setRandomPenColor();
		}
		}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
