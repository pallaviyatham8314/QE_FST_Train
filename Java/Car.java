package Activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(String color,String transmission,int make) {
		this.color=color;
		this.transmission=transmission;
		this.make=make;
		this.doors=4;
		this.tyres=4;
	}
	
    public void displayCharacters() {
    	System.out.println("Color of car is:" + this.color);
    	System.out.println("Transmission of car is:" + this.transmission);
    	System.out.println("Make of car is:" + this.make);
    	System.out.println("Tyres of car is:" + this.tyres);
    	System.out.println("Doors of car is:" + this.doors);
    	
    }
    public void accelerate() {
    	System.out.println("Car moves forward");
    }
    public void brake() {
    	System.out.println("Car has Stopped");
    }
}