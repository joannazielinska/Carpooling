package carpooling;

public class PersonRequirements 
{
	private boolean smoking;
	private boolean luggage;
	private boolean pet;
	private int minimalPassagerAmount;
	private int pricePerKm;
	private int percentOfDiscount;
	public PersonRequirements(boolean smoking, boolean luggage, boolean pet, int amount, int price)
	{
		this.smoking = smoking;
		this.luggage = luggage;
		this.pet = pet;
		this.minimalPassagerAmount=amount;
		this.pricePerKm=price;
		this.percentOfDiscount=1;
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
	public int getPrice() {
		return pricePerKm;
	}
	public int getMinimalPassagerAmount() {
		return minimalPassagerAmount;
	}
	public int getDiscount(){
		return percentOfDiscount;
	}
}
