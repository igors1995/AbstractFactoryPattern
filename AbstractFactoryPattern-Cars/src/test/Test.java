package test;

import car.abstraction.Car;
import car_factory.AudiFactory;
import car_factory.ToyotaFactory;
import equipment.abstraction.equipment;
import equipment.type_of_equipment.TypeOfEquipment;

public class Test {
	public static void main(String[] args) {
		AudiFactory audiFactory = new AudiFactory();
		ToyotaFactory toyotaFactory = new ToyotaFactory();

		Car a1 = audiFactory.createCar();
		equipment e1 = audiFactory.createEquipment(TypeOfEquipment.Tires);
		equipment e2 = audiFactory.createEquipment(TypeOfEquipment.Spoilers);

		a1.addEquipment(e1);
		a1.addEquipment(e2);

		a1.topSpead();
		a1.toConsole();

		System.out.println();

		Car a2 = toyotaFactory.createCar();
		equipment e3 = toyotaFactory.createEquipment(TypeOfEquipment.Tires);
		a2.addEquipment(e3);
		a2.topSpead();

		a2.toConsole();
	}
}
