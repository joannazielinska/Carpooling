package carpooling;

public class PersonInformation {
	private int age;
	private Sex sex;
	private boolean hasDriverLicense;
	private boolean hasCar;
	private Location location;
	private double ownCash;
	
	public PersonInformation(int age, Sex sex, boolean driverLicense, boolean hasCar, Location location, double cash)
	{
		this.age = age;
		this.sex = sex;
		this.hasDriverLicense = driverLicense;
		this.hasCar = hasCar;
		this.location = location;
		this.ownCash = cash;
	}
	
	public int getAge() {
		return age;
	}

	public Sex getSex() {
		return sex;
	}

	public boolean isHasDriverLicense() {
		return hasDriverLicense;
	}

	public boolean isHasCar() {
		return hasCar;
	}

	public Location getLocation() {
		return location;
	}

	public double getOwnCash() {
		return ownCash;
	}
}
