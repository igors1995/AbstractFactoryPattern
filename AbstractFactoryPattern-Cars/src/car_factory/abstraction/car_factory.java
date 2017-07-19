package car_factory.abstraction;

import car.abstraction.Car;
import equipment.abstraction.equipment;
import equipment.type_of_equipment.TypeOfEquipment;

public interface car_factory {
	public Car createCar();

	public equipment createEquipment(TypeOfEquipment type);
}
