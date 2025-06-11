package Activities;

interface BicycleParts {
	int tyre = 2;
	int maxSpeed = 20;
}

interface BicycleOperations {
	void applyBrake(int decrementValue);
	void speedUp(int incrementValue);
}

class Bicycle implements BicycleOperations, BicycleParts{
	int gears;
	int currentSpeed;
	
	Bicycle(int gears, int currentSpeed){
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}

	@Override
	public void applyBrake(int decrementValue) {
		// TODO Auto-generated method stub
		System.out.println("Cycle speed decreased");
		if(currentSpeed!=0) {
			currentSpeed -= decrementValue;
		}else {
			System.out.println("Cycle stopped");
		}
	}

	@Override
	public void speedUp(int incrementValue) {
		// TODO Auto-generated method stub
		System.out.println("Cycle speed increased");
		if(currentSpeed != maxSpeed) {
			currentSpeed += incrementValue;
		}else {
			System.out.println("Cycle at max speed!");
		}
	}
	public void bicycleDesc() {
		System.out.println("Bicycle has " + gears+"gears, " + tyre+"tyres and a maxspeed of "+ maxSpeed);
	    System.out.println("Its currrent speed is: " + currentSpeed);
	}
	
}
class MountainBike extends Bicycle{
	int seatHeight;
	
	MountainBike(int gears,int currentSpeed,int seatHeight){
		super(gears, currentSpeed);
		this.seatHeight=seatHeight;
	}
	
	public void setSeatHeight(int newValue) {
		this.seatHeight=newValue;
	}
	@Override
	public void bicycleDesc() {
		System.out.println("MountainBike has " + gears + " gears, " + tyre + " tyres and a maxspeed of " + maxSpeed);
		System.out.println("Current seat height is: " + seatHeight);
		System.out.println("Current speed is: " + currentSpeed);
	}
}
public class Activity8 {
	public static void main(String[] args) {
		Bicycle mb = new MountainBike(3,0,25);
		mb.bicycleDesc();
		mb.speedUp(20);
		mb.applyBrake(5);
	}

}
