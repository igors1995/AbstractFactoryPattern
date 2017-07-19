package car.abstraction;

import java.util.ArrayList;

import equipment.abstraction.equipment;

public abstract class Car {
	protected ArrayList<equipment> equipment;
	protected String model;

	public Car(String model) {
		this.model = model;
		equipment = new ArrayList<>();
	}

	public void toConsole() {
		System.out.println(model + " equipment : ");
		for (equipment e : equipment) {
			e.specification();
		}

	}

	public void addEquipment(equipment e) {
		equipment.add(e);
	}

	public abstract void topSpead();

}
