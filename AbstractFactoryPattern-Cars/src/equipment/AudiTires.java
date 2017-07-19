package equipment;

import equipment.abstraction.Tires;
import equipment.type_of_tires.TypeOfTires;

public class AudiTires extends Tires {

	public AudiTires(TypeOfTires type) {
		super(type);

	}

	@Override
	public void specification() {
		if (type == TypeOfTires.Race) {
			System.out.println("U got race Audi tires, now u can go faster if u drive Audi!");
		} else {
			System.out.println("U got ofroad Audi tires, now u can climb more if u drive Audi, ofcorse!");
		}
	}

}
