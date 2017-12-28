class Array {
	public static void main(String args[]) {
		int month_days[] = new int[12];
		month_days[0] = 31;
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 31;
		month_days[8] = 30;
		month_days[9] = 31;
		month_days[10] = 30;
		month_days[11] = 31;
		for(int x = 0; x < 12; x++) {
			System.out.println("Number of days in month " + x + " is " + month_days[x]);
		}
		
		System.out.println("\n\n Another way:\n");
		int month_days2[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int x = 0; x < 12; x++) {
			System.out.println("Number of days in month " + x + " is " + month_days2[x]);
		}
	}
}