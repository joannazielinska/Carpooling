package carpooling;

public class PersonInformation {
	private int age;
	private Sex sex;
	private int isDriver;
	private boolean hasCar;
	private Location location;
	private double ownCash;
	
	
	public PersonInformation(int age, Sex sex, int driver, boolean hasCar, Location location, double cash)
	{
		this.age = age;
		this.sex = sex;
		this.isDriver = driver;
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

	public int isHeDriver() {
		return isDriver;
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
