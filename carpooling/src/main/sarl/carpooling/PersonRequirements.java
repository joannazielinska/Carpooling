package carpooling;

public class PersonRequirements 
{
	private boolean smoking;
	private boolean luggage;
	private boolean pet;
	
	public PersonRequirements(boolean smoking, boolean luggage, boolean pet)
	{
		this.smoking = smoking;
		this.luggage = luggage;
		this.pet = pet;
	}

	public boolean isSmoking() {
		return smoking;
	}

	public boolean isLuggage() {
		return luggage;
	}

	public boolean isPet() {
		return pet;
	}
	
	
}
