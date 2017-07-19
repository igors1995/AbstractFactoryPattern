package car_factory;

import car.Audi;
import car.abstraction.Car;
import car_factory.abstraction.car_factory;
import equipment.AudiSpoilers;
import equipment.AudiTires;
import equipment.abstraction.equipment;
import equipment.type_of_equipment.TypeOfEquipment;
import equipment.type_of_tires.TypeOfTires;

public class AudiFactory implements car_factory {

	@Override
	public Car createCar() {
		Audi a = new Audi("a6");
		return a;
	}

	@Override
	public equipment createEquipment(TypeOfEquipment type) {
		equipment e = null;

		if (type == TypeOfEquipment.Tires) {
			e = new AudiTires(TypeOfTires.Race);
		} else {
			if (type == TypeOfEquipment.Spoilers) {
				e = new AudiSpoilers();
			} else {
				System.out.println("We don t have this equipment!");
			}
		}
		return e;
	}

}
