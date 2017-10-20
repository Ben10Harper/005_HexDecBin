
public class RunHere {

	/* Grading requirements! */
	/*
	 * 1. Sll JOP's, remove or comment out scanner and syso
	 * 2. Runnable jar -- stand alone outside of eclipse
	 * 3. Ask for name, repeat name with friendly "Hello..."
	 * 4. Ask "What base are we starting with, hex dec or bin?"
	 * 5. ask "What base are we converting to. hex dec or bin?"
	 * 6. Enter the starting number
	 * 7. Do the conversion, display the result
	 * 8. Ask if they want to go again; if yes, start over, if no friendly exit
	 */
	
	public static void main(String[] args) {
		
		//Added hex to bin functionality (for git practice)
		BinPower binpower = new BinPower();
		binpower.setBinary();
		
		HexDecBin baseConverter = new HexDecBin();
		baseConverter.setNumber();

	}

}
