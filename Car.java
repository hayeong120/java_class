
public class Car {
	String color;
	String gearType;
	int door;
	
	public Car() {
		this("White","Auto",4);
		//color = "White";
		//gearType = "Auto";
		//door = 4;
	}

	public Car(String color) {
		this(color, "Auto", 4);
		//this.color = color;
		//gearType = "Auto";
		//door = 4;
	}

	public Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
	
	

}
