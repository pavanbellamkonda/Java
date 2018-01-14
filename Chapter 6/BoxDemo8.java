class Box7 {
	double width;
	double height;
	double depth;
	
	Box7(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume() {
		return width * height * depth;
	}
}

class BoxDemo8 {
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