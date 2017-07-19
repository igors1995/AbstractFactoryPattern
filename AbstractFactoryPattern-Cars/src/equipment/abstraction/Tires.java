package equipment.abstraction;

import equipment.type_of_tires.TypeOfTires;

public abstract class Tires implements equipment {
	protected TypeOfTires type;

	public Tires(TypeOfTires type) {
		this.type = type;
	}

	@Override
	public abstract void specification();

}
