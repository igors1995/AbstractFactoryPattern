package car;

import car.abstraction.Car;

public class Totyota extends Car {

	public Totyota(String model) {
		super(model);
	}

	@Override
	public void topSpead() {
		System.out.println("Current speed is 190, and we can t go faste!");
	}
}