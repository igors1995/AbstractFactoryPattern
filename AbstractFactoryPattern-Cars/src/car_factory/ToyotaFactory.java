package car_factory;

import car.Totyota;
import car.abstraction.Car;
import car_factory.abstraction.car_factory;
import equipment.AudiSpoilers;
import equipment.ToyotaSpoilers;
import equipment.ToyotaTires;
import equipment.abstraction.equipment;
import equipment.type_of_equipment.TypeOfEquipment;
import equipment.type_of_tires.TypeOfTires;

public class ToyotaFactory implements car_factory {

	@Override
	public Car createCar() {
		Totyota t = new Totyota("Landcruiser");
		return t;
	}

	@Override
	public equipment createEquipment(TypeOfEquipment type) {
		equipment e = null;

		if (type == TypeOfEquipment.Tires) {
			e = new ToyotaTires(TypeOfTires.OfRoad);
		} else {
			if (type == TypeOfEquipment.Spoilers) {
				e = new ToyotaSpoilers();
			} else {
				System.out.println("We don t have this equipment!");
			}
		}
		return e;
	}

}
