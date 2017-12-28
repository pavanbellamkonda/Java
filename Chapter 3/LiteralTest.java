class LiteralTest {
	public static void main(String args[]) {
		int o, h;
		double stand, scient;
		char ch1;
		
		//Integer Literals
		o = 0456;
		h = 0x827A;
		System.out.println("o is " + o + " h is " + h);
		
		h = 0 + h;
		System.out.println("h is now " + h);
		
		//Floating Literals
		stand = 3.1416;
		scient = 31416;
		System.out.println("stand  is " + stand + " scient  is " + scient);
		
		//Character Literals
		ch1 = 'a';
		System.out.println("ch1 is now \"" + ch1 + "\"");
		ch1 = 99;
		System.out.println("ch1 is now \"" + ch1 + "\"");
		ch1 = '\146';
		System.out.println("ch1 is now \"" + ch1 + "\"");
		ch1 = '\u0061';
		System.out.println("ch1 is now \"" + ch1 + "\"");
		
		System.out.println("hexa \u0061");
	}
}