package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy_ {
public static void main(String[] args) {
	String happyQ = JOptionPane.showInputDialog("are you happy?");
	if (happyQ.equals("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing what you are doing");
	}
}
}
