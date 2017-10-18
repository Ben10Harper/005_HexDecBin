
import javax.swing.JOptionPane;

public class HexDecBin {
	//Scanner for float is now working
	
	/**************************************
	 * 									  *
	 * FIX FAULTS! COMPLETE MISSING CODE! *
	 * 									  *
	 **************************************/

	String name = "";
	String startbase = "";
	String endbase = "";
	String hex = "";
	String dec = "";
	String bin = "";
	int num;
	String answer = "";
	String msg = "";
	Boolean playing = true;
	Boolean typo = true;
	
	public HexDecBin() {
		msg="Welcome to my Hexadecimal, Decimal, or Binary conversion program!";
		JOptionPane.showMessageDialog(null, msg);
		msg="What is your name?";
		name = JOptionPane.showInputDialog(msg);
		msg="Very nice to meet you "+name+" let's begin: \n";
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void setNumber() {
		while (playing == true) {
		while (typo == true) {
		typo = false;
		msg="What is your starting base: hex, dec, or bin?";
		startbase = JOptionPane.showInputDialog(msg);
		msg="What base do you want to convert to: hex, dec, or bin?";
		endbase = JOptionPane.showInputDialog(msg);;
		if (startbase.equalsIgnoreCase("hex")) {
			msg="\nEnter the hex number: ";
			hex = JOptionPane.showInputDialog(msg);
			// mouse over parseInt to read pop-up guide
			num = Integer.parseInt(hex, 16);
			msg="You have entered hex "+hex;
			JOptionPane.showMessageDialog(null, msg);
		}else if (startbase.equalsIgnoreCase("dec")) {
			msg="\nEnter the dec number: ";
			dec = JOptionPane.showInputDialog(msg);
			// mouse over parseInt to read pop-up guide
			num = Integer.parseInt(dec, 10);
			msg="You have entered dec "+dec;
			JOptionPane.showMessageDialog(null, msg);
		}else if (startbase.equalsIgnoreCase("bin")) {
			msg="\nEnter the bin number: ";
			bin = JOptionPane.showInputDialog(msg);
			// mouse over parseInt to read pop-up guide
			num = Integer.parseInt(bin, 2);
			msg="You have entered bin "+bin;
			JOptionPane.showMessageDialog(null, msg);
		} else {
			msg = "I don't know what you mean, try again.";
			JOptionPane.showMessageDialog(null, msg);
			typo = true;
		}
		if (endbase.equalsIgnoreCase("dec")) {
			msg="Decimal value is: "+num+" (remember 0-"+num+" has "+(num+1)+" values)";
			JOptionPane.showMessageDialog(null, msg);
		} else if (endbase.equalsIgnoreCase("bin")) {
		String binary = Integer.toBinaryString(num);
		msg="Binary value is: "+binary;
		JOptionPane.showMessageDialog(null, msg);
		msg="Number of bits is "+binary.length();
		JOptionPane.showMessageDialog(null, msg);
		msg="Number of whole nibbles (4 bits) is "+binary.length()/4+" with "+binary.length()%4+" bits left over";
		JOptionPane.showMessageDialog(null, msg);
		msg="Number of whole bytes (8 bits) is "+binary.length()/8+" with "+binary.length()%8+" bits remaining";
		JOptionPane.showMessageDialog(null, msg);
		} else if (endbase.equalsIgnoreCase("hex")) {
		String hex = Integer.toHexString(num);
		msg="Hexidecimal value is: "+hex;
		JOptionPane.showMessageDialog(null, msg);
		} else {
			msg = "I don't know what you mean, try again.";
			JOptionPane.showMessageDialog(null, msg);
			typo = true;
		}
		}
		msg = "Keep playing? y/n";
		answer = JOptionPane.showInputDialog(msg);
		if (answer.equalsIgnoreCase("n")||answer.equalsIgnoreCase("no")) {
			playing = false;
		}else if (answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("yes")) {
			playing = true;
			typo = true;
		}else {
			msg = "I don't know what you mean? Try again";
			JOptionPane.showMessageDialog(null, msg);
		}
		}
	msg="Alright, come play again soon!";
	JOptionPane.showMessageDialog(null, msg);
}}
