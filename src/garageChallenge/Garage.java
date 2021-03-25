package garageChallenge;

import java.util.ArrayList;
import java.util.Random;

public class Garage {
	private ArrayList<Vehicle> vehiclesInGarage = new ArrayList<>();
	private Random chargePrice = new Random();
	private int garageCapacity;
	
	public Garage(int capacity) {
		this.garageCapacity = capacity;
	}
	
	public boolean isSpace() {
		if (vehiclesInGarage.size() >= 5) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void addSingleToGarage(Vehicle vehicle) {
		if (isSpace() == true) {
			this.vehiclesInGarage.add(vehicle);
			System.out.println(vehicle.getVehicleName() + " was added to the garage. Its ID is " + this.vehiclesInGarage.size() + ".");
		}
		else {
			System.out.println("Sorry, but the garage is full.");
		}
	}
	
	public void addMultipleToGarage(ArrayList<Vehicle> vehicleList) {
		for (Vehicle vehicle : vehicleList) {
			if (isSpace() == true) {
				this.vehiclesInGarage.add(vehicle);
				System.out.println(vehicle.getVehicleName() + " was added to the garage. Its ID is " + this.vehiclesInGarage.size() + ".");
			}
			else {
				System.out.println("Sorry, but the garage is full.");
			}
		}
	}
	
	public void returnGarageContents() {
		for (Vehicle vehicle : vehiclesInGarage) {
			System.out.println(vehicle.getColour() + " " + vehicle.getVehicleName());
		}
	}
	
	public int fixVehicle(Vehicle vehicle) {
		vehicle.setFixed(true);
		return calculateCharge(vehicle);
	}
	
	public int calculateCharge(Vehicle vehicle) {
		int charge;
		if (vehicle.getVehicleType() == "Car") {
			charge = 4;
		}
		else if (vehicle.getVehicleType() == "Motorbike") {
			charge = 2;
		}
		else {
			charge = 1;
		}
		
		charge = charge * this.chargePrice.nextInt(1000);
		return charge;
	}
	
	public int calculateChargeForAll(ArrayList<Vehicle> vehicles) {
		for (Vehicle vehicle : vehicles ) {
			int charge;
			if (vehicle.getVehicleType() == "Car") {
				charge = 4;
			}
			else if (vehicle.getVehicleType() == "Motorbike") {
				charge = 2;
			}
			else {
				charge = 1;
			}
			
			charge = charge * this.chargePrice.nextInt(1000);
			return charge;
		}
		return -1;
	}
	
	public void removeFromGarageByID(int index) {
		this.vehiclesInGarage.remove(index);
	}
	
	public void removeFromGaragebyType(String type) {
		for (Vehicle i : vehiclesInGarage) {
			int index = 0;
			if (i.getVehicleType() == type) {
				this.vehiclesInGarage.remove(index);
			}
			index++;
		}
	}
	
	public void emptyGarage() {
		for (int i = 0; i < vehiclesInGarage.size(); i++) {
			vehiclesInGarage.remove(i);
		}
	}
	

	public ArrayList<Vehicle> getVehiclesInGarage() {
		return vehiclesInGarage;
	}

	public void setVehiclesInGarage(ArrayList<Vehicle> vehiclesInGarage) {
		this.vehiclesInGarage = vehiclesInGarage;
	}

	public int getGarageCapacity() {
		return garageCapacity;
	}

	public void setGarageCapacity(int garageCapacity) {
		this.garageCapacity = garageCapacity;
	}
}
