package equipment;

import equipment.abstraction.Tires;
import equipment.type_of_tires.TypeOfTires;

public class ToyotaTires extends Tires {

	public ToyotaTires(TypeOfTires type) {
		super(type);
	}

	@Override
	public void specification() {
		if (type == TypeOfTires.Race) {
			System.out.println("U got race Toyota tires, now u can go faster if your engine is powered by Toyota!");
		} else {
			System.out.println("U got ofroad Toyota tires, now u can climb whenever you want if you drive Toyota!");
		}
	}

}
