class Box5 {
	double width;
	double length;
	double depth;
	
	double volume() {
		return width * length * depth;
	}
	
	void setDim(double w, double l, double d) {
		width = w;
		length = l;
		depth = d;
	}
}

class BoxDemo5 {
	public static void main(String args[])
	{
		Box5 mybox1 = new Box5();
		Box5 mybox2 = new Box5();
		double vol;
		
		mybox1.setDim(10, 20, 30);
		mybox2.setDim(3, 6, 9);
		
		vol = mybox1.volume();
		System.out.println("Volume of Box 1 is " + vol);
		
		vol = mybox2.volume();
		System.out.println("Volume of Box 2 is " + vol);

	}
}
