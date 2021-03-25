package garageChallenge;

public class Motorbike extends Vehicle{
	public Motorbike(String name,String colour, boolean isFixed) {
		this.setVehicleName(name);
		this.setNumberOfWheels(2);
		this.setVehicleType("Motorbike");
		this.setColour(colour);
		this.setFixed(isFixed);
	}
}
