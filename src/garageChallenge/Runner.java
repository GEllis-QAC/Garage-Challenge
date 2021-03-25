package garageChallenge;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage quikFicks = new Garage(5);
		Car Ferrari = new Car("Ferrari","Red",false);
		Car Mini = new Car("Mini","Yellow",false);
		Motorbike Suzuki = new Motorbike("Suzuki","Neon-Green",false);
		Car Audi = new Car("Audi","Black",false);
		Motorbike Yamaha = new Motorbike("Yamaha","Gold", false);
		Motorbike Yamaha2 = new Motorbike("Yamaha","Gold", false);
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(Ferrari);
		vehicles.add(Mini);
		vehicles.add(Audi);
		vehicles.add(Yamaha);
		vehicles.add(Yamaha2);
		
		quikFicks.addSingleToGarage(Suzuki);
		quikFicks.addMultipleToGarage(vehicles);
		quikFicks.returnGarageContents();
		System.out.println(quikFicks.calculateCharge(Ferrari));
		System.out.println(quikFicks.calculateCharge(Audi));
		//("The charge to fix your " + vehicle.getVehicleName() + " is £" + charge + ".00");
	}

}
