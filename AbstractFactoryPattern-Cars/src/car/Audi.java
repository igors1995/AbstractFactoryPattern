package car;

import java.util.ArrayList;

import car.abstraction.Car;

public class Audi extends Car {

	public Audi(String model) {
		super(model);
		equipment = new ArrayList<>();
	}

	@Override
	public void topSpead() {
		System.out.println("Current speed is 260 km/h!");
	}

}
