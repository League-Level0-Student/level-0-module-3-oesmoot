package _02_loop_variables._4_99_bottles.bottles;

import javax.swing.JOptionPane;

public class Bottles {
public static void main(String[] args) {
	
	String plural ="bottles";
	String singular = "bottle";
	
	for(int botel = 99; botel>0; botel --) {
		String botle  ="" ;
		botle += botel +" ";
		if (botel > 1) {
			botle += plural;
		}
		else {
			botle+= singular;
		}
		botle+= " of milk on the wall, "+ botle + " of milk, take one down, pass it around ";
		if (botel ==1) {
			botle +="no more ";
		}
		else {
			botle += (botel -1)+ " ";
		}
		
		if  (botel ==2) {
			botle+= singular;
		}
		else {
			botle += plural;
		}
		
		botle += " of milk on the wall.";
		System.out.println(botle);
	}
	System.out.println("no more " + plural + " milk on the wall, no more " + plural +" milk, go to the store and buy some more, 99 " + plural + " of milk on the wall" );
}
}
