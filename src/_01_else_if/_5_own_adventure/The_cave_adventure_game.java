package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class The_cave_adventure_game {
public static void main(String[] args) {
	 String start = JOptionPane.showInputDialog("Welcome to the cave! type Start to begin, or Help for help.");
	if (start.equals("Help")) {
		JOptionPane.showMessageDialog(null, "type fwd to go forward, back to go back,left to go left, and right to go right,some time there will be a prompt to to one thing or the other, you cannot move at those times if you die, its game over.");
	}
	if (start.equals("Start")) {
		String caveMouth = JOptionPane.showInputDialog("you wake up suddenly, at the mouth of a cave, the only things you have are an unlit torch, a campfire by you, and a pile of rope, what do you do?");
			if (caveMouth.equals("fwd")) {
				String caveDoor = JOptionPane.showInputDialog("you repel down, and the first thing you see is a large door (type enter to enter the door)");
				if (caveDoor.equals("enter")) {
					JOptionPane.showMessageDialog(null, "you walk though a long, dark hallway");
					JOptionPane.showMessageDialog(null, "you emerge in a massive, dimly lit cave");
					JOptionPane.showMessageDialog(null, "");
				}
			}
			else if (caveMouth.equals("back")) {
				JOptionPane.showMessageDialog(null, "you cannot go there");
			}
			else if (caveMouth.equals("left")) {
				JOptionPane.showMessageDialog(null, "you cannot go there");
			}
			else if (caveMouth.equals("right")) {
				JOptionPane.showMessageDialog(null, "you cannot go there");
			}
	}
}
}
