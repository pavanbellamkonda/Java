class Box7 {
	double width;
	double height;
	double depth;
	
	Box7(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	double volume() {
		return width * height * depth;
	}
}

class BoxDemo7 {
	public static void main(String args[]) {
		Box7 mybox1 = new Box7(10, 20, 30);
		Box7 mybox2 = new Box7(10, 20, 30);
		
		double vol;
		// get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);

		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	}
}