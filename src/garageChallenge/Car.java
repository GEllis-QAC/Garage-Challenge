package garageChallenge;

public class Car extends Vehicle{
	public Car(String name,String colour, boolean isFixed) {
		this.setVehicleName(name);
		this.setNumberOfWheels(4);
		this.setVehicleType("Car");
		this.setColour(colour);
		this.setFixed(isFixed);
	}
}
